package com.example.StudentSpringBoot.Repository;

import com.example.StudentSpringBoot.models.Students;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Students,Integer> {
    List<Students> findStudentsByName(String name);

    Students findReferenceById(int id);

}
