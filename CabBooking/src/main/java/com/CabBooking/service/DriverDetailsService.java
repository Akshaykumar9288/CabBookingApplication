package com.CabBooking.service;

import com.CabBooking.Model.DriverDetails;
import com.CabBooking.Model.Vehicle;
import com.CabBooking.repository.DriverDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverDetailsService {

    @Autowired
    private DriverDetailsRepository driverDetailsRepository;

    public DriverDetails createDriver(DriverDetails driverDetails){

        Vehicle vehicle = driverDetails.getVehicle();
        if (vehicle != null){
            vehicle.setDriverDetails(driverDetails);
        }
        return driverDetailsRepository.save(driverDetails);
    }
}
