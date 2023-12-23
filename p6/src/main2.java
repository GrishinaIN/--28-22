public class main2 {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair1 = new Chair("Стул кухонный", 1000, 4);
        Chair chair2 = new Chair("Стул офисный", 1500, 5);
        Table table1 = new Table("Стол письменный", 3000, 1);
        Table table2 = new Table("Стол обеденный", 5000, 4);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(table1);
        shop.addFurniture(table2);

        shop.displayAllFurniture();
    }
}