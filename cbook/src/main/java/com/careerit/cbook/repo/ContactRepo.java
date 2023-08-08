package com.careerit.cbook.repo;

import com.careerit.cbook.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContactRepo extends JpaRepository<Contact, UUID> {
}
