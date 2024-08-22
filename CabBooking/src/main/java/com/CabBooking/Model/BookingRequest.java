package com.CabBooking.Model;

public class BookingRequest {

    private Long userId;
    private Long cabId;
    private String PickupLocation;
    private String DropLocation;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCabId() {
        return cabId;
    }

    public void setCabId(Long cabId) {
        this.cabId = cabId;
    }

    public String getPickupLocation() {
        return PickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        PickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return DropLocation;
    }

    public void setDropLocation(String dropLocation) {
        DropLocation = dropLocation;
    }

    public BookingRequest(Long userId, Long cabId, String pickupLocation, String dropLocation) {
        this.userId = userId;
        this.cabId = cabId;
        PickupLocation = pickupLocation;
        DropLocation = dropLocation;
    }

    public BookingRequest(){}
    @Override
    public String toString() {
        return "BookingRequest{" +
                "userId=" + userId +
                ", cabId=" + cabId +
                ", PickupLocation='" + PickupLocation + '\'' +
                ", DropLocation='" + DropLocation + '\'' +
                '}';
    }
}
