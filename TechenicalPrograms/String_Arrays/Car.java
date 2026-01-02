package String_Arrays;

class Car {

    private final int manYear = 2020;
    private final String model = "Swift";
   
    private String color;
    private String owner;
   
    public Car(String color, String owner) {
        this.color = color;
        this.owner = owner;
    }
   
    public void displayCarInfo() {
        System.out.println("Car Model: " +model );
        System.out.println("Manufacturing Year: " +manYear );
        System.out.println("Color: " + color);
        System.out.println("Owner: " + owner);
    }
    public static void main(String[] args) {
        Car car = new Car("White", "Rajesh");
        car.displayCarInfo();
    }
}


