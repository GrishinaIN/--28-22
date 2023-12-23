import java.util.ArrayList;
import java.util.List;
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}

// Класс, представляющий стул
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName() + ", цена: " + getPrice() + " рублей, количество ножек: " + numberOfLegs);
    }
}

class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName() + ", цена: " + getPrice() + " рублей, количество мест: " + numberOfSeats);
    }
}

// Класс магазина мебели
 class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayAllFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.displayInfo();
        }
    }
}