package com.example.demo.reponsitory;

import com.example.demo.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialsReponsitory extends JpaRepository<Tutorial, Long> {
}
