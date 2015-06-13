package cc.juris.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Professor extends Pessoa {

	private static final long serialVersionUID = 8894822407832053368L;
	
}
