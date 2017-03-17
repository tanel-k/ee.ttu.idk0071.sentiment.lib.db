package ee.ttu.idk0071.sentiment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ee.ttu.idk0071.sentiment.model.SentimentSnapshot;

public interface SentimentSnapshotRepository extends CrudRepository<SentimentSnapshot, Long>{
	public List<SentimentSnapshot> findByLookupId(Long lookupId);
}
