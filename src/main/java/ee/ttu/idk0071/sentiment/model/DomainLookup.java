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

	private Long totalCount;
	private Long positiveCount;
	private Long negativeCount;
	private Long neutralCount;

	private Double positiveQty;
	private Double negativeQty;
	private Double neutralQty;

	@ManyToOne
	private SentimentType sentimentType;
	@ManyToOne
	private Lookup lookup;

	@ManyToOne
	private Domain domain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Lookup getLookup() {
		return lookup;
	}

	public void setLookup(Lookup lookup) {
		this.lookup = lookup;
	}

	public SentimentType getSentimentType() {
		return sentimentType;
	}

	public void setSentimentType(SentimentType sentimentType) {
		this.sentimentType = sentimentType;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
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

	public Double getPositiveQty() {
		return positiveQty;
	}

	public void setPositiveQty(Double positiveQty) {
		this.positiveQty = positiveQty;
	}

	public Double getNegativeQty() {
		return negativeQty;
	}

	public void setNegativeQty(Double negativeQty) {
		this.negativeQty = negativeQty;
	}

	public Double getNeutralQty() {
		return neutralQty;
	}

	public void setNeutralQty(Double neutralQty) {
		this.neutralQty = neutralQty;
	}

	public void setCounts(Long negative, Long neutral, Long positive) {
		setTotalCount(negative + neutral + positive);
		setNegativeCount(negative);
		setNeutralCount(neutral);
		setPositiveCount(positive);
	}

	public void setQuantities(Double negative, Double neutral, Double positive) {
		setNegativeQty(negative);
		setNeutralQty(neutral);
		setPositiveQty(positive);
	}
}
