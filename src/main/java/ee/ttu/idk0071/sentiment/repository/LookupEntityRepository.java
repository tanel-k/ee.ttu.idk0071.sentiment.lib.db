package ee.ttu.idk0071.sentiment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ee.ttu.idk0071.sentiment.model.LookupEntity;

public interface LookupEntityRepository extends CrudRepository<LookupEntity, Long> {
	@Override
	List<LookupEntity> findAll();

	LookupEntity findByName(String name);
}
