package com.itsol.mockup.service;

import com.itsol.mockup.entity.NhanVien;
import com.itsol.mockup.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(Long id) {
        return nhanVienRepository.getOne(id);
    }

    @Override
    public NhanVien add(NhanVien nhanVien) {
        try {
            nhanVienRepository.save(nhanVien);
            return nhanVien;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public NhanVien update(NhanVien nhanVien) {
        try {
            NhanVien saved = nhanVienRepository.getOne(nhanVien.getNhanVienId());
            if (saved != null) {
                saved.setDiaChi(nhanVien.getDiaChi());
                saved.setEmail(nhanVien.getEmail());
                saved.setSDT(nhanVien.getSDT());
                saved.setTenNhanVien(nhanVien.getTenNhanVien());
                nhanVienRepository.save(saved);
                return saved;
            }
            return null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try {
            NhanVien nhanVien = nhanVienRepository.getOne(id);
            if (nhanVien != null) {
                nhanVienRepository.delete(nhanVien);
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
