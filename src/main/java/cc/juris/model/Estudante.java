package cc.juris.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@DiscriminatorValue("2")
public class Estudante extends Pessoa {
	
	@ManyToMany
	@JoinTable(name = "alunoturma", 
	joinColumns = { @JoinColumn(name = "codigo_turma") }, inverseJoinColumns = { @JoinColumn(name = "codigo_aluno") })
	private List<Turma> turmas;

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
