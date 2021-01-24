import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int vetor[] = { 7, 5, 3, 9, 6, 4, 1 };

		for (int valor : vetor) {
			System.out.print(valor + "  ");

		}
		
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma = vetor[0] + vetor[1];

		}
		System.out.println();
		System.out.println(" A soma do vetor na posição 0 e posição 1 é:  " + soma);

	}

}
