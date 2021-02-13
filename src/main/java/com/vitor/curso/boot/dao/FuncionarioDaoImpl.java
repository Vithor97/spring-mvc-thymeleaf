package com.vitor.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.vitor.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
