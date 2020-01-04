package com.itsol.mockup.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "nhanvien")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class NhanVien implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nhanvienid")
    private Long NhanVienId;

    @Column(name = "tennhanvien")
    private String TenNhanVien;

    @Column(name = "email")
    private String Email;

    @Column(name = "diachi")
    private String DiaChi;

    @Column(name = "sdt")
    private String SDT;
}
