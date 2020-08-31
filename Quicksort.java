package application;

public class Quicksort {

	public static void main(String[] args) {
		
		int[] vetor = new int[] {9, 10, -1, 3, 6, 2, -3, 1, 0, -2, 15, 8, -7};
		printVetor(vetor);
		
		quickSort(vetor, 0, vetor.length-1);
		printVetor(vetor);
	}
	
	public static void quickSort(int[] vetor, int p, int r) {
		if(p < r) {
			int q = particionar(vetor, p, r);
			System.out.println("Valor do pivo q: " + q);
			quickSort(vetor, p, q-1);
			quickSort(vetor, q+1, r);
		}
	}
	
	public static int particionar(int[] vetor, int p, int r) {
		int x = vetor[r];
		int i = p - 1;
		for(int j = p; j < r; j++) {
			if(vetor[j] <= x) {
				i++;
				trocar(vetor, i, j);
			}
		}
		trocar(vetor, i+1, r);
		return i+1;
	}
	
	public static void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	public static void printVetor(int[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if(i < vetor.length-1)
				System.out.print(vetor[i] + ", ");
			else
				System.out.print(vetor[i]);
        }
		System.out.println("]");
	}
}
