package com.BIkkadIT.TicketBookingApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BIkkadIT.TicketBookingApi.model.Passenger;
import com.BIkkadIT.TicketBookingApi.model.Ticket;

@RestController
public class TicketController {

	@PostMapping(value="/bookTicket")
	public  ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg){
		System.out.println(psg);
		if(psg != null) {
			
			Ticket t = new Ticket();
			t.setPnr("76789");
			t.setTicketPrice(125.00);
			t.setTicketStatus("CONFIRMED");
			
			return new ResponseEntity<Ticket>(t,HttpStatus.CREATED);
		}
		
		return null;
	}
}
