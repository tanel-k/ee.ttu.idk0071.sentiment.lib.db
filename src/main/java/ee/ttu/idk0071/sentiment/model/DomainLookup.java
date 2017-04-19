package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="refid")
public class DomainLookup {
	@Id
	@SequenceGenerator(name="domain_lookup_seq_gen", sequenceName="domain_lookup_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domain_lookup_seq_gen")
	private Long id;

	private Long positiveCount;
	private Long negativeCount;
	private Long neutralCount;
	// @Column(columnDefinition = "float8")
	private Float score;
	
	@ManyToOne
	private Lookup lookup;
	@ManyToOne
	private DomainLookupState domainLookupState;

	@ManyToOne
	private Domain domain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDomainLookupState(DomainLookupState domainLookupState) {
		this.domainLookupState = domainLookupState;
	}

	public DomainLookupState getDomainLookupState() {
		return domainLookupState;
	}

	public Lookup getLookup() {
		return lookup;
	}

	public void setLookup(Lookup lookup) {
		this.lookup = lookup;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Long getPositiveCount() {
		return positiveCount;
	}

	public void setPositiveCount(Long positiveCount) {
		this.positiveCount = positiveCount;
	}

	public Long getNegativeCount() {
		return negativeCount;
	}

	public void setNegativeCount(Long negativeCount) {
		this.negativeCount = negativeCount;
	}

	public Long getNeutralCount() {
		return neutralCount;
	}

	public void setNeutralCount(Long neutralCount) {
		this.neutralCount = neutralCount;
	}

	public Float getScore(){
		return score;
	}

	public void setScore(Float score){
		this.score = score;
	}

	public void setCounts(Long negCount, Long neuCount, Long posCount) {
		setNegativeCount(negCount);
		setNeutralCount(neuCount);
		setPositiveCount(posCount);
		
		// set score
		Long negPosCount = negCount + posCount;
		if (negPosCount > 0) {
			setScore(negCount.floatValue() / negPosCount.floatValue() * 100F);
		} else {
			setScore(null);
		}
	}
}
