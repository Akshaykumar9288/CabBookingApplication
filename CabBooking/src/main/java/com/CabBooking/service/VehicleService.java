package com.CabBooking.service;

import com.CabBooking.Model.Vehicle;
import com.CabBooking.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository cabRepository;

    public List<Vehicle> getAllCabs(){
        return cabRepository.findAll();
    }

    public Vehicle getById(Long id){
        return cabRepository.findById(id).orElse(null);
    }

    public Vehicle createCab(Vehicle cab){
        return cabRepository.save(cab);
    }

//    public Vehicle updateCab(Long id, Vehicle cabDetails){
//        Vehicle cab = getById(id);
//        if (cab!=null){
//            cab.setLicensePlate(cabDetails.getLicensePlate());
//            cab.setModel(cabDetails.getModel());
//            cab.setDriverName(cabDetails.getDriverName());
//            return cabRepository.save(cab);
//        }
//        return null;
//    }

    public void deleteCab(Long id){
        cabRepository.deleteById(id);
    }
}
