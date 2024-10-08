package io.hhplus.concert.presentation.concert.dto.response;

import io.hhplus.concert.infrastructure.concert.entity.Seat;

import java.io.Serializable;
import java.util.List;

public record GetSeatsResponse(
        List<SeatResponse> seats

) implements Serializable {

    public static GetSeatsResponse from(List<Seat> seats) {
        return new GetSeatsResponse(seats.stream().map(SeatResponse::from).toList());
    }

    public record SeatResponse(
            Long seatId,
            int seatNum
    ) {
        public static SeatResponse from(Seat seat) {
            return new SeatResponse(seat.getSeatId(), seat.getSeatNum());
        }
    }
}
