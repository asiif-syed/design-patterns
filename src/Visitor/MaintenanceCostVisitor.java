package Visitor;

public class MaintenanceCostVisitor implements VehicleVisitor{
    @Override
    public void visit(Bus bus) {
        System.out.println("Bus maintenance cost: $800");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Bike maintenance cost: $100");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Car maintenance cost: $500");
    }
}
