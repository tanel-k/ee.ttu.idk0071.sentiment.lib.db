package ee.ttu.idk0071.sentiment.repository;

import ee.ttu.idk0071.sentiment.model.Domain;

public interface DomainRepository extends ReadOnlyRepository<Domain, Integer> {
	public Domain findByName(String name);
}
