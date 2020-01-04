package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "sachmuon")
public class SachMuon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sachmuonid")
    private int SachMuonId;

    @Column(name="tensach")
    private String TenSach;

    @Column(name="motangan")
    private  String MoTaNgan;


    @Column(name="ngaymuon")
    private Date NgayMuon;

    @Column(name = "ngaytra")
    private  Date NgayTra;

    @Column(name = "trangthai")
    private  int TrangThai;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nhanvienid", referencedColumnName = "nhanvienid")
    private NhanVien nhanVien;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "khachhangid", referencedColumnName = "khachhangid")
    private KhachHang khachHang;
}
