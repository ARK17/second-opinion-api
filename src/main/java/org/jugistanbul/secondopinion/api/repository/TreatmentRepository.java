package org.jugistanbul.secondopinion.api.repository;

import org.jugistanbul.secondopinion.api.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}