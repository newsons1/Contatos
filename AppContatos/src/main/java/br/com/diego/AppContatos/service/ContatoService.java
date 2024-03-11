package br.com.diego.AppContatos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diego.AppContatos.dto.ContatoDTO;
import br.com.diego.AppContatos.model.Contato;
import br.com.diego.AppContatos.model.Pessoa;
import br.com.diego.AppContatos.repository.ContatoRepository;
import br.com.diego.AppContatos.repository.PessoaRepository;
import br.com.diego.AppContatos.service.interfaces.ContatoServiceInterface;



@Service
public class ContatoService implements ContatoServiceInterface {
		
		
	private ContatoRepository contatoRepository;
	private PessoaRepository pessoaRepository;


	@Autowired
	public ContatoService(ContatoRepository contatoRepository,PessoaRepository pessoaRepository) {
		this.contatoRepository = contatoRepository;
		this.pessoaRepository = pessoaRepository;
	}
	
	@Override
	public Contato save(Contato contato) {
		return contatoRepository.save(contato);
	}


	
	@Override
	public Optional<Contato> getById(Long id) {
		return contatoRepository.findById(id);

	}

	@Override
	public List<Contato> getAll() {
		return contatoRepository.findAll();
	}

	@Override
	public Contato update(Contato contato) {
		Optional<Contato> findContato = contatoRepository.findById(contato.getId());
				
				//se ele existir, vou atualizar:
				if(findContato.isPresent()) {
					Contato updateContato = findContato.get(); //setId
					updateContato.setTipoContato(contato.getTipoContato());
					updateContato.setContato(contato.getContato());
					return contatoRepository.save(updateContato);			

					
					
				}
				return contato;		
	}

	@Override
	public void delete(Long id) {
		contatoRepository.deleteById(id);		
		
	}


	

	

}