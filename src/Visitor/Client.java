package Visitor;

public class Client {
    public static void main(String[] args){
        Car car = new Car();
        Bike bike = new Bike();
        Bus bus = new Bus();

//        Creating Maintenance visitor
        VehicleVisitor maintenanceCostVisitor = new MaintenanceCostVisitor();
        car.accept(maintenanceCostVisitor);
        bus.accept(maintenanceCostVisitor);
        bike.accept(maintenanceCostVisitor);

//        Creating Insurance visitor
        VehicleVisitor insuranceCostVisitor = new InsuranceCostVisitor();
        car.accept(insuranceCostVisitor);
        bus.accept(insuranceCostVisitor);
        bike.accept(insuranceCostVisitor);
    }
}
