package cc.juris.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import cc.juris.model.Estudante;
import cc.juris.service.EstudanteService;

@Controller
@Path("/estudante")
public class EstudanteController {

	@Inject EstudanteService service;
	
	@Path("/add")
	@Consumes({"application/json","application/xml"})
	public void add(Estudante estudante) {
		service.add(estudante);
	}

}
