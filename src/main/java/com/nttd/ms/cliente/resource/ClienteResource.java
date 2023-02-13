package com.nttd.ms.cliente.resource;

import com.nttd.ms.cliente.entity.Cliente;
import com.nttd.ms.cliente.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GET
    @Path("/{id}")
    public Cliente findAll(@PathParam("id") Long id) {
        return clienteService.findById(id);
    }

    @POST
    @Transactional
    public void save(Cliente cliente){
        clienteService.save(cliente);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void update(@PathParam("id") Long id, Cliente cliente){
        clienteService.update(id, cliente);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id){
        clienteService.delete(id);
    }

}
