package com.fearless.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.fearless.graphql.dao.entity.Vehicle;
import com.fearless.graphql.service.VehicleService;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    private VehicleService vehicleService;

    public VehicleMutation(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle createVehicle(String type, String modelCode, String brandName, Date launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

}
