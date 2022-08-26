package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetor[j] > vetor[j+1]) {
					int auxiliar = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor [j + 1] = auxiliar;
				}
			}
		}
		
		return vetor;
	}

}
