abstract class Dog {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public abstract void bark();

    public void run() {
        System.out.println("Собака бежит");
    }

    public void sleep() {
        System.out.println("Собака спит");
    }

    public String getBreed() {
        return breed;
    }
}

// Породы собак
class Labrador extends Dog {
    public Labrador() {
        super("Лабрадор");
    }

    public void bark() {
        System.out.println("Лабрадор лает");
    }
}

class Bulldog extends Dog {
    public Bulldog() {
        super("Бульдог");
    }

    public void bark() {
        System.out.println("Бульдог лает");
    }
}

class Poodle extends Dog {
    public Poodle() {
        super("Пудель");
    }

    public void bark() {
        System.out.println("Пудель лает");
    }
}

