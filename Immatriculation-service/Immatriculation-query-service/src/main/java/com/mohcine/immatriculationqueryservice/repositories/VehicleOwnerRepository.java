package com.mohcine.immatriculationqueryservice.repositories;


import com.mohcine.immatriculationqueryservice.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, String> {
    VehicleOwner findByOwnerNationalIdCard(String nationalIdCard );
}
