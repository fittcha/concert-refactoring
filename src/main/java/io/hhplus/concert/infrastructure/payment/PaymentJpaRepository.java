package io.hhplus.concert.infrastructure.payment;

import io.hhplus.concert.infrastructure.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentJpaRepository extends JpaRepository<Payment, Long> {

    Payment findByReservation_ReservationId(Long reservationId);
}
