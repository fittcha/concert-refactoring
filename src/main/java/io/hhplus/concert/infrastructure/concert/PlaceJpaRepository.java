package io.hhplus.concert.infrastructure.concert;

import io.hhplus.concert.infrastructure.concert.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceJpaRepository extends JpaRepository<Place, Long> {
}
