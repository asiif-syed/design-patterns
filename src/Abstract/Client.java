package Abstract;

public class Client {
    public static void main(String[] args){
        System.out.println("Creating modern furniture!!!");
//        Creating modern furniture
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureShop modernFurniture = new FurnitureShop(modernFurnitureFactory);
        modernFurniture.furnishRoom();

        System.out.println("Creating vintage furniture!!!");
//        Creating vintage furniture
        VintageFurnitureFactory vintageFurnitureFactory = new VintageFurnitureFactory();
        FurnitureShop vintageFurniture = new FurnitureShop(vintageFurnitureFactory);
        vintageFurniture.furnishRoom();
    }
}
