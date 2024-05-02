package io.hhplus.server.controller.reservation.dto.request;

import io.hhplus.server.domain.concert.service.ConcertReader;
import io.hhplus.server.domain.reservation.entity.Reservation;
import io.hhplus.server.domain.user.service.UserReader;
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
