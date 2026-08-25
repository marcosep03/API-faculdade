// PedidoRepository.java
package com.baozistore.API.repository;
import com.baozistore.API.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}