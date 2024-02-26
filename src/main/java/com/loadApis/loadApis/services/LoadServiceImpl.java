package com.loadApis.loadApis.services;

import com.loadApis.loadApis.Dao.LoadDao;
import com.loadApis.loadApis.entities.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class LoadServiceImpl implements LoadService {

    @Autowired
    private LoadDao loadDao;

    @Override
    public List getLoads() {
        return loadDao.findAll();
    }

    @Override
    public Optional<Load> getLoad(long loadId) {
        return loadDao.findById(loadId);
    }

    @Override
    public Load save(Load load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public List<Load> deleteLoad(long loadId) {
        loadDao.deleteById(loadId);
        return null;
    }
    @Override
    public Load updateLoad(Load load, int loadId) {
        Optional<Load> optionalExistingLoad = loadDao.findById((long) loadId);
        if (optionalExistingLoad.isPresent()) {
            Load existingLoad = optionalExistingLoad.get();
            // Update the ID of the provided load object
            load.setId(existingLoad.getId());
        }
        return loadDao.save(load);
    }


}