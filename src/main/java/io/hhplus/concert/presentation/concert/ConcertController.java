package io.hhplus.concert.presentation.concert;

import io.hhplus.concert.application.concert.ConcertFacade;
import io.hhplus.concert.base.exception.ApiResult;
import io.hhplus.concert.presentation.concert.dto.response.GetConcertResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetConcertsResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetDatesResponse;
import io.hhplus.concert.presentation.concert.dto.response.GetSeatsResponse;
import io.hhplus.concert.domain.concert.service.ConcertService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "콘서트", description = "concert-controller")
@RequestMapping("/concerts")
@RestController
@RequiredArgsConstructor
public class ConcertController {

    private final ConcertFacade facade;

    @Operation(summary = "콘서트 목록 조회")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = GetConcertsResponse.class))))
    @GetMapping("")
    public ApiResult<List<GetConcertsResponse>> getConcerts() {
        return ApiResult.success(facade.getConcerts());
    }

    @Operation(summary = "콘서트 상세 조회")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = GetConcertResponse.class)))
    @GetMapping("/{concertId}")
    public ApiResult<GetConcertResponse> getConcert(@PathVariable(value = "concertId") @NotNull Long concertId) {
        return ApiResult.success(facade.getConcert(concertId));
    }

    @Operation(summary = "콘서트 회차 목록 조회")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = GetDatesResponse.class))))
    @GetMapping("/{concertId}/dates")
    public ApiResult<GetDatesResponse> getDates(@PathVariable(value = "concertId") @NotNull Long concertId) {
        return ApiResult.success(facade.getDates(concertId));
    }

    @Operation(summary = "예약 가능한 좌석 목록 조회")
    @ApiResponse(responseCode = "200", description = "OK", content = @Content(array = @ArraySchema(schema = @Schema(implementation = GetSeatsResponse.class))))
    @GetMapping("/dates/{concertDateId}/seats")
    public ApiResult<GetSeatsResponse> getAvailableSeats(@PathVariable(value = "concertDateId") @NotNull Long concertDateId) {
        return ApiResult.success(facade.getAvailableSeats(concertDateId));
    }
}
