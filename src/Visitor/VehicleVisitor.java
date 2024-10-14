package Visitor;

public interface VehicleVisitor {
    public void visit(Bus bus);
    public void visit(Car car);
    public void visit(Bike bike);
}
