package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "danhmucsach")
public class DanhMucSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "danhmucsachid")
    private int DanhMucSachId;

    @Column(name = "tendanhmuc")
    private String TenDanhMuc;

    @Column(name = "mota")
    private  String MoTa;
}
