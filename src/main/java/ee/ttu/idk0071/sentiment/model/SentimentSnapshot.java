package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class SentimentSnapshot {
	@Id
	@SequenceGenerator(name="sentiment_snapshot_seq_gen", sequenceName="sentiment_snapshot_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sentiment_snapshot_seq_gen")
	private Long id;
	private String source;
	private Double trustLevel;

	@ManyToOne
	private DomainLookup domainLookup;
	@ManyToOne
	private SentimentType sentimentType;

	public SentimentSnapshot() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Double getTrustLevel() {
		return trustLevel;
	}

	public void setTrustLevel(Double trustLevel) {
		this.trustLevel = trustLevel;
	}

	public DomainLookup getDomainLookup() {
		return domainLookup;
	}

	public void setDomainLookup(DomainLookup domainLookup) {
		this.domainLookup = domainLookup;
	}

	public SentimentType getSentimentType() {
		return sentimentType;
	}

	public void setSentimentType(SentimentType sentimentType) {
		this.sentimentType = sentimentType;
	}
}
