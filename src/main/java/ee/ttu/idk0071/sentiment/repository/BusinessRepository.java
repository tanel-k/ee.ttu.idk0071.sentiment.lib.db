package ee.ttu.idk0071.sentiment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ee.ttu.idk0071.sentiment.model.Business;

public interface BusinessRepository extends CrudRepository<Business, Long> {
	@Override
	List<Business> findAll();

	Business findByName(String name);
}
