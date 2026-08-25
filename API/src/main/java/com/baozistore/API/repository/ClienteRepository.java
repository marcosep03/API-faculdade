// ClienteRepository.java
package com.baozistore.API.repository;
import com.baozistore.API.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}