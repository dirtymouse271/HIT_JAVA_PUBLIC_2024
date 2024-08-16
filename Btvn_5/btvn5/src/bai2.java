import java.util.Scanner;

class Manager {
    private String name;
    private String id;

    public Manager(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        this.id = scanner.nextLine();
    }

    public void output() {
        System.out.println("Manager Name: " + this.name);
        System.out.println("Manager ID: " + this.id);
    }
}

class Computer {
    private String computerName;
    private String specifications;

     public Computer() {
        this.computerName = computerName;
        this.specifications = specifications;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter computer name: ");
        this.computerName = scanner.nextLine();
        System.out.print("Enter computer specifications: ");
        this.specifications = scanner.nextLine();
    }

     public void output() {
        System.out.println("Computer Name: " + this.computerName);
        System.out.println("Specifications: " + this.specifications);
    }
}

class Room {
    private String roomName;
    private Manager manager;
    private Computer[] computers;
    private int numberOfComputers;

     public Room() {
        this.roomName = roomName;
        this.manager = manager;
        this.computers = computers;
        this.numberOfComputers = computers.length;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        this.roomName = scanner.nextLine();

        this.manager.input();

        this.numberOfComputers = scanner.nextInt();
        scanner.nextLine();

        computers = new Computer[this.numberOfComputers];
        for (int i = 0; i < this.numberOfComputers; i++) {
            computers[i] = new Computer();
            computers[i].input();
        }
    }

    public void output() {
        System.out.println("Room Name: " + this.roomName);
        this.manager.output();

        for (int i = 0; i < this.numberOfComputers; i++) {
            computers[i].output();
            System.out.println();
        }
    }
}

public class bai2 {
    public static void main(String[] args) {
        Room room = new Room();
        room.input();
        room.output();
    }
}