package com.udacity.pricing.repository;

import com.udacity.pricing.entity.Price;
import org.springframework.data.repository.CrudRepository;

public interface PricingRepository extends CrudRepository<Price, Long >{
}
