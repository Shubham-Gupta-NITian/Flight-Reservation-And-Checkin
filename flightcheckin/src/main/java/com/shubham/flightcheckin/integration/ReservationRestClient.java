package com.shubham.flightcheckin.integration;

import com.shubham.flightcheckin.integration.dto.Reservation;
import com.shubham.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);
}
