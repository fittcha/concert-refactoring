package io.hhplus.concert.domain.concert.repository;

import io.hhplus.concert.infrastructure.concert.entity.Concert;
import io.hhplus.concert.infrastructure.concert.entity.ConcertDate;
import io.hhplus.concert.infrastructure.concert.entity.Seat;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConcertRepository {

    List<Concert> findAll();

    Concert findById(Long concertId);

    ConcertDate findConcertDateById(Long concertDateId);

    void addConcertDates(List<ConcertDate> concertDates);

    void addConcert(Concert concert);

    void deleteAll();

    void deleteAllDates();

    boolean existByConcertDateAndStatus(Long concertDateId, Seat.Status status);

    List<Seat> findSeatsByConcertDateIdAndStatus(Long concertDateId, Seat.Status status);

    Seat findSeatByConcertDateIdAndSeatNum(@Param("concertDateId") Long concertDateId, @Param("seatNum") int seatNum);

    void addSeats(List<Seat> seats);
}
