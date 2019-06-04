package solution;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CapacityTest CapacityTest = new CapacityTest();

		ArrayList<Item> items = new ArrayList<Item>();
		ArrayList<Item> itemsKnapsack = new ArrayList<Item>();

		Random generator  = new Random();

		boolean continua;
		
		long startTime = System.currentTimeMillis();
		
		items.add(new Item("Item 1", 4, 3));
		items.add(new Item("Item 2", 10, 8));
		items.add(new Item("Item 3", 1, 1));
		items.add(new Item("Item 4", 2, 3));
		items.add(new Item("Item 5", 2, 3));
		items.add(new Item("Item 6", 5, 4));
		items.add(new Item("Item 7", 6, 5));
		items.add(new Item("Item 8", 1, 6));
		items.add(new Item("Item 9", 3, 7));
		items.add(new Item("Item 10", 9, 7));

		Knapsack knapsack = new Knapsack("Knapsack", 20);
		int capacity = knapsack.getCapacity();

		for (int i = 0; i <= items.size(); i++) {

			Item item = items.get(generator.nextInt(items.size()));

			continua = CapacityTest.knapsackTest(item, capacity);
			if (!continua) {
//				break;
			} else {
				itemsKnapsack.add(item);
				capacity = capacity - item.getWeight();
			}
		}

		for (Item item : itemsKnapsack) {
			System.out.println(item.getName());
		}
		
		long endTime = System.currentTimeMillis();
		long dif = (endTime - startTime);
		System.out.println("Tempo de execução: ");
		System.out.println(String.format("%02d segundos  e %02d milissegundos", dif/60, dif%60));

	}

}
