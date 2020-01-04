package com.itsol.mockup.repository;

import com.itsol.mockup.entity.TacGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITacGiaRespository extends JpaRepository<TacGia, Long> {
}
