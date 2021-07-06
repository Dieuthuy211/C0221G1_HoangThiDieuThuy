package com.example.model.repository.contract_detail;

import com.example.model.entity.contract_detail.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService,Integer> {
}
