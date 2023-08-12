package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepo extends JpaRepository<Wallet,Long> {
}
