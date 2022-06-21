package com.shubham.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
