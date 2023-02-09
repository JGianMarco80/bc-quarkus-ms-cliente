package com.nttd.ms.cliente.repository;

import com.nttd.ms.cliente.entity.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {

    public List<Cliente> findAll1(){
        return listAll();
    }

    public Cliente findById1(Long id){
        return findById(id);
    }


}
