package br.com.microservice.cliente.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.microservice.cliente.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long>{
	
	Optional<Endereco> findById(Long id);
}
