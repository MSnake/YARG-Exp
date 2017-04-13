package com.msnake.alex.service.Impl;

import com.msnake.alex.model.ModelRow;
import com.msnake.alex.repository.ModelRowRepository;
import com.msnake.alex.service.ModelRowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Реализация сервиса для работы с модельным рядом
 *
 * @author shigaevak
 * @since 13.04.2017
 */
@Service
@Transactional
public class ModelRowServiceImpl implements ModelRowService {

    /**
     * DAO - для работы с модельным рядом
     */
    @Autowired
    ModelRowRepository modelRowRepository;

    @Override
    public List<ModelRow> get() throws Exception {
        return (List<ModelRow>) modelRowRepository.findAll();
    }

    @Override
    public ModelRow get(Integer id) throws Exception {
        return modelRowRepository.findOne(id);
    }

    @Override
    public ModelRow create(ModelRow entity) throws Exception {
        return modelRowRepository.save(entity);
    }

    @Override
    public ModelRow update(ModelRow entity) throws Exception {
        return modelRowRepository.save(entity);
    }

    @Override
    public void remove(ModelRow entity) throws Exception {
        modelRowRepository.delete(entity);
    }
}
