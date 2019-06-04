package solution;

public class CapacityTest {

	public boolean knapsackTest(Item item, int capacity) {

		if (item.getWeight() > capacity) {
			return false;
		}

		return true;

	}

}