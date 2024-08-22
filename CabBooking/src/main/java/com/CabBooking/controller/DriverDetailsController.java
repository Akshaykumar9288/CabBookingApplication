package com.CabBooking.controller;

import com.CabBooking.Model.DriverDetails;
import com.CabBooking.service.DriverDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverDetailsController {

    @Autowired
    private DriverDetailsService driverDetailsService;

    @PostMapping("/addDriver")
    public DriverDetails addDriver(@RequestBody DriverDetails driverDetails){
        return driverDetailsService.createDriver(driverDetails);
    }
}
