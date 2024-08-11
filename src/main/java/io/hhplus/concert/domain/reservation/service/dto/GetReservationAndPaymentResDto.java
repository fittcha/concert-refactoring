package io.hhplus.concert.domain.reservation.service.dto;

import io.hhplus.concert.infrastructure.concert.entity.Concert;
import io.hhplus.concert.infrastructure.concert.entity.ConcertDate;
import io.hhplus.concert.infrastructure.concert.entity.Seat;
import io.hhplus.concert.infrastructure.reservation.entity.Reservation;

public record GetReservationAndPaymentResDto(
        Reservation reservation,
        Concert concert,
        ConcertDate concertDate,
        Seat seat
) {
}
