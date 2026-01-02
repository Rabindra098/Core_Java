package Java11;
import java.util.ArrayList;
import java.util.List;

public class G1GCDemo {

    public static void main(String[] args) throws InterruptedException {

        List<byte[]> memoryList = new ArrayList<>();

        System.out.println("G1GC Demo Started...");

        // Continuously allocate memory
        for (int i = 1; i <= 1000; i++) {

            // Allocate 1 MB blocks
            memoryList.add(new byte[1024 * 1024]);

            if (i % 50 == 0) {
                System.out.println("Allocated " + i + " MB");
                Thread.sleep(200); // slow down to observe GC logs
            }
        }

        System.out.println("G1GC Demo Finished.");
    }
}
