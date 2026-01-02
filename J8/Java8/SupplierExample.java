package Java8;

import java.util.function.Supplier;
import java.time.LocalTime;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> currentTime = () -> LocalTime.now().toString();

        System.out.println("Current Time: " + currentTime.get());
    }
}
