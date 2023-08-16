package com.careerit.iplstats.controller;

import com.careerit.iplstats.dto.AppErrorResponse;
import com.careerit.iplstats.exceptions.IplStatsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
        @ExceptionHandler({IplStatsException.class})
        public ResponseEntity<AppErrorResponse> handleInternal(IplStatsException iplStatsException){
            AppErrorResponse appErrorResponse = AppErrorResponse.builder()
                    .message(iplStatsException.getMessage())
                    .status(HttpStatus.BAD_REQUEST)
                    .build();
            return ResponseEntity.badRequest().body(appErrorResponse);
        }

}
