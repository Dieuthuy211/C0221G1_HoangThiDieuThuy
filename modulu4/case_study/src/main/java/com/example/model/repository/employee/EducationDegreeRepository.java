package com.example.model.repository.employee;

import com.example.model.entity.employee.EductionDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EductionDegree,Integer> {
}
