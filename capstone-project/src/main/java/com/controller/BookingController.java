package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Booking;
import com.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/api/bookings")
	public Booking bookTickets(@RequestBody Booking booking) {
		return bookingService.bookTickets(booking);
	}
	
	@GetMapping("/api/bookings")
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@DeleteMapping("/api/bookings/{id}")
	public String cancelBooking(@PathVariable Long id) {
		bookingService.cancelBooking(id);
		return "Booking cancelled successfully";
	}
}
