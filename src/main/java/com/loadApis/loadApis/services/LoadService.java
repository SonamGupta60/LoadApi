package com.loadApis.loadApis.services;
import com.loadApis.loadApis.entities.Load;

import java.util.List;
import java.util.Optional;

public interface LoadService {
    List<Load> getLoads();

   Optional <Load> getLoad(long loadId);
    Load save(Load load);

    List<Load> deleteLoad(long loadId);

    Load updateLoad(Load load, int loadId);
}
