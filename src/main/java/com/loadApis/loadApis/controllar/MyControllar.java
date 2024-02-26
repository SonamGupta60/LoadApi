package com.loadApis.loadApis.controllar;

import com.loadApis.loadApis.entities.Load;
import com.loadApis.loadApis.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyControllar {
    @Autowired
    private LoadService loadService;

    @PostMapping("/load")
    public Load addLoad(@RequestBody Load load){
        return this.loadService.save(load);
    }
    @GetMapping ("/load")
    public List<Load> getLoads(){
        return this.loadService.getLoads();
    }

    @GetMapping ("/load/{loadId}")
    public Optional<Load> getLoads(@PathVariable long loadId){
        return this.loadService.getLoad(loadId);
    }


    @PutMapping("/load/{loadId}")
    public Load UpdateLoad(@RequestBody Load load,@PathVariable int loadId) {
        return this.loadService.updateLoad(load,loadId);
    }
    @DeleteMapping("/load/{loadId}")
    public List<Load> deleteLoad(@PathVariable long loadId){
         return this.loadService.deleteLoad(loadId);
    }

}
