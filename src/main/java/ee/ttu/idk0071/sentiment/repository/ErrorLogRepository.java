package ee.ttu.idk0071.sentiment.repository;

import org.springframework.data.repository.CrudRepository;

import ee.ttu.idk0071.sentiment.model.ErrorLog;

public interface ErrorLogRepository extends CrudRepository<ErrorLog, Long> {
}
