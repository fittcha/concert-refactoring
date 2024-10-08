package io.hhplus.concert.presentation.payment.dto.request;

import io.hhplus.concert.infrastructure.payment.entity.Payment;
import io.hhplus.concert.infrastructure.reservation.entity.Reservation;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CreateRequest(
        @NotNull Long reservationId,
        @NotNull BigDecimal price
) {

    public Payment toEntity(Reservation reservation) {
        return Payment.builder()
                .reservation(reservation)
                .status(Payment.Status.READY)
                .price(price)
                .build();
    }
}
