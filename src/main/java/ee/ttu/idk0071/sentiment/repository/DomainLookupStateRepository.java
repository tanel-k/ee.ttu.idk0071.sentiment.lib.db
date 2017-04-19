package ee.ttu.idk0071.sentiment.repository;

import ee.ttu.idk0071.sentiment.model.DomainLookupState;

public interface DomainLookupStateRepository extends ReadOnlyRepository<DomainLookupState, Integer> {
	public DomainLookupState findByName(String name);
}
