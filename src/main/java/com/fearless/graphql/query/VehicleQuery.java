package com.fearless.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.fearless.graphql.dao.entity.Vehicle;
import com.fearless.graphql.service.VehicleService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    private final VehicleService vehicleService;

    public VehicleQuery(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public List<Vehicle> getVehicles() {
        return this.vehicleService.getAllVehicles();
    }
    public Optional<Vehicle> getVehicle(int id) {
        return this.vehicleService.getVehicle(id);
    }

}
