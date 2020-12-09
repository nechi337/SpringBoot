package com.dsi33nechi.BookEvent;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dsi33nechi.BookEvent.entites.Booking;
import com.dsi33nechi.BookEvent.repos.BookingRepository;

@SpringBootTest
class BookEventApplicationTests {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Test
	public void testCreateBooking() {
	Booking book = new Booking("Mario",4,new Date());
	bookingRepository.save(book);
	}
	
	
	
	@Test
	public void testFindBooking()
	{
	Booking b = bookingRepository.findById(1L).get();
	System.out.println(b);
	}
	
	@Test
	public void testUpdateBooking()
	{
	Booking p = bookingRepository.findById(1L).get();
	p.setNombre(5);
	bookingRepository.save(p);
	}
	
	@Test
	public void testDeleteBooking(){
		bookingRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousBookings()
	{
	List<Booking> prods = bookingRepository.findAll();
	for (Booking p : prods)
	{
	System.out.println(p);
	}
	}



}
