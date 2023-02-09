package com.nttd.ms.cliente;

import com.nttd.ms.cliente.entity.Cliente;
import com.nttd.ms.cliente.repository.ClienteRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cliente")
public class GreetingResource {

    @Inject
    ClienteRepository clienteRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> findAll() {
        return clienteRepository.findAll1();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Cliente findAll(@PathParam("id") Long id) {
        return clienteRepository.findById1(id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Cliente cliente){
        clienteRepository.persist(cliente);
    }
}
