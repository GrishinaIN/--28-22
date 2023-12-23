public class main1 {
    public static void main(String[] args) {
        Dog labrador = new Labrador();
        Dog bulldog = new Bulldog();
        Dog poodle = new Poodle();

        labrador.bark();
        bulldog.bark();
        poodle.bark();

        labrador.run();
        bulldog.sleep();
        poodle.run();

        System.out.println("Порода лабрадора: " + labrador.getBreed());
        System.out.println("Порода бульдога: " + bulldog.getBreed());
        System.out.println("Порода пуделя: " + poodle.getBreed());
    }
}