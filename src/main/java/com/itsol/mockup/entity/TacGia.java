package com.itsol.mockup.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "tacgia")
public class TacGia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tacgiaid")
    private int TacGiaId;

    @Column(name = "tengia")
    private String TenGia;

    @Column(name = "mota")
    private  String MoTa;

    @Column(name = "sdt")
    private  String SDT;

}
