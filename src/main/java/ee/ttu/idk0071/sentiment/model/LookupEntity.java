package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LookupEntity {
	@Id
	@SequenceGenerator(name="lookup_entity_seq_gen", sequenceName="lookup_entity_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="lookup_entity_seq_gen")
	private Long id;
	private String name;

	public LookupEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
