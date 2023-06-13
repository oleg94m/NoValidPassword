package com.example.dentaclinic.service.interfaces;

import com.example.dentaclinic.entity.ClientCard;
import java.util.List;


public interface ClientCardInterface {
  List<ClientCard> getAllCardClient();



  ClientCard addClientCard(ClientCard clientCard);



}
