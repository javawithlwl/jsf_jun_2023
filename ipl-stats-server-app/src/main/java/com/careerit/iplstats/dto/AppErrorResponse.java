package com.careerit.iplstats.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppErrorResponse {

    private String message;
    private HttpStatus status;

}
