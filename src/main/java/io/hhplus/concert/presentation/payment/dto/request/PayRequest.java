package io.hhplus.concert.presentation.payment.dto.request;

import jakarta.validation.constraints.NotNull;

public record PayRequest(
        @NotNull Long userId
) {
}
