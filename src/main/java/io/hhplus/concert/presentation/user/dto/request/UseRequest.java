package io.hhplus.concert.presentation.user.dto.request;

import jakarta.validation.constraints.Positive;

public record UseRequest(
        @Positive int amount
) {
}
