package Multithreading;

class Customer implements Runnable {
    private int availableSeat = 2;
    private int wantedSeat;

    public Customer(int wantedSeat) {
        this.wantedSeat = wantedSeat;
    }

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();

        if (availableSeat >= wantedSeat) {
            System.out.println(wantedSeat + " seat is booked for " + name);
            availableSeat = availableSeat - wantedSeat;
        } else {
            System.err.println("Sorry! " + name + " berth is not available");
        }
    }
}

public class RailwayReservation {
    public static void main(String[] args) throws Exception {
        Customer c = new Customer(1);

        Thread t1 = new Thread(c, "Virat");
        Thread t2 = new Thread(c, "Rohit");
        Thread t3 = new Thread(c, "Hardik");

        t1.start();
        t2.start();
        t3.start();
    }
}
