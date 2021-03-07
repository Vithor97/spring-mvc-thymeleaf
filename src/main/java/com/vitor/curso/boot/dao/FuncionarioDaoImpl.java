package com.vitor.curso.boot.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.vitor.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	@Override
	public List<Funcionario> findBynome(String nome) {
		TypedQuery<Funcionario> query = getEntityManager()
				.createQuery("select f from Funcionario f where f.nome like concat('%',:nome, '%')", Funcionario.class);
		query.setParameter("nome", nome);
		
		return query.getResultList();
		
		//return createQuery("select f from Funcionario f where f.nome like concat('%',?1, '%')", nome);
	}

}
