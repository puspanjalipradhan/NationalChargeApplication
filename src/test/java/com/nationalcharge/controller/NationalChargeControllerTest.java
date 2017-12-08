package com.nationalcharge.controller;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nationalcharge.model.Location;
import com.nationalcharge.model.NationalChargePointRegistry;
import com.nationalcharge.repository.NationalChargePointRegistryRepository;


@RunWith(MockitoJUnitRunner.class)
public class NationalChargeControllerTest {
    
    @Mock
    NationalChargePointRegistryRepository repository;
    
    @InjectMocks
    NationalChargeController nationalChargeController;
    
    Location location = null;
    
    @Before
    public void setUp(){
        location = new Location(10,10);
    }
    
    @Test
    public void testFetchNearestChargingStationWithValidResults(){
        List<NationalChargePointRegistry> nationalChargePointRegistry = new ArrayList<NationalChargePointRegistry>();
        nationalChargePointRegistry.add(new NationalChargePointRegistry());
        when(repository.findNearestChargingPoint(location.getLatitude(),location.getLatitude())).thenReturn(nationalChargePointRegistry);
        ResponseEntity<NationalChargePointRegistry> response = nationalChargeController.fetchNearestChargingStation(location);
        assertTrue(response.getStatusCode().equals(HttpStatus.ACCEPTED));
    }
    
    @Test
    public void testFetchNearestChargingStationWithNoValidResults(){
        List<NationalChargePointRegistry> nationalChargePointRegistry = new ArrayList<NationalChargePointRegistry>();
        when(repository.findNearestChargingPoint(location.getLatitude(),location.getLatitude())).thenReturn(nationalChargePointRegistry);
        ResponseEntity<NationalChargePointRegistry> response = nationalChargeController.fetchNearestChargingStation(location);
        assertTrue(response.getStatusCode().equals(HttpStatus.BAD_REQUEST));
    }    
}
