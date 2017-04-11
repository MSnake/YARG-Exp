package com.msnake.alex.repository;

import com.msnake.alex.model.ModelRow;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для работы с модельным рядом
 *
 * @author shigaevak
 * @since 11.04.2017
 */
public interface ModelRowRepository extends CrudRepository<ModelRow, Integer> {
}
