package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DomainLookupAverageDuration {
	@Id
	private Integer code;
	private String name;
	private Integer averageDurationMinutes;

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

	public Integer getAverageDurationMinutes() {
		return averageDurationMinutes;
	}

	public void setAverageDurationMinutes(Integer averageDurationMinutes) {
		this.averageDurationMinutes = averageDurationMinutes;
	}
}
