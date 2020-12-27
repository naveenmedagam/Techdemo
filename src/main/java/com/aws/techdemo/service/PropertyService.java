package com.aws.techdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.techdemo.entity.Property;
import com.aws.techdemo.model.PropertyData;
import com.aws.techdemo.model.PropertyDataResponse;
import com.aws.techdemo.repository.ProperetyRepository;

@Service
public class PropertyService {
	
	@Autowired
	private ProperetyRepository propertyRepository;
	
	
  public PropertyDataResponse getAllProperties(int offset,int limit){
	  List<PropertyData> propertiesData = new ArrayList<>();
	  PropertyDataResponse propertyDataResponse = new PropertyDataResponse();
	  
	 List<Property> properties = propertyRepository.findAllProperties(offset, limit);
           for(Property property: properties) {
        	   
        	   propertiesData.add(populateAndAddPropertyData(property));
        	   
           } 
           
           propertyDataResponse.setTotalRecords(propertyRepository.propertiesCount());
           propertyDataResponse.setPropertiesData(propertiesData);
	  return propertyDataResponse;
  }
  
  public PropertyData findByProductId(int id) {
	  
	  Optional<Property> p = propertyRepository.findById(id);
	  if(p.isPresent()) {
		  return populateAndAddPropertyData(p.get());
	  }
	  return null;
  }


private PropertyData populateAndAddPropertyData(Property property) {
	  PropertyData pd = new PropertyData();
	 
	  pd.setPropertyId(property.getPropertyId());
	  pd.setPrice(property.getPrice());
	  pd.setPriceInEur(property.getPriceInEur());
	  pd.setAddress(property.getAddress());
	  if( property.getDistrict()!=null)
	  pd.setAddress(property.getAddress() +","+ property.getDistrict() == null ? "" : property.getDistrict().getDistrictNameBg());
	  pd.setBuildUpArea(property.getArea());
	  pd.setPublishedDate(property.getPublishedDate());
	  pd.setDescription(property.getDescription());
	  pd.setLat(property.getLat());
	  pd.setLon(property.getLon());
	  if(property.getBailiff()!=null)
	  pd.setListingAgent(property.getBailiff().getPrivateBailiffNameEng());
	  if(property.getPropertType()!=null)
	  pd.setPropertyType(property.getPropertType().getPropertyTypeNameBg());
	  return pd;
}
	
}
