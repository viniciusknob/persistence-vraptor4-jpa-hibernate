package cc.juris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "disciplina")
public class Disciplina implements ModelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "disciplina_codigo")
	@Column(name = "codigo", nullable=false)
	private Long id;
	private String nome;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
