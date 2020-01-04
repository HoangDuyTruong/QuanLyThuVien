package com.itsol.mockup.web.rest;

import com.itsol.mockup.entity.Sach;
import com.itsol.mockup.repository.ISachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.List;

@RestController
@RequestMapping("/sachs")
@CrossOrigin
public class SachContronller {

    @Autowired
    private  ISachRepository iSachRepository;

    @GetMapping
    @CrossOrigin
    public List<Sach> list (){
        return iSachRepository.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Sach getbyId (Long id){
        return iSachRepository.getOne(id);
    }
    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {

        iSachRepository.deleteById(id);
    }

    @PostMapping
    public Sach save(@RequestBody Sach sach){
        return iSachRepository.save(sach);
    }
    @PutMapping
    public Sach update(@RequestBody Sach sach){
        return iSachRepository.save(sach);
    }
}
