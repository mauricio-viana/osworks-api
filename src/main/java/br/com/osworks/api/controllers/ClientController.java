package br.com.osworks.api.controllers;


import br.com.osworks.domain.models.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    @GetMapping("/clients")
    public List<Client> getAll(){
        var cliente1 = new Client();
        var cliente2 = new Client();

        cliente1.setId(1L);
        cliente1.setName("Mauricio");
        cliente1.setEmail("mauricioviana@email.com");
        cliente1.setPhone("11 99999-9999");


        cliente2.setId(1L);
        cliente2.setName("Rayra Silva");
        cliente2.setEmail("rayrasilva@email.com");
        cliente2.setPhone("11 99999-9998");

        return Arrays.asList(cliente1,cliente2);
    }
}
