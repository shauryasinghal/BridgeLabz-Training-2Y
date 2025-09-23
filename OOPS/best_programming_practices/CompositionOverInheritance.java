
// Demonstrates composition over inheritance
class Engine {
    void start() {
        System.out.println("Engine starting...");
    }
}

class Vehicle {
    private Engine engine = new Engine();

    void startVehicle() {
        engine.start();
        System.out.println("Vehicle is ready to go!");
    }
}
