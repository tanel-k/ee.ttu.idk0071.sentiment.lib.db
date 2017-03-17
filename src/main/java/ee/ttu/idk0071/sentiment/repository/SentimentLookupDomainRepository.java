package ee.ttu.idk0071.sentiment.repository;

import ee.ttu.idk0071.sentiment.model.SentimentLookupDomain;

public interface SentimentLookupDomainRepository extends ReadOnlyRepository<SentimentLookupDomain, Integer> {
	public SentimentLookupDomain findByName(String name);
}
