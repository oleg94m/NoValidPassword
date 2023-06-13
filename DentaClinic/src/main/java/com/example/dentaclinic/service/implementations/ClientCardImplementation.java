package com.example.dentaclinic.service.implementations;

import com.example.dentaclinic.entity.ClientCard;
import com.example.dentaclinic.repository.ClientCardRepository;
import com.example.dentaclinic.service.interfaces.ClientCardInterface;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientCardImplementation implements ClientCardInterface {

    private ClientCardRepository clientCardRepository;

    public ClientCardImplementation(ClientCardRepository clientCardRepository) {
        this.clientCardRepository = clientCardRepository;
    }
/*
    @Override
    public List<ClientCard> getAllCardClient() {
        return clientCardRepository.findAll();
    }
*/
    @CacheEvict(value = "ClientCard", allEntries = true)
    @Override
    public ClientCard addClientCard(ClientCard clientCard) {
        return clientCardRepository.save(clientCard);
    }


}
