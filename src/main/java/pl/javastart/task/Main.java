package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(23.7, 25.5, true, 20.5);
        Room room2 = new Room(12.8, 22.0, true, 21.0);
        Room room3 = new Room(15.2, 26.0, false, 21.5);
        Room room4 = new Room(10.2, 21.5, true, 21.0);

        System.out.println("Temperatura aktualna w pokoju numer 1: " + room1.getCurrentTemperature());
        System.out.println(room1.decreaseTemperature());
        System.out.println("Temperatura aktualna w pokoju numer 1: " + room1.getCurrentTemperature());
        System.out.println("----------");
        System.out.println("Temperatura aktualna w pokoju numer 2: " + room2.getCurrentTemperature());
        System.out.println(room2.decreaseTemperature());
        System.out.println("Temperatura aktualna w pokoju numer 2: " + room2.getCurrentTemperature());
        System.out.println("----------");
        System.out.println("Temperatura aktualna w pokoju numer 3: " + room3.getCurrentTemperature());
        System.out.println(room3.decreaseTemperature());
        System.out.println("Temperatura aktualna w pokoju numer 3: " + room3.getCurrentTemperature());
        System.out.println("----------");
        System.out.println("Temperatura aktualna w pokoju numer 4: " + room4.getCurrentTemperature());
        System.out.println(room4.decreaseTemperature());
        System.out.println("Temperatura aktualna w pokoju numer 4: " + room4.getCurrentTemperature());
        System.out.println("----------");

    }
}
