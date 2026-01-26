package com.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Booking;
import com.entity.Show;
import com.repository.BookingRepository;
import com.repository.ShowRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	ShowRepository showRepository;	
	
	public Booking bookTickets(Booking booking) {
		Optional<Show> optionalShow = showRepository.findById(booking.getShow().getShowId());
		if(!optionalShow.isPresent()) {
			throw new RuntimeException("Show not found");
		}
		
		Show show = optionalShow.get();
		if(booking.getSeatsBooked() <= 0) {
			throw new RuntimeException("Seats must be greater than zero");
		}
		if(booking.getSeatsBooked() > show.getAvailableSeats()) {
			throw new RuntimeException("Not enough seats available");
		}
		
		show.setAvailableSeats(show.getAvailableSeats()-booking.getSeatsBooked());
		
		showRepository.save(show);
		booking.setBookingDate(LocalDate.now());
		return bookingRepository.save(booking);
	}
	
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	}
	
	public void cancelBooking(Long bookingId) {
		Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
		if(!optionalBooking.isPresent()) {
			throw new RuntimeException("Booking not found");
		}
		Booking booking = optionalBooking.get();
		Show show = booking.getShow();
		show.setAvailableSeats(show.getAvailableSeats()+booking.getSeatsBooked());
		
		showRepository.save(show);
		bookingRepository.deleteById(bookingId);
	}
}
