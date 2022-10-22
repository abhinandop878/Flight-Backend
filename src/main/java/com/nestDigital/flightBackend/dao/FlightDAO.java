package com.nestDigital.flightBackend.dao;

import com.nestDigital.flightBackend.model.FlightModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightDAO extends CrudRepository<FlightModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `flights` WHERE `id`=:id",nativeQuery = true)
    void deleteFlightById(Integer id);
    @Query(value = "SELECT * FROM `flights` WHERE `flight_name`=:name",nativeQuery = true)
    List<FlightModel>searchFlightByName(String name);
}
