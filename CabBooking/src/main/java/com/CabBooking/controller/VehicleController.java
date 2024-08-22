package com.CabBooking.controller;

import com.CabBooking.Model.Vehicle;
import com.CabBooking.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
    @GetMapping("/getAllVehicle")
    public List<Vehicle> findAllCab(){
        return vehicleService.getAllCabs();
    }

    @GetMapping("/getById/{id}")
    public Vehicle findById(@RequestParam("id") Long id){
        return vehicleService.getById(id);
    }

    @PostMapping("/addVehicle")
    public Vehicle AddCab(@RequestBody Vehicle cab){
        return vehicleService.createCab(cab);
    }

//    @PostMapping("/updateCab/{id}")
//    public Vehicle updatecab(@RequestParam("id") Long id, Vehicle cabDetails){
//        return cabService.updateCab(id,cabDetails);
//    }
}
