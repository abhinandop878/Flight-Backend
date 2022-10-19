package com.nestDigital.flightBackend.controller;

import com.nestDigital.flightBackend.dao.FlightDAO;
import com.nestDigital.flightBackend.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFlights",consumes = "application/json",produces = "application/json")
    public String addFlight(@RequestBody FlightModel flights){
        dao.save(flights);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewFlights")
    public List<FlightModel> viewFlight(){
        return (List<FlightModel>)dao.findAll();
    }
}
