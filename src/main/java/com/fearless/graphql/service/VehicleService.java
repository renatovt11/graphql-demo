package com.fearless.graphql.service;

import com.fearless.graphql.dao.entity.Vehicle;
import com.fearless.graphql.dao.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle createVehicle(String type, String modelCode, String brandName, Date launchDate) {
        Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(launchDate);
        return this.vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return this.vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicle(int id) {
        return this.vehicleRepository.findById(id);
    }

}
