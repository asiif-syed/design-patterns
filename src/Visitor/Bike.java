package Visitor;

public class Bike implements Vehicle{
    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
