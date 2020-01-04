package com.itsol.mockup.service;

import com.itsol.mockup.entity.NhanVien;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NhanVienService {
    List<NhanVien> findAll();
    NhanVien findById(Long id);
    NhanVien add(NhanVien nhanVien);
    NhanVien update(NhanVien nhanVien);
    Boolean delete(Long id);
}
