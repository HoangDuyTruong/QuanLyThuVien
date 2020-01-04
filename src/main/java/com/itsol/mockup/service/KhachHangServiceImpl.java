package com.itsol.mockup.service;

import com.itsol.mockup.entity.KhachHang;
import com.itsol.mockup.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang findById(Long id) {
        return khachHangRepository.getOne(id);
    }

    @Override
    public KhachHang add(KhachHang khachHang) {
        try {
            khachHangRepository.save(khachHang);
            return khachHang;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public KhachHang update(KhachHang khachHang) {
        try {
            khachHangRepository.save(khachHang);
            return khachHang;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try {
            KhachHang khachHang = khachHangRepository.getOne(id);
            if (khachHang != null) {
                khachHangRepository.delete(khachHang);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
