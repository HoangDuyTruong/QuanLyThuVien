package com.itsol.mockup.service;


import com.itsol.mockup.entity.KhachHang;
import com.itsol.mockup.entity.KhachHang;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KhachHangService {
    List<KhachHang> findAll();
    KhachHang findById(Long id);
    KhachHang add(KhachHang khachHang);
    KhachHang update(KhachHang khachHang);
    Boolean delete(Long id);
}
