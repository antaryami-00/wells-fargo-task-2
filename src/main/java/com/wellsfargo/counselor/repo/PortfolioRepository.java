package com.wellsfargo.counselor.repo;

import com.yourproject.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {}

