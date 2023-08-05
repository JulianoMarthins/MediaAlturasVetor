package aplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas alturas deseja iserir: ");
		int quantidade = sc.nextInt();
		
		double altura[] = new double[quantidade];
		
		double total = 0, alt = 0;
				
		for(int i = 0; i < altura.length; i++) {
			System.out.printf("Insira a %d° altura: ", i + 1);
			alt = sc.nextDouble();
			total += alt;
		}
		double media = total / altura.length;
		
		System.out.printf("Média das alturas inseridas: %.2f", media);
		
		
		
		sc.close();
	}

}
