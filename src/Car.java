import java.util.Scanner;

public class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter the manufacturer: ");
        this.manufacturer = scanner.nextLine();

        System.out.print("Enter the year of manufacture: ");
        this.year = scanner.nextInt();

        System.out.print("Enter the engine volume (L): ");
        this.engineVolume = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Car Name: " + this.name);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Year: " + this.year);
        System.out.println("Engine Volume: " + this.engineVolume + "L");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setCarInfo(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void setCarInfo(String name, String manufacturer, int year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public void setCarInfo(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }
}
