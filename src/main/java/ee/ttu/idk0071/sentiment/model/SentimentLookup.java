package ee.ttu.idk0071.sentiment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SentimentLookup {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date;
	
	@ManyToOne
	private LookupEntity entity;
	@ManyToOne
	private SentimentType sentimentType;

	public SentimentLookup() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LookupEntity getEntity() {
		return entity;
	}

	public void setEntity(LookupEntity business) {
		this.entity = business;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SentimentType getSentimentType() {
		return sentimentType;
	}

	public void setSentimentType(SentimentType sentimentType) {
		this.sentimentType = sentimentType;
	}

}
