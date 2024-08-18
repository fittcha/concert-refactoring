package io.hhplus.concert.presentation.waiting.dto.request;

public record CheckWaitingRequest(
        Long userId,
        String token
) {
}
