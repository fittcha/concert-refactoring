package io.hhplus.concert.application.concert;

import io.hhplus.concert.domain.concert.service.ConcertService;
import io.hhplus.concert.presentation.concert.dto.response.GetConcertResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetConcertsResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetDatesResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetSeatsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConcertFacade {

    private final ConcertService concertService;

    public List<GetConcertsResponse> getConcerts() {
        return concertService.getConcerts();
    }

    public GetConcertResponse getConcert(Long concertId) {
        return concertService.getConcert(concertId);
    }

    public GetDatesResponse getDates(Long concertId) {
        return concertService.getDates(concertId);
    }

    public GetSeatsResponse getAvailableSeats(Long concertDateId) {
        return concertService.getAvailableSeats(concertDateId);
    }
}
