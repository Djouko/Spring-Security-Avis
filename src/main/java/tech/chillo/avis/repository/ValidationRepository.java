package tech.chillo.avis.repository;

import org.springframework.data.repository.CrudRepository;
import tech.chillo.avis.entite.Validation;

import java.time.Instant;
import java.util.Optional;

public interface ValidationRepository extends CrudRepository<Validation, Integer> {

    Optional<Validation> findByCode(String code);
    void deleteAllByExpirationBefore(Instant now);
}
