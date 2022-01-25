package br.com.dio.calculadora;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int a, b;
	
		System.out.println("Dige o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Dige o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
	    double divisao = divisao(a,b);
		int multiplicacao = multriplicacao(a,b); 
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
	
	
	
	
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static int multriplicacao(int a, int b) {
		return a * b;
	}
	
	
}
