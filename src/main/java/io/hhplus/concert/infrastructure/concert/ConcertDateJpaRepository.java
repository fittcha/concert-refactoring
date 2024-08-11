package io.hhplus.concert.infrastructure.concert;

import io.hhplus.concert.infrastructure.concert.entity.ConcertDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertDateJpaRepository extends JpaRepository<ConcertDate, Long> {
}
