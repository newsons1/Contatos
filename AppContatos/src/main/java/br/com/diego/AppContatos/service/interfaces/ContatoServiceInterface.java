package br.com.diego.AppContatos.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.diego.AppContatos.dto.ContatoDTO;
import br.com.diego.AppContatos.model.Contato;

public interface ContatoServiceInterface {
	
			
			Contato save(Contato contato);
			//Recuperar 1 Contato
			Optional<Contato> getById(Long id);
			//Recuperar todos os Contatos
			List<Contato> getAll();
			//Atualizar o Contato
			Contato update(Contato Contato);
			//Deletar o Contato
			void delete(Long id);
			
			


}