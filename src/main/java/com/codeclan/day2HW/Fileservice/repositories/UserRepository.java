package com.codeclan.day2HW.Fileservice.repositories;

import com.codeclan.day2HW.Fileservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
