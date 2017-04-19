package ee.ttu.idk0071.sentiment.repository;

import org.springframework.data.repository.CrudRepository;

import ee.ttu.idk0071.sentiment.model.DomainLookup;

public interface DomainLookupRepository extends CrudRepository<DomainLookup, Long> {

}
