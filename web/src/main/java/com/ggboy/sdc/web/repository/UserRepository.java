package com.ggboy.sdc.web.repository;

import com.ggboy.sdc.web.domain.entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}