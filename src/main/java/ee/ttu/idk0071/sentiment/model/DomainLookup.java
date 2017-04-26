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
	public static final Integer STATE_CODE_QUEUED = 1;
	public static final Integer STATE_CODE_IN_PROGRESS = 2;
	public static final Integer STATE_CODE_COMPLETE = 3;
	public static final Integer STATE_CODE_ERROR = 4;

	@Id
	@SequenceGenerator(name="domain_lookup_seq_gen", sequenceName="domain_lookup_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domain_lookup_seq_gen")
	private Long id;

	private Long positiveCount;
	private Long negativeCount;
	private Long neutralCount;

	private Float neutralityPercentage;
	private Float positivityPercentage;
	private Float negativityPercentage;

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

	public Float getNegativityPercentage() {
		return negativityPercentage;
	}

	public void setNegativityPercentage(Float negativityPercentage) {
		this.negativityPercentage = negativityPercentage;
	}

	public Float getPositivityPercentage() {
		return positivityPercentage;
	}

	public void setPositivityPercentage(Float positivityPercentage) {
		this.positivityPercentage = positivityPercentage;
	}

	public Float getNeutralityPercentage() {
		return neutralityPercentage;
	}

	public void setNeutralityPercentage(Float neutralityPercentage) {
		this.neutralityPercentage = neutralityPercentage;
	}

	public Long getTotalCount() {
		if (negativeCount != null && neutralCount != null && positiveCount != null) {
			return negativeCount + neutralCount + positiveCount;
		}
	
		return null;
	}

	public void setCounts(Long negCount, Long neuCount, Long posCount) {
		setNegativeCount(negCount);
		setNeutralCount(neuCount);
		setPositiveCount(posCount);
		
		// set percentages
		Long totalCount = getTotalCount();
		if (totalCount > 0) {
			setNegativityPercentage(negCount.floatValue() / totalCount.floatValue() * 100F);
			setNeutralityPercentage(neuCount.floatValue() / totalCount.floatValue() * 100F);
			setPositivityPercentage(posCount.floatValue() / totalCount.floatValue() * 100F);
		} else {
			setNegativityPercentage(null);
			setNeutralityPercentage(null);
			setPositivityPercentage(null);
		}
	}
}
