package com.wellsfargo.counselor.repo;

import com.yourproject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}

