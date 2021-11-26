package com.dio;

import com.dio.model.Gato;

public class Dio01 {
	

	public static void main(String[] args) {

        Gato gato = new Gato();		
		Livros livros = new Livros();
        int a=2;
		int b=3;
		
		System.out.println("Hello Mundo " + (a+b));
        System.out.println(gato);
        System.out.println(livros);
       	
	}

}


class Livros{
	private String nome;
	private String npag;
}