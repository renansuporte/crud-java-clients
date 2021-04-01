package br.com.impacta.clientes.service;

import br.com.impacta.clientes.dto.ClienteDTO;
import br.com.impacta.clientes.entity.ClienteEntity;
import br.com.impacta.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO incluir(ClienteDTO clienteDTO) {
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNome(clienteDTO.getNome());
        clienteEntity.setDataNascimento(clienteDTO.getDataNascimento());
        clienteRepository.save(clienteEntity);
        return clienteDTO;
    }
}
