package br.com.microservice.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.microservice.cliente.model.Endereco;
import br.com.microservice.cliente.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	@Transactional
	public Endereco salvar ( Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	@Transactional
	public Endereco update(Long enderecoId, Endereco endereco) {
		endereco.setId(enderecoId);
		return endereco = enderecoRepository.save(endereco);

		
		}
	
	
	
}
