
public class Car {
	public Car() {
        System.out.println("Sisteme Giriþ Yapýldý");

        System.out.println("----------------");
    }

    public Car(int id, String name, String plaque, String detail, String recipient ) {
        this();
        this.id = id;
        this.name =name;
        this.plaque = plaque;
        this.detail = detail;
        this.recipient = recipient;


    }

    int id;
    String name;
    String plaque;
    String detail;
    String recipient;

}
