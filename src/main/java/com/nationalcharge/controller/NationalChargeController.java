package com.nationalcharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nationalcharge.model.Location;
import com.nationalcharge.model.NationalChargePointRegistry;
import com.nationalcharge.repository.NationalChargePointRegistryRepository;

@RestController
public class NationalChargeController {
    
    @Autowired
    NationalChargePointRegistryRepository repository;
    
    @RequestMapping(value="/fetchNearestChargingStation",method=RequestMethod.POST)
    public ResponseEntity<NationalChargePointRegistry> fetchNearestChargingStation(Location location) {
        List<NationalChargePointRegistry> listNearestChargingPoint = repository.findNearestChargingPoint(location.getLatitude(),location.getLongitude());
        //return ResponseEntity.entity(listNearestChargingPoint.get(0)).status(HttpStatus.CREATED).build();
        if(listNearestChargingPoint!=null){
            return  new ResponseEntity<NationalChargePointRegistry>(listNearestChargingPoint.get(0),HttpStatus.ACCEPTED);
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    @RequestMapping(value="/insertNewChargingStation",method=RequestMethod.POST)
    public ResponseEntity<NationalChargePointRegistry> insertNewChargingStation(NationalChargePointRegistry nationalChargePointRegistry) {
        nationalChargePointRegistry = repository.save(nationalChargePointRegistry);
        if(nationalChargePointRegistry!=null){
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    
    @RequestMapping(value="/deleteChargingStation/{id}",method=RequestMethod.GET)
    public ResponseEntity<NationalChargePointRegistry> deleteChargingById(@PathVariable("id") Integer id) {
       repository.delete(id);
       return ResponseEntity.status(HttpStatus.ACCEPTED).build();

    }    

    
    
}
