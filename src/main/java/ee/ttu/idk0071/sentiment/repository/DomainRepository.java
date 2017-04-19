package ee.ttu.idk0071.sentiment.repository;

import java.util.List;

import ee.ttu.idk0071.sentiment.model.Domain;

public interface DomainRepository extends ReadOnlyRepository<Domain, Integer> {
	public Domain findByName(String name);
	List<Domain> findByActiveTrue();
}
