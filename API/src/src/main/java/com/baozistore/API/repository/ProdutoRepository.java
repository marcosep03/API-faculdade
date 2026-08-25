// ProdutoRepository.java
package com.baozistore.API.repository;
import com.baozistore.API.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}