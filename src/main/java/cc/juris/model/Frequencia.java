package cc.juris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "frequencia")
public class Frequencia implements ModelEntity {
	
	private static final long serialVersionUID = 8680621291952173339L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "frequencia_codigo")
	@Column(name = "codigo", nullable=false)
	private Long id;
	private Estudante aluno;
	private Turma turma;
	private Long aula;
	private String presenca;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Estudante getAluno() {
		return aluno;
	}

	public void setAluno(Estudante aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Long getAula() {
		return aula;
	}

	public void setAula(Long aula) {
		this.aula = aula;
	}

	public String getPresenca() {
		return presenca;
	}

	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}

}
