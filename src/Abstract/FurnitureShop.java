package Abstract;

public class FurnitureShop {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public  FurnitureShop(FurnitureFactory furnitureFactory){
        this.chair = furnitureFactory.createChair();
        this.sofa = furnitureFactory.createSofa();
        this.coffeeTable = furnitureFactory.createCoffeeTable();
    }

    public void furnishRoom(){
        this.chair.sitOn();
        this.sofa.layOn();
        this.coffeeTable.placeItems();
    }
}
