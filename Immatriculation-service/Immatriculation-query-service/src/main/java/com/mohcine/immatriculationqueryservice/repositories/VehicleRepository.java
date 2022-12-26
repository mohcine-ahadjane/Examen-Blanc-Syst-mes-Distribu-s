package com.mohcine.immatriculationqueryservice.repositories;

import com.mohcine.immatriculationqueryservice.entities.Vehicle;
import com.mohcine.immatriculationqueryservice.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findVehicleByOwner(VehicleOwner vehicleOwner);
}
