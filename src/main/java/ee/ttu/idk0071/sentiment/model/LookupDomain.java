package ee.ttu.idk0071.sentiment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LookupDomain {
	@Id
	@Column(columnDefinition = "int2(6)")
	private Integer code;
	private String name;
	private boolean active;

	@ManyToOne
	private LookupDomainType lookupDomainType;

	public LookupDomain() {
		
	}

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LookupDomainType getLookupDomainType() {
		return lookupDomainType;
	}

	public void setLookupDomainType(LookupDomainType lookupDomainType) {
		this.lookupDomainType = lookupDomainType;
	}
}
