package io.hhplus.concert.presentation.reservation.dto.request;

import jakarta.validation.constraints.NotNull;

public record CancelRequest(
        @NotNull Long userId
) {
}
