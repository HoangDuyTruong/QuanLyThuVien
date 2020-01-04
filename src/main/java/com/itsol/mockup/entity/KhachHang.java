package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khachhangid")
    private int KhachHangId;


    @Column(name = "tenkhachhang")
    private String TenKhachHang;

    @Column(name = "ngaysinh")
    private Date NgaySinh;

    @Column(name = "socmt")
    private  String SoCmt;

    @Column(name = "diachi")
    private  String DiaChi;

    @Column(name = "sdt")
    private  String SDT;
}
