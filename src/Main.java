import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bmw", "Bmw", 2021, 2.5);
        car.setCarInfo("Toyota", "Toyota", 2021, 2.5);
        car.displayData();
        System.out.println();

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        Country country = new Country("Ukraine", "Europe", 126_476_461, "+38", "Kyiv", List.of("Odesa", "Lviv", "Uzhhorod"));
        country.displayData();
        System.out.println();

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Charles Scribner's Sons", "Novel", 180);
        book.setBookInfo("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Charles Scribner's Sons", "Novel", 180);
        book.displayData();
    }
}