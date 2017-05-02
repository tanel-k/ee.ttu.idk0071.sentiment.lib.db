package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonValue;

@Entity
public class DomainLookupAverageDuration {
	@Id
	private Integer code;
	private String name;
	private Float averageDurationHours;

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
	public Float getAverageDurationHours() {
		return averageDurationHours;
	}

	public void setAverageDurationHours(Float averageDurationHours) {
		this.averageDurationHours = averageDurationHours;
	}
}
