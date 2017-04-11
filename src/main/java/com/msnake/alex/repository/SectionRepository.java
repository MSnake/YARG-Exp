package com.msnake.alex.repository;

import com.msnake.alex.model.Section;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для работы разделами
 *
 * @author shigaevak
 * @since 11.04.2017
 */
public interface SectionRepository extends CrudRepository<Section, Integer> {
}
