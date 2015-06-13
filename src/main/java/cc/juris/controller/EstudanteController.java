package cc.juris.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import cc.juris.model.Estudante;
import cc.juris.service.EstudanteService;

@Controller
@Path("/estudante")
public class EstudanteController implements RepositoryController<Estudante> {

	@Inject Result result;
	@Inject EstudanteService service;
	
	// {"estudante":{"nome":"Vinicius","ddd":"55","telefone":"99887766","endereco":"R.Local,123","email":"a@b.c","senha":"123456"}}
	@Post("/add")
	@Consumes({"application/json","application/xml"})
	public void add(Estudante estudante) {
		service.add(estudante);
		result.use(Results.status()).ok();
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Estudante get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
