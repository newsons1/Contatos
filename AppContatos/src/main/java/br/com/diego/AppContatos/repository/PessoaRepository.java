package br.com.diego.AppContatos.repository;

import org.springframework.stereotype.Repository;

import br.com.diego.AppContatos.model.Pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	
	@Query(value = "SELECT ID, NOME, ENDERECO, CEP, CIDADE, UF FROM PUBLIC.PESSOA", nativeQuery = true)
	List<Pessoa> buscarPessoas(); //busca por pessoa
	

}