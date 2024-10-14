package Visitor;

public class InsuranceCostVisitor implements VehicleVisitor{
    @Override
    public void visit(Bus bus) {
        System.out.println("Bus insurance cost: $500");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Bike insurance cost: $120");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Car insurance cost: $300");
    }
}
