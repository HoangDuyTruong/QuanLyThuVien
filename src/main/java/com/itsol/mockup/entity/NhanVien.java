package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nhanvienid")
    private int NhanVienId;


    @Column(name = "tennhanvien")
    private String TenNhanVien;

    @Column(name = "email")
    private  String Email;

    @Column(name = "diachi")
    private  String DiaChi;

    @Column(name = "sdt")
    private  String SDT;
}
