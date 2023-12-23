abstract class Dish {
    protected String material;
    protected int capacity;

    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public abstract void use();

    public void clean() {
        System.out.println("Cleaning the dish...");
    }
}

class Plate extends Dish {
    private boolean hasDivider;

    public Plate(String material, int capacity, boolean hasDivider) {
        super(material, capacity);
        this.hasDivider = hasDivider;
    }

    public void use() {
        System.out.println("Using the plate to serve food.");
    }

    public void stack() {
        System.out.println("Stacking the plates.");
    }
}

class Cup extends Dish {
    private boolean hasHandle;

    public Cup(String material, int capacity, boolean hasHandle) {
        super(material, capacity);
        this.hasHandle = hasHandle;
    }

    public void use() {
        System.out.println("Using the cup to drink.");
    }

    public void fill() {
        System.out.println("Filling the cup with liquid.");
    }
}
