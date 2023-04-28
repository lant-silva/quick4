package view;

import control.QuickSort;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		int tamanho = vetor.length;
		QuickSort q = new QuickSort();
		
		vetor = q.quickSort(vetor, 0, tamanho-1);
		for(int i : vetor) {
			System.out.println(i);
			System.out.print("");
		}
	}
}
