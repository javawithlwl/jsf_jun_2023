package com.careerit.cbook.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUserDto {

    private long id;
    private String username;
    private String password;
    private String email;
}
