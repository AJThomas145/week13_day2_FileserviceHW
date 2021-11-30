package com.codeclan.day2HW.Fileservice.repositories;

import com.codeclan.day2HW.Fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
