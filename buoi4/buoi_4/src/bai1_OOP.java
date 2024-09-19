class Student {
    private String ten;
    private int namsinh;
    private double tx1;
    private double tx2;
    private double kthp;
    private double dgpa;
    public Student(String ten, int namsinh, double diemtx1, double diemtx2, double kthp,double dgpa ) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.dgpa = dgpa;
    }

    public void display() {
        System.out.println("Ten: " + ten);
        System.out.println("Namsinh: " + namsinh);
        System.out.println("Diemtx1: " + tx1);
        System.out.println("Diemtx2: " + tx2);
        System.out.println("Diemkthp: " + kthp);
        System.out.println("Dgpa: " + dgpa);
    }
}
public class bai1_OOP {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van A",2005,9,9,4);
        Student student1 = new Student("Nguyen Van B",2005,8,8,3.9);
        Student student2 = new Student("Nguyen Van C",2005,7,7,3.);
        Student student3 = new Student("Nguyen Van D",2005,6,6,3.9);
    }
}
