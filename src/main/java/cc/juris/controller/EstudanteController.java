package cc.juris.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
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
	@Override
	public void add(Estudante estudante) {
		service.save(estudante);
		result.use(Results.status()).ok();
	}

	@Delete("/remove/{id}")
	@Consumes({"application/json","application/xml"})
	@Override
	public void remove(Long id) {
		Estudante e = service.delete(id);
		result.use(Results.json()).from(e).serialize();
	}

	@Get("/get/{id}")
	@Consumes({"application/json","application/xml"})
	@Override
	public void get(Long id) {
		Estudante e = service.findById(id);
		result.use(Results.json()).from(e).serialize();
	}

}
