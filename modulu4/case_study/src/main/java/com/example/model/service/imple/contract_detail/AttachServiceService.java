package com.example.model.service.imple.contract_detail;

import com.example.model.entity.contract_detail.AttachService;
import com.example.model.repository.contract_detail.AttachServiceRepository;
import com.example.model.service.IAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceService implements IAttachService {
    @Autowired
    AttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }

    @Override
    public AttachService findById(Integer id) {
        return null;
    }

    @Override
    public void save(AttachService attachService) {

    }

    @Override
    public void remove(Integer id) {

    }
}
