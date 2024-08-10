//Phần này copy chatGPT em không biết sai ở đâu:))
import java.util.*;
public class MainMenu {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int NAM_HIEN_TAI = 2024;
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    sortByAge();
                    break;
                case 4:
                    sortByGPA();
                    break;
                case 5:
                    sortByAbsent();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 0:
                    running = false;
                    System.out.println("Đã thoát.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }
        }
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập điểm TX1: ");
        double diemTX1 = scanner.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        double diemTX2 = scanner.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        double diemKTHP = scanner.nextDouble();
        System.out.print("Nhập số tiết nghỉ: ");
        int soTietNghi = scanner.nextInt();
        scanner.nextLine();
        students.add(new Student(ten, namSinh, diaChi, diemTX1, diemTX2, diemKTHP, soTietNghi));
        System.out.println("Sinh viên đã được thêm.");
    }

    private static void editStudent() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String ten = scanner.nextLine();
        for (Student student : students) {
            if (student.getTen().equalsIgnoreCase(ten)) {
                System.out.print("Nhập năm sinh mới: ");
                int namSinh = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Nhập địa chỉ mới: ");
                String diaChi = scanner.nextLine();
                System.out.print("Nhập điểm TX1 mới: ");
                double diemTX1 = scanner.nextDouble();
                System.out.print("Nhập điểm TX2 mới: ");
                double diemTX2 = scanner.nextDouble();
                System.out.print("Nhập điểm KTHP mới: ");
                double diemKTHP = scanner.nextDouble();
                System.out.print("Nhập số tiết nghỉ mới: ");
                int soTietNghi = scanner.nextInt();
                scanner.nextLine(); // consume newline

                students.remove(student);
                students.add(new Student(ten, namSinh, diaChi, diemTX1, diemTX2, diemKTHP, soTietNghi));
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Sinh viên không tìm thấy.");
    }

    private static void sortByAge() {
        students.sort(Comparator.comparingInt(s -> s.tuoi(NAM_HIEN_TAI)));
        displayStudents();
    }

    private static void sortByGPA() {
        students.sort(Comparator.comparingDouble(Student::diemGPA).reversed());
        displayStudents();
    }

    private static void sortByAbsent() {
        students.sort(Comparator.comparingInt(Student::getSoTietNghi));
        displayStudents();
    }

    private static void deleteStudent() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String ten = scanner.nextLine();
        Iterator<Student> iterator = students.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getTen().equalsIgnoreCase(ten)) {
                iterator.remove();
                System.out.println("Sinh viên đã được xóa.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Sinh viên không tìm thấy.");
        }
    }

    private static void displayStudents() {
        System.out.printf("%-20s %-5s %-30s %-8s %-8s %-8s %-8s %-5s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for (Student student : students) {
            student.display(NAM_HIEN_TAI);
        }
    }
}