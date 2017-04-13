package com.msnake.alex.service.Impl;

import com.msnake.alex.model.Section;
import com.msnake.alex.repository.SectionRepository;
import com.msnake.alex.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Реализация сервиса для работы с разделами
 *
 * @author shigaevak
 * @since 13.04.2017
 */
@Service
@Transactional
public class SectionServiceImpl implements SectionService {

    /**
     * DAO для работы с разделами
     */
    @Autowired
    SectionRepository sectionRepository;

    @Override
    public List<Section> get() throws Exception {
        return (List<Section>) sectionRepository.findAll();
    }

    @Override
    public Section get(Integer id) throws Exception {
        return sectionRepository.findOne(id);
    }

    @Override
    public Section create(Section entity) throws Exception {
        return sectionRepository.save(entity);
    }

    @Override
    public Section update(Section entity) throws Exception {
        return sectionRepository.save(entity);
    }

    @Override
    public void remove(Section entity) throws Exception {
        sectionRepository.delete(entity);
    }
}
