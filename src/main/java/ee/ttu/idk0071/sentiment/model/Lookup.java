package ee.ttu.idk0071.sentiment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Lookup {
	@Id
	@SequenceGenerator(name="lookup_seq_gen", sequenceName="lookup_id_seq")  
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="lookup_seq_gen")
	private Long id;
	private Date date;

	@ManyToOne
	private LookupEntity lookupEntity;
	@ManyToOne
	private SentimentType sentimentType;
	@ManyToOne
	private LookupState lookupState;

	public Lookup() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLookupState(LookupState lookupState) {
		this.lookupState = lookupState;
	}

	public LookupState getLookupState() {
		return lookupState;
	}

	public LookupEntity getLookupEntity() {
		return lookupEntity;
	}

	public void setLookupEntity(LookupEntity lookupEntity) {
		this.lookupEntity = lookupEntity;
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
