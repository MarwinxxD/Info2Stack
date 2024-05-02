package bc;

public class Main {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[2];

		Car c = new Car("A-UA-1234");
		Truck t = new Truck("A-UA-1235");

		c.setSitzplaetze(4);
		t.setMaxGew(40);

		vehicles[0] = c;
		vehicles[1] = t;

		for(int i = 0; i < 2; i++) {
			System.out.println(vehicles[i]);
		}
	}

}
