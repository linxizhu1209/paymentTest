package org.example.paymenttest.controller;

import lombok.RequiredArgsConstructor;
import org.example.paymenttest.dto.request.FlightSearchRequest;
import org.example.paymenttest.dto.response.FlightResponse;
import org.example.paymenttest.dto.response.FlightSearchResponse;
import org.example.paymenttest.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/flight")
public class FlightController {

    private final FlightService flightService;

    @GetMapping("/search")
    public ResponseEntity<FlightSearchResponse> searchFlights(
            @RequestParam String departureAirportId,
            @RequestParam String arrivalAirportId
    ) {
        FlightSearchResponse flights = flightService.searchFlights(departureAirportId,arrivalAirportId);
        return ResponseEntity.ok(flights);
    }




}
