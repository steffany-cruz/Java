package solution;

public class Item {

	public String name;
	public int value;
	public int weight;

	public Item(String name, int value, int weight) {
		this.name = name;
		this.value = value;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String str() {
		return name + " [Valor = " + value + ", Peso = " + weight + "]";
	}
}
