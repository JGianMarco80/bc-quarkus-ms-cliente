package com.nttd.ms.cliente.service;

import com.nttd.ms.cliente.entity.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> findAll();

    Cliente findById(Long id);

    void save(Cliente cliente);

    void update(Long id, Cliente cliente);

    void delete(Long id);

}
