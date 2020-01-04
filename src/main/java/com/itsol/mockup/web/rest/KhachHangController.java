package com.itsol.mockup.web.rest;


import com.itsol.mockup.entity.KhachHang;
import com.itsol.mockup.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("khachhang")
@CrossOrigin
@RestController
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @ResponseBody
    @GetMapping(value = "findAll")
    public List<KhachHang> findAll() {
        return khachHangService.findAll();
    }

    @ResponseBody
    @GetMapping(value = "findById")
    public KhachHang findById(@RequestParam("id") Long id) {
        return khachHangService.findById(id);
    }

    @ResponseBody
    @PostMapping(value = "add")
    public KhachHang add(@RequestBody KhachHang khachHang) {
        return khachHangService.add(khachHang);
    }

    @ResponseBody
    @PutMapping(value = "update")
    public KhachHang update(@RequestBody KhachHang khachHang) {
        return khachHangService.update(khachHang);
    }

    @ResponseBody
    @DeleteMapping(value = "delete")
    public Boolean delete(@RequestParam("id") Long id) {
        return khachHangService.delete(id);
    }
}
