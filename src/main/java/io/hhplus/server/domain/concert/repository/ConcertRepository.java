package io.hhplus.server.domain.concert.repository;

import io.hhplus.server.domain.concert.dto.GetSeatsQueryResDto;
import io.hhplus.server.domain.concert.entity.Concert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConcertRepository {

    List<Concert> findAll();

    Concert findById(Long concertId);

    List<GetSeatsQueryResDto> getSeatsByConcertDate(Long concertId, Long concertDateId);
}
