package com.CabBooking.service;

import com.CabBooking.Model.Booking;
import com.CabBooking.Model.Vehicle;
import com.CabBooking.Model.User;
import com.CabBooking.repository.BookingRepository;
import com.CabBooking.repository.VehicleRepository;
import com.CabBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VehicleRepository cabRepository;

    public Booking createBooking(Long userId, Long cabId, String PickupLocation, String DropLocation){
        User user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User Not Found"));
        Vehicle cab = cabRepository.findById(cabId).orElseThrow(()-> new RuntimeException("Cab Not Found"));

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setCab(cab);
        booking.setPickupLocation(PickupLocation);
        booking.setDropLocation(DropLocation);
        booking.setPickupTime(LocalDateTime.now());

        return bookingRepository.save(booking);
    }
}
