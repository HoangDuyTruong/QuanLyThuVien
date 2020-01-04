package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "Sach")
public class Sach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sachid")
    private Long SachID;

    @Column(name="tensach")
    private String TenSach;

    @Column(name="motangan")
    private  String MoTaNgan;


    @Column(name="sotrang")
    private  int SoTrang;

    @Column(name = "soluong")
    private  int SoLuong;

    @Column(name = "trangthai")
    private  int TrangThai;


    @OneToOne(cascade = {
            CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "tacgiaid", referencedColumnName = "tacgiaid")
    private TacGia tacgia;


    @OneToOne(cascade = {
            CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "danhmucsachid", referencedColumnName = "danhmucsachid")
    private DanhMucSach danhMucSach;

}
