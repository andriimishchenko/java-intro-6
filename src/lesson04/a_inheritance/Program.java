package lesson04.a_inheritance;

public class Program {
    public static void main(String[] args) {
        Vehicle car1=new Truck("Volvo",2008);
        Vehicle car2=new PassengerCar("Mercedes",2018);
        Vehicle car3=new Truck("Cat",2001);
        Vehicle car4=new Truck("Renault",2005);
        Vehicle car=new PassengerCar("Voltswagen",2010);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car);

        car1.gas();
        car2.gas();
        car3.stop();
    }
}
