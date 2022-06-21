package com.shubham.flightreservation.services;

import com.shubham.flightreservation.dto.ReservationRequest;
import com.shubham.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
}
