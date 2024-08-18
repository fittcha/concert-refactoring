package io.hhplus.concert.domain.user.service;

import io.hhplus.concert.base.redis.RedissonLock;
import io.hhplus.concert.presentation.user.dto.request.ChargeRequest;
import io.hhplus.concert.presentation.user.dto.request.UseRequest;
import io.hhplus.concert.presentation.user.dto.response.GetBalanceResponse;
import io.hhplus.concert.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService implements UserInterface {

    private final UserRepository userRepository;

    @Override
    public GetBalanceResponse getBalance(Long userId) {
        return null;
    }

    @Override
    @Transactional
    @RedissonLock(key = "'userLock'.concat(':').concat(#userId)")
    public GetBalanceResponse charge(Long userId, ChargeRequest request) {
        return null;
    }

    @Override
    @Transactional
    @RedissonLock(key = "'userLock'.concat(':').concat(#userId)")
    public GetBalanceResponse use(Long userId, UseRequest request) {
        return null;
    }
}
