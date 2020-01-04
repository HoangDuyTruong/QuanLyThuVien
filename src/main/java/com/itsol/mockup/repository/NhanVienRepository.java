package com.itsol.mockup.repository;

import com.itsol.mockup.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {
}
