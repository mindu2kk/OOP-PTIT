package model;


public class SinhVien {

    private String maSinhVien;
    private String hoTen;
    private int tuoi;
    private String ngaySinh;
    private char gioiTinh;
    private String diaChi;
    private String email;
    private String sdt;
    private String CCCD;
    private String maLop;
    

    // Default constructor
    public SinhVien() {
    }

    // Constructor with all fields
    public SinhVien(String maSinhVien, String hoTen,int tuoi, String ngaySinh, char gioiTinh, String diaChi, String email, String sdt, String CCCD, String maLop) {
        setMaSinhVien(maSinhVien);
        setHoTen(hoTen);
        setTuoi(tuoi);
        setNgaySinh(ngaySinh);
        setGioiTinh(gioiTinh);
        setDiaChi(diaChi);
        setEmail(email);
        setSdt(sdt);
        setCCCD(CCCD);
        setMaLop(maLop);
    }

    // --- Getters and Setters ---

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        if(maSinhVien.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap Msv.");
            return;
        }
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        if(hoTen.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap ten.");
            return;
        }
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi<18){
            System.out.println("ERROR: Tuoi khong hop le!");
            return;
        }
        String s= Integer.toString(tuoi);
        if(s.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap tuoi.");
            return;
        }
        this.tuoi=tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        if(ngaySinh.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap ngay sinh.");
            return;
        }
        this.ngaySinh = ngaySinh;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        char s=Character.toUpperCase(gioiTinh);
        if(s!= 'N' && s!='F' &&s!='O'){
            System.out.println("ERROR: Gioi tinh khong hop le!");
            return;
        }
        if(gioiTinh == '\u0000') {
            System.out.println("ERROR: Hay nhap gioi tinh.");
            return;
        }
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if(diaChi.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap dia chi.");
            return;
        }
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap email.");
            return;
        }
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }


    public void setSdt(String sdt) {
        if(sdt.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap so dien thoai.");
            return;
        }
        this.sdt = sdt;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        if(CCCD.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap CCCD.");
            return;
        }
        this.CCCD = CCCD;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        if(maLop.trim().isEmpty()){
            System.out.println("ERROR: Hay nhap ma lop.");
            return;
        }
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", maLop='" + maLop + '\'' +
                '}';
    }
}
