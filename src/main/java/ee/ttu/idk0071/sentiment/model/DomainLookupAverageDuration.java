package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonValue;

@Entity
public class DomainLookupAverageDuration {
	@Id
	private Integer code;
	private String name;
	private Integer averageDurationSeconds;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonValue
	public Integer getAverageDurationSeconds() {
		return averageDurationSeconds;
	}

	public void setAverageDurationSeconds(Integer averageDurationSeconds) {
		this.averageDurationSeconds = averageDurationSeconds;
	}
}
