package com.nttd.ms.cliente;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;

import com.nttd.ms.cliente.resource.ClienteResource;
import com.nttd.ms.cliente.entity.Cliente;
import com.nttd.ms.cliente.repository.ClienteRepository;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class GreetingResourceTest {
  @Inject
  ClienteResource clienteResource;

  @InjectMock
  ClienteRepository clienteRepository;

    @Test
    public void ListarClientes() {     
        List<Cliente> response = clienteResource.findAll();
        System.out.println(response.size());
    }

 
    @Test
    public void ListarSinClientes() {
        Mockito.when(clienteRepository.findAll()).thenReturn(null);
        List<Cliente> response = clienteResource.findAll();
        System.out.println(response.size());
    }

    @Test
    public void buscarCliente() {      
      long i = '1';
      Cliente response = clienteResource.findAll(i);
        System.out.println(response);
    }

    @Test
    public void buscarClienteNoexiste() {
      Mockito.when(clienteRepository.findAll()).thenReturn(null);
      long i = '1';
      Cliente response = clienteResource.findAll(i);
        System.out.println(response);
    }
    
    
    @Test
    public void guardarCliente() {    
      try{ 
          Cliente cliente = new Cliente();
          clienteResource.save(cliente);
      }catch(Exception exception){
        System.out.println("ERROR save cliente");
      }  
    }

    
}