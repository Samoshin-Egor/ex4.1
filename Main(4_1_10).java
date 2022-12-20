package ex4_1_10;

public class Main {
    public static void main(String args[]){
        car car = new car();
        plane plane = new plane();
        train train = new train();
        ship ship = new ship();
        car.setTimeP(120.12);
        car.setPriceP(333.33);
        car.setTimeG(8000.00);
        car.setPriceG(2500.12);

        plane.setTimeP(122.15);
        plane.setPriceP(300.11);
        plane.setTimeG(8500.00);
        plane.setPriceG(2512.12);

        train.setTimeP(121.17);
        train.setPriceP(305.10);
        train.setTimeG(8550.22);
        train.setPriceG(2712.92);

        ship.setTimeP(161.44);
        ship.setPriceP(895.19);
        ship.setTimeG(8491.99);
        ship.setPriceG(1989.92);

        System.out.println("car: ");
        System.out.println("Passenger time:" + car.timeP);
        System.out.println("Passenger price:" + car.priceP);
        System.out.println("Gryz time:" + car.timeG);
        System.out.println("Gryz price:" + car.priceG);
        System.out.println();
        System.out.println("plane: ");
        System.out.println("Passenger time:" + plane.timeP);
        System.out.println("Passenger price:" + plane.priceP);
        System.out.println("Gryz time:" + plane.timeG);
        System.out.println("Gryz price:" + plane.priceG);
        System.out.println();
        System.out.println("train: ");
        System.out.println("Passenger time:" + train.timeP);
        System.out.println("Passenger price:" + train.priceP);
        System.out.println("Gryz time:" + train.timeG);
        System.out.println("Gryz price:" + train.priceG);
        System.out.println();
        System.out.println("ship: ");
        System.out.println("Passenger time:" + ship.timeP);
        System.out.println("Passenger price:" + ship.priceP);
        System.out.println("Gryz time:" + ship.timeG);
        System.out.println("Gryz price:" + ship.priceG);
    }
}
