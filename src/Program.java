import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		int vetor[] = { 7, 5, 3, 9, 6, 4, 1 };
		int vetor2[] = vetor;

		for (int valor : vetor) {
			System.out.print(valor + "  ");

		}
		System.out.println();

		for (int valor2 : vetor2) {
			vetor2[3] = 5;
			System.out.print(valor2 + "  ");

		}

		int soma = 0;

		for (int i = 0; i < vetor2.length; i++) {
			soma += vetor2[i];

		}
		System.out.println();
		System.out.println(" A soma de todos os itens do vetor é:  " + soma);

	}

}
