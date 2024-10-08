package io.hhplus.concert.presentation.concert.dto.response;

import io.hhplus.concert.infrastructure.concert.entity.ConcertDate;

import java.time.ZonedDateTime;
import java.util.List;

public record GetDatesResponse(
        List<DateInfo> dates
) {

    public record DateInfo(
            Long concertDateId,
            ZonedDateTime date,
            boolean available
    ) {
        public static DateInfo from(ConcertDate concertDate, boolean available) {
            return new DateInfo(concertDate.getConcertDateId(), concertDate.getConcertDate(), available);
        }
    }
}
