package application;

public class MergeSort {

	public static void main(String[] args) {
		int[] vetor = new int[] {9, 10, -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
		printVetor(vetor);
		mergeSort(vetor, 0, vetor.length-1);
		printVetor(vetor);
	}
	
	public static void mergeSort(int[] vetor, int p,int r){
		if(p < r) {
			int q = (p+r)/2;
			//System.out.println("Valor q: " + q);
			mergeSort(vetor,p,q);
			mergeSort(vetor,q+1,r);
			//System.out.println("Entrei no merge com os valores: p = " + p + " q = " + q + " r = " + r);
			merge(vetor,p,q,r);
		}
	}
	public static void merge(int[] vetor, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] vetorEsquerda = new int[n1];
		int[] vetorDireita = new int[n2];
		
		for(int i = 0;i < n1;i++)
			vetorEsquerda[i] = vetor[p+i];
		
		for(int j = 0; j < n2; j++)
			vetorDireita[j] = vetor[q + j + 1];
		
		int i, j, k;
		i = j = 0;
		k = p;
		
		while(i < n1 && j < n2) {
			//System.out.println("Entrei no while");
			if(vetorEsquerda[i] <= vetorDireita[j]) {
				vetor[k] = vetorEsquerda[i];
				i++;
			}
			else {
				vetor[k] = vetorDireita[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
	        vetor[k] = vetorEsquerda[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        vetor[k] = vetorDireita[j];
	        j++;
	        k++;
	    }
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
