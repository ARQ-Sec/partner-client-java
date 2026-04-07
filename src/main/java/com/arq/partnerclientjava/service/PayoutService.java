package com.arq.partnerclientjava.service;

import com.arq.partnerclientjava.dto.PayoutResponse;
import com.arq.partnerclientjava.repository.PayoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PayoutService {
    private final PayoutRepository repository;

    public PayoutService(PayoutRepository repository) {
        this.repository = repository;
    }

    public List<PayoutResponse> summarize() {
        return repository.findAll().stream().map(record -> new PayoutResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
