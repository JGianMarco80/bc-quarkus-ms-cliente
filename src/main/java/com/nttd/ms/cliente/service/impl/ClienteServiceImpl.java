package com.nttd.ms.cliente.service.impl;

import com.nttd.ms.cliente.entity.Cliente;
import com.nttd.ms.cliente.repository.ClienteRepository;
import com.nttd.ms.cliente.service.ClienteService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {

    @Inject
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = clienteRepository.listAll();
        List<Cliente> clientesActivos = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if(cliente.getEstado().equals("1")){
                clientesActivos.add(cliente);
            }
        }

        return clientesActivos;
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void save(Cliente cliente) {
        clienteRepository.persist(cliente);
    }

    @Override
    public void update(Long id, Cliente cliente) {
        Cliente cObtenido = clienteRepository.findById(id);
        cObtenido.setTipoCliente(cliente.getTipoCliente());
        cObtenido.setTipoDocumento(cliente.getTipoDocumento());
        cObtenido.setNumeroDocumento(cliente.getNumeroDocumento());
        cObtenido.setNombreRazonSocial(cliente.getNombreRazonSocial());
        cObtenido.setFechaNacimientoCreacion(cliente.getFechaNacimientoCreacion());
        clienteRepository.persist(cObtenido);
    }

    @Override
    public void delete(Long id) {
        Cliente cObtenido = clienteRepository.findById(id);
        cObtenido.setEstado("0");
        clienteRepository.persist(cObtenido);
    }
}
