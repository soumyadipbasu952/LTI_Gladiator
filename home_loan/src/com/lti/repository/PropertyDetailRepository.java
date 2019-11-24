package com.lti.repository;

import org.springframework.transaction.annotation.Transactional;

import com.lti.model.PropertyDetail;

public interface PropertyDetailRepository {

	PropertyDetail addProperty(PropertyDetail pd);

}