package com.nationalcharge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.nationalcharge.model.NationalChargePointRegistry;

@Component
public interface NationalChargePointRegistryRepository extends CrudRepository<NationalChargePointRegistry, Integer> {

    @Query(value="SELECT min(sqrt((((latitude-:latitude)*(latitude-:latitude))+((longitude-:longitude)*(longitude-:longitude))))) as minDistance, a.* FROM world.national_charge_point_registry a", nativeQuery = true)
    List<NationalChargePointRegistry> findNearestChargingPoint(@Param("latitude") double latitude,@Param("longitude")double longitude);
}
