package br.com.fiap.abdtechservice.service.impl;

import br.com.fiap.abdtechservice.model.Assistance;
import br.com.fiap.abdtechservice.repository.AssistanceRepository;
import br.com.fiap.abdtechservice.service.AssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AssistanceServiceImpl implements AssistanceService {


    private AssistanceRepository repository;

    public AssistanceServiceImpl(
            @Autowired
                    AssistanceRepository repository
    ) {
        this.repository = repository;
    }


    @Override
    public List<Assistance> getAssistanceList() {
        return this.repository.findAll();
    }
}