package com.nestDigital.flightBackend.dao;

import com.nestDigital.flightBackend.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDAO extends CrudRepository<FlightModel,Integer> {
}
