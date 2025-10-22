package model;


public class GiangVien {

    private String maGiangVien;
    private String hoVaTen;
    private int Age;
    private String email;
    private String soDienThoai;
    private String maKhoa; 
    private String ngaySinh;
    private char gioiTinh; 
    private String hocVi; // Degree: e.g., "Cử nhân", "Thạc sĩ", "Tiến sĩ"
    private String hocHam; // Academic Rank: e.g., "GS", "PGS"


    // Default constructor
    public GiangVien() {
    }

    // Constructor with all fields
    public GiangVien(String maGiangVien, String hoVaTen,int Age, String email, String soDienThoai,String maKhoa, String ngaySinh, char gioiTinh, String hocVi, String hocHam) {
        setMaGiangVien(maGiangVien);
        setHoVaTen(hoVaTen);
        setAge(Age);
        setEmail(email);
        setSoDienThoai(soDienThoai);
        setMaKhoa(maKhoa);
        setNgaySinh(ngaySinh);
        setGioiTinh(gioiTinh);
        setHocVi(hocVi);
        setHocHam(hocHam);
    }


    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        if(maGiangVien.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap ma giang vien.");
            return;
        }
        this.maGiangVien = maGiangVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        if(hoVaTen.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap ten.");
            return;
        }
        this.hoVaTen = hoVaTen;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        if(Age<18){
            System.out.println("ERROR: Tuoi khong hop le. Chua do cap 3!");
            return;
        }
        String s=Integer.toString(Age);
        if(s.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap tuoi.");
            return;
        }
        this.Age=Age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap email.");
            return;
        }
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        if(soDienThoai.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap so dien thoai.");
            return;
        }
        this.soDienThoai = soDienThoai;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        if(maKhoa.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap ma khoa.");
            return;
        }
        this.maKhoa = maKhoa;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        if(ngaySinh.trim().isEmpty())  {
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
        if(gioiTinh == '\u0000')  {
            System.out.println("ERROR: Hay nhap gioi tinh.");
            return;
        }

        this.gioiTinh = gioiTinh;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        if(hocVi.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap hoc vi.");
            return;
        }
        this.hocVi = hocVi;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        if(hocHam.trim().isEmpty())  {
            System.out.println("ERROR: Hay nhap hoc ham.");
            return;
        }
        this.hocHam = hocHam;
    }

    
    @Override
    public String toString() {
        String rank = (hocHam != null && !hocHam.isEmpty()) ? hocHam + " " : "";
        String degree = (hocVi != null && !hocVi.isEmpty()) ? hocVi + " " : "";
        return rank + degree + hoVaTen + " (" + maGiangVien + ")";
    }
}
