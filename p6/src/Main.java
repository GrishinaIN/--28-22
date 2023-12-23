public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("Ceramic", 500, false);
        Cup cup = new Cup("Glass", 250, true);

        plate.use();
        plate.clean();
        plate.stack();

        cup.use();
        cup.clean();
        cup.fill();
    }
}