package com.itsol.mockup.web.rest;

import com.itsol.mockup.entity.NhanVien;
import com.itsol.mockup.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("nhanvien")
@CrossOrigin
@RestController
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @ResponseBody
    @GetMapping(value = "findAll")
    public List<NhanVien> findAll() {
        return nhanVienService.findAll();
    }

    @ResponseBody
    @GetMapping(value = "findById")
    public NhanVien findById(@RequestParam("id") Long id) {
        return nhanVienService.findById(id);
    }

    @ResponseBody
    @PostMapping(value = "add")
    public NhanVien add(@RequestBody NhanVien nhanVien) {
        return nhanVienService.add(nhanVien);
    }

    @ResponseBody
    @PutMapping(value = "update")
    public NhanVien update(@RequestBody NhanVien nhanVien) {
        return nhanVienService.update(nhanVien);
    }

    @ResponseBody
    @DeleteMapping(value = "delete")
    public Boolean delete(@RequestParam("id") Long id) {
        return nhanVienService.delete(id);
    }


}
