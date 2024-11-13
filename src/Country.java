import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String name;
    private String continent;
    private long population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country(String name, String continent, long population, String phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>(cities);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country: ");
        this.name = scanner.nextLine();
        System.out.print("Enter continent: ");
        this.continent = scanner.nextLine();
        System.out.print("Enter population: ");
        this.population = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter phone code: ");
        this.phoneCode = scanner.nextLine();
        System.out.print("Enter capital: ");
        this.capital = scanner.nextLine();

        System.out.print("Enter cities amount: ");
        int cityAmount = scanner.nextInt();
        scanner.nextLine();
        this.cities = new ArrayList<>();
        for (int i = 0; i < cityAmount; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            String city = scanner.nextLine();
            this.cities.add(city);
        }

    }

    public void displayData() {
        System.out.println("Country: " + this.name);
        System.out.println("Continent: " + this.continent);
        System.out.println("Population: " + this.population);
        System.out.println("Phone code: " + this.phoneCode);
        System.out.println("Capital: " + this.capital);
        System.out.println("Cities: " + String.join(", ", this.cities));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return new ArrayList<>(cities);
    }

    public void setCities(List<String> cities) {
        this.cities = new ArrayList<>(cities);
    }

    public void addCity(String city) {
        this.cities.add(city);
    }

    public void addCity(List<String> cities) {
        this.cities.addAll(cities);
    }
}
