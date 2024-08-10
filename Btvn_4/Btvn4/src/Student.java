public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double diemTX1;
    private double diemTX2;
    private double diemKTHP;
    private int soTietNghi;
    private int namHienTai;

     public Student(String ten, int namSinh, String diaChi, double diemTX1, double diemTX2, double diemKTHP, int soTietNghi, int namHienTai){
            this.ten = ten;
            this.namSinh = namSinh;
            this.diaChi = diaChi;
            this.diemTX1 = diemTX1;
            this.diemTX2 = diemTX2;
            this.diemKTHP = diemKTHP;
            this.soTietNghi = soTietNghi;
            this.namHienTai = namHienTai;
    }
    public int tuoi(){
        return (this.namHienTai - namSinh);
    }
    public void display(){
        System.out.print("Ten: " + ten+ " "+ ",");
        System.out.print("Tuoi: " + tuoi()+ " "+ ",");
        System.out.print("Dia chi: " + diaChi+ " "+ ",");
        System.out.print("Diem TX1: " + diemTX1+ " "+ ",");
        System.out.print("Diem TX2: " + diemTX2+ " "+ ",");
        System.out.print("Diem KTHP: " + diemKTHP+ " "+ ",");
        System.out.print("Diem GPA: " + diemGPA()+ " "+ ",");
        System.out.print("SoTiet Nghi: " + soTietNghi+ ".");
    }

    public double diemGPA(){
        double diemGPA = (diemTX1 * 0.2 + diemTX2 * 0.3 + diemKTHP * 0.5);
        return diemGPA;
    }
    public void setTen(String ten1){
        ten = ten1;
    }
    public void setNamSinh(int namSinh1){
        namSinh = namSinh1;
    }
    public void setDiaChi(String diaChi1){
        diaChi = diaChi1;
    }
    public void setDiemTX1(double diemTX1){
        diemTX1 = this.diemTX1;
    }
    public void setDiemTX2(double diemTX2){
        diemTX2 = this.diemTX2;
    }
    public void setDiemKTHP(double diemKTHP){
        diemKTHP = this.diemKTHP;
    }
    public void setSoTietNghi(int soTietNghi){
        soTietNghi = this.soTietNghi;
    }

}

