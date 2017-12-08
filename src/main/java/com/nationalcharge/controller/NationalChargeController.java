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
@RequestMapping(value="/chargingstation")
public class NationalChargeController {
    
    private static final String DELETION_WAS_SUCCESSFUL = "Deletion was successful";
    private static final String THE_INSERTION_FAILED = "The insertion failed";
    private static final String THE_INSERTION_IS_DONE_SUCCESSFULLY = "The insertion is done successfully";
    @Autowired
    NationalChargePointRegistryRepository repository;
    
    @RequestMapping(value="/fetchNearestChargingStation",method=RequestMethod.POST)
    public ResponseEntity<NationalChargePointRegistry> fetchNearestChargingStation(Location location) {
        List<NationalChargePointRegistry> listNearestChargingPoint = repository.findNearestChargingPoint(location.getLatitude(),location.getLongitude());
        if(listNearestChargingPoint!=null && listNearestChargingPoint.size()>=1){
            return  new ResponseEntity<NationalChargePointRegistry>(listNearestChargingPoint.get(0),HttpStatus.ACCEPTED);
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    
    @RequestMapping(value="/insertNewChargingStation",method=RequestMethod.POST)
    public ResponseEntity<String> insertNewChargingStation(NationalChargePointRegistry nationalChargePointRegistry) {
        nationalChargePointRegistry = repository.save(nationalChargePointRegistry);
        if(nationalChargePointRegistry!=null){
            return  new ResponseEntity<String>(THE_INSERTION_IS_DONE_SUCCESSFULLY,HttpStatus.ACCEPTED);
        }else{
            return  new ResponseEntity<String>(THE_INSERTION_FAILED,HttpStatus.BAD_REQUEST);

        }

    }
    
    
    @RequestMapping(value="/deleteChargingStation/{id}",method=RequestMethod.GET)
    public ResponseEntity<String> deleteChargingById(@PathVariable("id") Integer id) {
       repository.delete(id);
       return new ResponseEntity<String>(DELETION_WAS_SUCCESSFUL,HttpStatus.BAD_REQUEST);
    }    

    
    
}
