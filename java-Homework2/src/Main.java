
public class Main {
	public static void main(String[] args) {
        Car car1 = new Car(1, "Renault Fluence", "06 ABCD 0000", "Sedan", "Müdür");

        Car car2 = new Car(2, "JEEP CJ-8", "75 ARDHN 0075", "OFF-ROAD", "Arkeolog");

        Car car3 = new Car(3, "Ford Focus", "25 BLAH 0025", "Sedan", "Memur");

        Car car4 = new Car(4, "For Super Duty", "06 ANKR 0006", "Pickup", "Arkeolog");

        Car[] cars = {car1, car2, car3, car4};


        for (Car car : cars) {

            System.out.println(car.name);
            System.out.println("----------------");

        }
        System.out.println(cars.length);
        System.out.println("----------------");
        
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Müdürler için Gönderilecek Görev Araçlarý";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Memurlar için Gönderilecek Görev Araçlarý";

        Category category3 = new Category();
        category3.id = 3;
        category3.name = "Arkeologlar için Gönderilecek Görev Araçlarý";

        CarManager carManager = new CarManager();
        carManager.addToAssignment(car1);
        carManager.addToAssignment(car2);
        carManager.addToAssignment(car3);
        carManager.addToAssignment(car4);
	}
}
