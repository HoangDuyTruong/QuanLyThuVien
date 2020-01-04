package com.itsol.mockup.web.rest;

import com.itsol.mockup.entity.TacGia;
import com.itsol.mockup.repository.ITacGiaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tacgias")
public class TacGiaController {

    @Autowired
    private ITacGiaRespository iTacGiaRespository;

    @CrossOrigin
    @GetMapping
    public List<TacGia> list() {
        return iTacGiaRespository.findAll();
    }
}
