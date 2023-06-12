package com.example.dentaclinic.service.implementations;

import com.example.dentaclinic.entity.ClientCard;
import com.example.dentaclinic.repository.ClientCardRepository;
import com.example.dentaclinic.service.interfaces.ClientCardInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientCardImplementation implements ClientCardInterface {

    private ClientCardRepository clientCardRepository;

    public ClientCardImplementation(ClientCardRepository clientCardRepository) {
        super();
        this.clientCardRepository = clientCardRepository;
    }

    @Override
    public List<ClientCard> getAllCardClient() {
        return clientCardRepository.findAll();
    }
}
