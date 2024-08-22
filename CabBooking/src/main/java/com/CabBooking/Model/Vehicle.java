package com.CabBooking.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "VehicleNumber is Required")
    private String VehicleNumber;
    @NotBlank(message = "model is required")
    private String model;
    @OneToOne
    @JoinColumn(name = "driver_id" , nullable = false)
    @JsonBackReference
    private DriverDetails driverDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DriverDetails getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(DriverDetails driverDetails) {
        this.driverDetails = driverDetails;
    }

    public Vehicle(Long id, String vehicleNumber, String model, DriverDetails driverDetails) {
        this.id = id;
        VehicleNumber = vehicleNumber;
        this.model = model;
        this.driverDetails = driverDetails;
    }

    public Vehicle(){}

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", VehicleNumber='" + VehicleNumber + '\'' +
                ", model='" + model + '\'' +
                ", driverDetails=" + driverDetails +
                '}';
    }
}
