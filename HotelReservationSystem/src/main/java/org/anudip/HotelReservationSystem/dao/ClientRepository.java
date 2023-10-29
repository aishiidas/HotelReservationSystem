package org.anudip.HotelReservationSystem.dao;

import org.anudip.HotelReservationSystem.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
