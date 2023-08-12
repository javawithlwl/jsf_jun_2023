package com.careerit.cbook.repo;

import com.careerit.cbook.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findByEmail(String email);
}
