package application;

public class HeapSort {
	
	public static void main(String[] args) {
		
		int[] vetor = new int[] {6,1,9,7,3,8,5,2,4};
		
		printVetor(vetor);
		heapSort(vetor);
		printVetor(vetor);
	}
	
	public static void heapSort(int[] vetor) {
		buidMaxHeap(vetor);
		int heapSize = vetor.length;
		System.out.println("------------------------------------------");
		for(int i = vetor.length -1; i >= 1; i--) {
			System.out.println("Valor do i na segunda parte: " + i );
			trocar(vetor, 0, i);
			heapSize -= 1;
			System.out.println("Valor heapSize: " + heapSize);
			maxHeapify(vetor, 0, heapSize);
		}
	}
	
	public static void buidMaxHeap(int[] vetor) {
		for(int i = vetor.length/2 -1; i >= 0; i--) {
			System.out.println("Valor do i: " + i);
			maxHeapify(vetor, i, vetor.length);
		}
	}
	
	public static void maxHeapify(int[] vetor, int i, int heapSize) {
		int esquerda = 2*i + 1;
		int direita = (2*i) + 2;
		int maior;
		
		if(esquerda < heapSize && vetor[esquerda] > vetor[i]) {
			maior = esquerda;
		}
		else {
			maior = i;
		}
		if(direita < heapSize && vetor[direita] > vetor[maior]) {
			maior = direita;
		}
		if(maior != i) {
			trocar(vetor, i, maior);
			maxHeapify(vetor, maior,heapSize);
		}
	}
	
	public static void trocar(int[] vetor,int i,int j) {
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
