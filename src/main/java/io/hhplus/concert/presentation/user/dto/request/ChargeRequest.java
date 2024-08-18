package io.hhplus.concert.presentation.user.dto.request;

import jakarta.validation.constraints.Positive;

public record ChargeRequest(
        @Positive int amount
) {
}
