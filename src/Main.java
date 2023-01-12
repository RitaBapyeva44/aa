import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.name = " Toyota";
        car.yearProdukt = 2022;
        car.coloor = "bleak";
        System.out.println("Name:" + car.name );
        System.out.println("yaaa: "+car.yearProdukt);
        System.out.println("Colop:"+car.coloor);
        car.jurot();



    }
}