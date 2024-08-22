package com.CabBooking.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime pickupTime;
    private String pickupLocation;
    private String dropLocation;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle cab;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getCab() {
        return cab;
    }

    public void setCab(Vehicle cab) {
        this.cab = cab;
    }

    public Booking(Long id, LocalDateTime pickupTime, String pickupLocation, String dropLocation, User user, Vehicle cab) {
        this.id = id;
        this.pickupTime = pickupTime;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.user = user;
        this.cab = cab;
    }

    public Booking(){}
    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", pickupTime=" + pickupTime +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropLocation='" + dropLocation + '\'' +
                ", user=" + user +
                ", cab=" + cab +
                '}';
    }
}
