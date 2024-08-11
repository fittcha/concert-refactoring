package io.hhplus.concert.domain.payment.service;

import io.hhplus.concert.controller.payment.dto.request.CreateRequest;
import io.hhplus.concert.controller.payment.dto.request.PayRequest;
import io.hhplus.concert.controller.payment.dto.response.CreateResponse;
import io.hhplus.concert.controller.payment.dto.response.PayResponse;
import io.hhplus.concert.domain.payment.repository.PaymentRepository;
import io.hhplus.concert.domain.payment.service.dto.CancelPaymentResultResDto;
import io.hhplus.concert.domain.reservation.service.ReservationReader;
import io.hhplus.concert.domain.user.service.UserReader;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PaymentService implements PaymentInterface {

    private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
    private final PaymentRepository paymentRepository;
    private final UserReader userReader;
    private final ReservationReader reservationReader;

    @Override
    @Transactional
    public PayResponse pay(Long paymentId, PayRequest request) {
        return null;
    }

    @Override
    @Transactional
    public CreateResponse create(CreateRequest request) {
        return null;
    }

    @Override
    @Transactional
    public CancelPaymentResultResDto cancel(Long paymentId) {
        return null;
    }

    @Transactional
    @Retryable(value = RuntimeException.class, maxAttempts = 3, backoff = @Backoff(delay = 2000))
    public void refundReservationCancelled(Long reservationId) {
    }

    @Recover
    public void recoverRefund(RuntimeException e, Long reservationId) {
        log.error("All the reservationCancelledEvent retries failed. reservationId: {}, error: {}", reservationId, e.getMessage());
    }
}
