package com.itsol.mockup.web.dto;

import com.itsol.mockup.entity.DanhMucSach;
import com.itsol.mockup.entity.TacGia;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SachDTO {
    private int SachID;
    private String TenSach;
    private  String MoTaNgan;
    private  int SoTrang;
    private  int SoLuong;
    private  int TrangThai;
    private TacGia tacgia;
    private DanhMucSach danhMucSach;
}
