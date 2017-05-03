package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonValue;

@Entity
public class DomainType {
	@Id
	@Column(columnDefinition = "int2(6)")
	private Integer code;
	private String name;

	public DomainType() {
		
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@JsonValue
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
