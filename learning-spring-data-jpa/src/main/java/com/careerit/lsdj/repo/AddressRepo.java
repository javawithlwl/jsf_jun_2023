package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
