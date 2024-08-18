package io.hhplus.concert.presentation.user.dto.response;

import io.hhplus.concert.infrastructure.user.entity.Users;

import java.math.BigDecimal;

public record GetBalanceResponse(
        Long userId,
        BigDecimal balance
) {
    public static GetBalanceResponse from(Users users) {
        return new GetBalanceResponse(users.getUserId(), users.getBalance());
    }
}
