package com.CabBooking.controller;


import com.CabBooking.Model.Booking;
import com.CabBooking.Model.BookingRequest;
import com.CabBooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("BookCab")
    public ResponseEntity<Booking> bookCab(@RequestBody BookingRequest request){
        Booking booking = bookingService.createBooking(request.getUserId(),request.getCabId(),request.getPickupLocation(),request.getDropLocation());
        return ResponseEntity.ok(booking);
    }
}
