package org.jugistanbul.secondopinion.api.repository;

import org.jugistanbul.secondopinion.api.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gökalp Gürbüzer (gokalp.gurbuzer@yandex.com)
 */
@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
}