package io.hhplus.concert.domain.reservation.service.dto;

import io.hhplus.concert.infrastructure.reservation.entity.Reservation;

public record SendReservationInfoDto(
        Long reservationId,
        Reservation.Status reservationStatus
) {
}
