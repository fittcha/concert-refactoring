package io.hhplus.concert.domain.reservation.service;

import io.hhplus.concert.base.redis.RedissonLock;
import io.hhplus.concert.controller.reservation.dto.request.CancelRequest;
import io.hhplus.concert.controller.reservation.dto.request.ReserveRequest;
import io.hhplus.concert.controller.reservation.dto.response.ReserveResponse;
import io.hhplus.concert.controller.user.dto.response.GetMyReservationsResponse;
import io.hhplus.concert.domain.concert.service.ConcertReader;
import io.hhplus.concert.domain.concert.service.ConcertService;
import io.hhplus.concert.domain.payment.service.PaymentService;
import io.hhplus.concert.domain.reservation.repository.ReservationRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService implements ReservationInterface {

    private final ReservationRepository reservationRepository;
    private final ReservationMonitor reservationMonitor;
    private final ConcertReader concertReader;
    private final ConcertService concertService;
    private final PaymentService paymentService;
    private final ApplicationEventPublisher eventPublisher;

    @PostConstruct
    public void init() {
        reservationMonitor.reservationMonitoring();
    }

    @Override
    @Transactional
    @RedissonLock(key = "'reserveLock'.concat(':').concat(#request.concertDateId()).concat('-').concat(#request.seatNum())")
    public ReserveResponse reserve(ReserveRequest request) {
        return null;
    }

    @Override
    @Transactional
    public void cancel(Long reservationId, CancelRequest request) {

    }

    @Override
    public List<GetMyReservationsResponse> getMyReservations(Long userId) {
        return new ArrayList<>();
    }
}
