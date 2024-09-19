class Car {
     String color;
     String name;
     int year;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Description: " + color);
    }
}
public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.name = "BMW";
        car.year = 2018;
        car.display();
    }
}
