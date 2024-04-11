package io.hhplus.server.infra_structure.reservation;

import io.hhplus.server.domain.reservation.entity.Reservation;
import io.hhplus.server.domain.reservation.repository.ReservationJpaRepository;
import io.hhplus.server.domain.reservation.repository.ReservationRepository;
import io.hhplus.server.domain.reservation.service.dto.GetReservationAndPaymentResDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepositoryImpl implements ReservationRepository {

    private final ReservationJpaRepository reservationJpaRepository;

    public ReservationRepositoryImpl(ReservationJpaRepository reservationJpaRepository) {
        this.reservationJpaRepository = reservationJpaRepository;
    }

    @Override
    public List<Reservation> findAllByConcertDateId(Long concertDateId) {
        return reservationJpaRepository.findAllByConcertDate_ConcertDateId(concertDateId);
    }

    @Override
    public Reservation findOneByConcertDateIdAndSeatId(Long concertDateId, Long seatId) {
        return reservationJpaRepository.findOneByConcertDate_ConcertDateIdAndSeat_SeatId(concertDateId, seatId);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationJpaRepository.save(reservation);
    }

    @Override
    public Reservation findByIdAndUserId(Long reservationId, Long userId) {
        return reservationJpaRepository.findByReservationIdAndUser_UserId(reservationId, userId);
    }

    @Override
    public void delete(Reservation reservation) {
        reservationJpaRepository.delete(reservation);
    }

    @Override
    public Reservation findById(Long reservationId) {
        return reservationJpaRepository.findById(reservationId).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<GetReservationAndPaymentResDto> getMyReservations(Long userId) {
        return reservationJpaRepository.getMyReservations(userId);
    }
}
