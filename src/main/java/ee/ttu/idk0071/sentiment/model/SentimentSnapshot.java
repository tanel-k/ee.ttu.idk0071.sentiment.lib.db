package ee.ttu.idk0071.sentiment.model;

import java.util.Date;

import javax.persistence.Column;
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
	@Column(columnDefinition = "int2(6)")
	private Integer rank;
	private String url;
	private String title;
	private Double trustLevel;
	private Date date;

	@ManyToOne
	private Lookup lookup;
	@ManyToOne
	private SentimentType sentimentType;
	@ManyToOne
	private LookupDomain lookupDomain;

	public SentimentSnapshot() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getTrustLevel() {
		return trustLevel;
	}

	public void setTrustLevel(Double trustLevel) {
		this.trustLevel = trustLevel;
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

	public LookupDomain getLookupDomain() {
		return lookupDomain;
	}

	public void setLookupDomain(LookupDomain lookupDomain) {
		this.lookupDomain = lookupDomain;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
