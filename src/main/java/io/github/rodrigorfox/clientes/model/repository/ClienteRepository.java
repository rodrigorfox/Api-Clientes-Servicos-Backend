package io.github.rodrigorfox.clientes.model.repository;

import io.github.rodrigorfox.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
