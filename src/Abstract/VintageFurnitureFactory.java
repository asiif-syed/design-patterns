package Abstract;

public class VintageFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Sofa createSofa() {
        return new VintageSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VintageCoffeeTable();
    }
}
