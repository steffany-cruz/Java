package algorithms;

class Main {
	  public static void main(String[] args) {		  
		long startTime = System.currentTimeMillis();
		  
		Knapsack knapsack = new Knapsack(30);
		BruteForceAlgorithm brute = new BruteForceAlgorithm();
		brute.execute(knapsack);
		
		long endTime = System.currentTimeMillis();
		long dif = (endTime - startTime);
		System.out.println("Tempo de execução: ");
		System.out.println(String.format("%02d segundos  e %02d milissegundos", dif/60, dif%60));
	  }
}
