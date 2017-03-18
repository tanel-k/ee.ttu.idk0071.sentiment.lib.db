package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class DomainLookup {
	@Id
	@SequenceGenerator(name="domain_lookup_seq_gen", sequenceName="domain_lookup_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domain_lookup_seq_gen")
	private Long id;

	@ManyToOne
	private Lookup lookup;

	@ManyToOne
	private Domain domain;

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Lookup getLookup() {
		return lookup;
	}

	public void setLookup(Lookup lookup) {
		this.lookup = lookup;
	}
}
