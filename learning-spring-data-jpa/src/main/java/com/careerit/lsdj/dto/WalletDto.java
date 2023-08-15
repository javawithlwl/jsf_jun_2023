package com.careerit.lsdj.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class WalletDto extends BaseDto {
    private Long id;
    private String name;
    private String mobile;
    private double balance;
    private LocalDate validThru;
    private boolean deleted;
}
