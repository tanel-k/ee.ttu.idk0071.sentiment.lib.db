package ee.ttu.idk0071.sentiment.repository;

import ee.ttu.idk0071.sentiment.model.LookupDomain;

public interface LookupDomainRepository extends ReadOnlyRepository<LookupDomain, Integer> {
	public LookupDomain findByName(String name);
}
