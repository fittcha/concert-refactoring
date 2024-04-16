package io.hhplus.server.controller.concert.dto.response;

import io.hhplus.server.domain.concert.entity.ConcertDate;

import java.time.ZonedDateTime;
import java.util.List;

public record GetDatesResponse(
        List<DateInfo> dates
) {

    public static GetDatesResponse from(List<ConcertDate> concertDateList) {
        return new GetDatesResponse(concertDateList.stream().map(DateInfo::from).toList());
    }

    public record DateInfo(
            Long concertDateId,
            ZonedDateTime date
    ) {
        public static DateInfo from(ConcertDate concertDate) {
            return new DateInfo(concertDate.getConcertDateId(), concertDate.getConcertDate());
        }
    }
}
