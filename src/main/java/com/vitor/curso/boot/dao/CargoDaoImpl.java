package com.vitor.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.vitor.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
