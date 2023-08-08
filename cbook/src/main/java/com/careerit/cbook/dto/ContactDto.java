package com.careerit.cbook.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {

    private UUID id;
    private String name;
    private String email;
    private String mobile;
    private boolean deleted;
}
