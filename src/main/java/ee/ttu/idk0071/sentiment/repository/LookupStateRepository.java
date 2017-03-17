package ee.ttu.idk0071.sentiment.repository;

import ee.ttu.idk0071.sentiment.model.LookupState;

public interface LookupStateRepository extends ReadOnlyRepository<LookupState, Long> {
	public LookupState findByName(String name);
}
