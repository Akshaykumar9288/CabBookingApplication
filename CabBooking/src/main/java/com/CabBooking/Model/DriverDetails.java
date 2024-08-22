package com.CabBooking.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class DriverDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String licenseNumber;
    @OneToOne(mappedBy = "driverDetails", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Vehicle vehicle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public DriverDetails(Long id, String name, String licenseNumber, Vehicle vehicle) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicle = vehicle;
    }

    public DriverDetails(){}

    @Override
    public String toString() {
        return "DriverDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
