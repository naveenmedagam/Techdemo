package com.aws.techdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aws.techdemo.entity.Property;
import com.aws.techdemo.model.PropertyDetail;
import com.aws.techdemo.model.ListProperty;
import com.aws.techdemo.model.PropertyDataResponse;
import com.aws.techdemo.repository.ProperetyRepository;

import javassist.NotFoundException;

@Service
public class PropertyService {

	@Autowired
	private ProperetyRepository propertyRepository;

	public PropertyDataResponse getAllProperties(Pageable pageable, String districtName) {
		List<ListProperty> propertiesData = new ArrayList<>();
		PropertyDataResponse propertyDataResponse = new PropertyDataResponse();
		Page<Property> properties = null;
		if(districtName == null||districtName.isEmpty() ) {
		 properties = propertyRepository.findAll(pageable);
			propertyDataResponse.setTotalRecords(propertyRepository.propertiesCount());

		}
		else {
			properties = propertyRepository.findPropertiesByDistrictName(districtName, pageable);
			propertyDataResponse.setTotalRecords(propertyRepository.propertiesCountbyDistrictName(districtName));

		}
		for (Property property : properties) {
			propertiesData.add(populateListPropertyData(property));
		}
		propertyDataResponse.setPropertiesData(propertiesData);
		return propertyDataResponse;
	}

	public PropertyDetail findBypropertyId(int id) throws NotFoundException {

		return propertyRepository.findById(id).map(m -> populateDetailsPropertyData(m))
				.orElseThrow(() -> new NotFoundException("Property not found with id " + id));
	}

	private ListProperty populateListPropertyData(Property property) {
		ListProperty pd = new ListProperty();

		pd.setPropertyId(property.getPropertyId());
		pd.setPrice(property.getPrice());
		pd.setPriceInEur(property.getPriceInEur());
		pd.setAddress(property.getAddress());
		if (property.getDistrict() != null &&  property.getDistrict().getDistrictNameBg()!=null)
			pd.setAddress(property.getAddress() + "," + property.getDistrict().getDistrictNameBg());
		pd.setBuildUpArea(property.getArea());
		pd.setPublishedDate(property.getPublishedDate());
		pd.setLat(property.getLat());
		pd.setLon(property.getLon());
		if (property.getBailiff() != null)
			pd.setListingAgent(property.getBailiff().getPrivateBailiffNameBg());
		if (property.getPropertType() != null)
			pd.setPropertyType(property.getPropertType().getPropertyTypeNameBg());
		return pd;
	}

	private PropertyDetail populateDetailsPropertyData(Property property) {
		PropertyDetail pd = new PropertyDetail();

		pd.setPropertyId(property.getPropertyId());
		pd.setPrice(property.getPrice());
		pd.setPriceInEur(property.getPriceInEur());
		pd.setAddress(property.getAddress());
		String districtNameBg = "";
		if(property.getDistrict() != null) {
			districtNameBg = property.getDistrict().getDistrictNameBg();
		}
		pd.setAddress(property.getAddress() + "," + districtNameBg);
		pd.setBuildUpArea(property.getArea());
		pd.setPublishedDate(property.getPublishedDate());
		pd.setDescription(property.getDescription());
		pd.setLat(property.getLat());
		pd.setLon(property.getLon());
		if (property.getBailiff() != null) {
			pd.setListingAgent(property.getBailiff().getPrivateBailiffNameBg());
		}
		if (property.getPropertType() != null) {
			pd.setPropertyType(property.getPropertType().getPropertyTypeNameBg());
		}
		pd.setExtras(property.getExtras());
		pd.setAnnouncementDate(property.getAnnouncementDate());
		pd.setTerm(property.getTerm());
		pd.setPropertyFloor(property.getPropertyFloor());
		pd.setMapsCoorinateUrl(property.getMapsCoorinateUrl());
		return pd;
	}

}
