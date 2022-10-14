package kaua.com.br.chatserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaua.com.br.chatserver.PessoaRepository;
import kaua.com.br.chatserver.model.Pessoa;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository repo;

	
	public Pessoa post(Pessoa pessoa) {
		return repo.save(pessoa);
	}
}
