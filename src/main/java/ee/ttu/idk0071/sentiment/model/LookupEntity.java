package ee.ttu.idk0071.sentiment.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="refid")
public class LookupEntity {
	@Id
	@SequenceGenerator(name="lookup_entity_seq_gen", sequenceName="lookup_entity_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="lookup_entity_seq_gen")
	private Long id;
	private String name;

	@OneToMany(mappedBy="lookupEntity", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Lookup> lookups = new LinkedList<Lookup>();

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

	public List<Lookup> getLookups() {
		return lookups;
	}

	public void setLookups(List<Lookup> lookups) {
		this.lookups = lookups;
	}
}
