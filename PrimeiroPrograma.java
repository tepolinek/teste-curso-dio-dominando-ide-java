package br.com.dio.model;

public class PrimeiroPrograma {

public static void main (String[] args) {
		
	Gato gato = new Gato();
	Livros livros = new Livros();
	
	System.out.println(gato);
	System.out.println(livros);

}
}

class Livros {
	private String nome;
	private String npag;
}