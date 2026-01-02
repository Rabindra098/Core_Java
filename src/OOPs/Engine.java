package OOPs;

class Engine {
    void startEngine() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine engine = new Engine();   // Car HAS-A Engine

    void start() {
        engine.startEngine();
        System.out.println("Car is running");
    }
    public static void main(String[] args) {
    	 Car c = new Car();
         c.start();
	}
}


