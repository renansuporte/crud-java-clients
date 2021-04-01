package br.com.impacta.clientes.controller;

import br.com.impacta.clientes.dto.ClienteDTO;
import br.com.impacta.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO incluir(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.incluir(clienteDTO);
    }


}
