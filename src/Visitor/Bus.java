package Visitor;

public class Bus implements Vehicle{
    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
