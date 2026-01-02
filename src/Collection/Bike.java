package Collection;

public class Bike {
	private String Model;

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public Bike(String model) {
		super();
		Model = model;
	}

	@Override
	public String toString() {
		return "Bike [Model=" + Model + "]";
	}

}
