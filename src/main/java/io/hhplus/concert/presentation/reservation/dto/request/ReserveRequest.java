package io.hhplus.concert.presentation.reservation.dto.request;

import io.hhplus.concert.infrastructure.reservation.entity.Reservation;
import jakarta.validation.constraints.NotNull;

public record ReserveRequest(
        @NotNull Long concertId,
        @NotNull Long concertDateId,
        @NotNull int seatNum,
        @NotNull Long userId
) {

    public Reservation toEntity() {
        return Reservation.builder()
                .concertId(concertId)
                .concertDateId(concertDateId)
                .seatNum(seatNum)
                .userId(userId)
                .status(Reservation.Status.ING)
                .build();
    }
}
