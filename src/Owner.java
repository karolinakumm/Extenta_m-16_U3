import java.util.ArrayList;

public class Owner {
	private String nbr;
	private String name;
	private ArrayList<Car> cars = new ArrayList<Car>();

	public String getNbr() {
		return nbr;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public void add(Car car) {
		cars.add(car);
	}

	public Car find(String nbr) {
		for (Car c : cars) {
			if (c.getRegNbr().equals(nbr)) {
				return c;
			}
		}
		return null;

	}

}
