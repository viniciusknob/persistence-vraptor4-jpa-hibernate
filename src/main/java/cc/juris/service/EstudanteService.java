package cc.juris.service;

import javax.inject.Inject;

import cc.juris.dao.AbstractDao;
import cc.juris.model.Estudante;

public class EstudanteService extends AbstractService<Estudante> {
	
	@Inject 
	AbstractDao<Estudante> dao;

	@Override
	protected AbstractDao<Estudante> getDao() {
		return dao;
	}
	
	public void add(Estudante estudante) {
		dao.save(estudante);
	}

}
