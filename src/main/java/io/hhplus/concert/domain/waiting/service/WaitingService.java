package io.hhplus.concert.domain.waiting.service;

import io.hhplus.concert.base.jwt.JwtService;
import io.hhplus.concert.base.redis.service.RedisZSetService;
import io.hhplus.concert.controller.waiting.dto.response.CheckWaitingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WaitingService implements WaitingInterface {

    private final RedisZSetService redisZSetService;
    private final JwtService jwtService;

    @Override
    public String issueToken(Long userId) {
        return jwtService.createToken(userId);
    }

    @Override
    @Transactional
    public CheckWaitingResponse checkWaiting(Long userId, String reqToken) {
        return null;
    }

    private CheckWaitingResponse getInWaiting(String token) {
        return null;
    }

    private CheckWaitingResponse getInActive(String token) {
        return null;
    }
}
