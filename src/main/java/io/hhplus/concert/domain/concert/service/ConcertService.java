package io.hhplus.concert.domain.concert.service;

import io.hhplus.concert.presentation.concert.dto.response.GetConcertResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetConcertsResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetDatesResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetSeatsResponse;
import io.hhplus.concert.domain.concert.repository.ConcertRepository;
import io.hhplus.concert.infrastructure.concert.entity.Seat;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConcertService implements ConcertInterface {

    private final ConcertRepository concertRepository;

    @Override
    public List<GetConcertsResponse> getConcerts() {
        return new ArrayList<>();
    }

    @Override
    public GetConcertResponse getConcert(Long concertId) {
        return null;
    }

    @Override
    public GetDatesResponse getDates(Long concertId) {
        return null;
    }

    @Override
    public GetSeatsResponse getAvailableSeats(Long concertDateId) {
        return null;
    }

    @Override
    @Transactional
    public void patchSeatStatus(Long concertDateId, int seatNum, Seat.Status status) {;
    }
}
