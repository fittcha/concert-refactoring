package io.hhplus.server.domain.reservation.repository;

import io.hhplus.server.domain.reservation.entity.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository {

    List<Reservation> findAllByConcertDateId(Long concertDateId);

    Reservation findOneByConcertDateIdAndSeatId(Long concertDateId, Long seatId);

    Reservation save(Reservation reservation);

    Reservation findByIdAndUserId(Long reservationId, Long userId);

    void delete(Reservation reservation);
}
