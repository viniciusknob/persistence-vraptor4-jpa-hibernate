package cc.juris.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "turma")
public class Turma implements ModelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "turma_codigo")
	@Column(name = "codigo", nullable=false)
	private Long id;
	
	@OneToOne
	private Disciplina disciplina;
	
	@OneToOne
	private Pessoa professor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datainicio")
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datafim")
	private Date dataFim;
	
	@Column(name = "quantidadeaulas")
	private Long quantidadeAulas;
	
	@ManyToMany
	@JoinTable(name = "alunoturma", 
	joinColumns = { @JoinColumn(name = "codigo_aluno") }, inverseJoinColumns = { @JoinColumn(name = "codigo_turma") })
	private List<Estudante> estudantes;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Long getQuantidadeAulas() {
		return quantidadeAulas;
	}

	public void setQuantidadeAulas(Long quantidadeAulas) {
		this.quantidadeAulas = quantidadeAulas;
	}

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

}
