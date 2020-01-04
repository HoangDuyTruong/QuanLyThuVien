package com.itsol.mockup.web.rest;

import com.itsol.mockup.entity.DanhMucSach;
import com.itsol.mockup.repository.IDanhMucSach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/danhmuc")
@CrossOrigin
public class DanhMucController {

    @Autowired
    private IDanhMucSach danhMucSach ;

    @GetMapping
    public List<DanhMucSach> list(){
        return  danhMucSach.findAll();
    }
}
