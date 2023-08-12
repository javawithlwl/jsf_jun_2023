package com.careerit.cbook.service;

import com.careerit.cbook.dto.AppUserDto;

import java.util.List;

public interface AppUserService {

        AppUserDto registerUser(AppUserDto appUserDto);
        List<AppUserDto> listUsers();
        AppUserDto getByEmail(String email);
        AppUserDto updateUser(AppUserDto appUserDto);
        boolean deleteUser(String email);
}
