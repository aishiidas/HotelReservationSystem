package org.anudip.HotelReservationSystem.dao;

import org.anudip.HotelReservationSystem.bean.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationRepository extends JpaRepository<Accommodation, String> {
	

}