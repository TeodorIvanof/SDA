package ro.unitbv.javadatatype;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declar un obiect scanner pt citirea de la tastatura.
		Scanner scanner = new Scanner(System.in);
		
		//afiseaza mesajul in consola
		System.out.println("Introdu nr 1: ");
		//In variabila nr1 voi stoca numarul de la tastatura.
		int nr1= scanner.nextInt();
		
		//aafisez numarul citit 
		System.out.println("numarul citit este: "+nr1);
		System.out.println("Introdu nr 2: ");
		
		//Citesc al doilea numar.
		int nr2= scanner.nextInt();
		System.out.println("numarul 2 citit este: "+nr2);
		//in suma stochez suma celor 2 numere.
		int suma=nr1+nr2;
		System.out.println("suma este: "+suma);
		System.out.println("diferenta este: " +(nr1-nr2));
		System.out.println("produsul este: "+(nr1*nr2));
		//nr1/nr3 afisat cu zecimale - fac impartirea celor 2 numere cu zecimala si fara.
		double impartire =(double)nr1/nr2;
		int impartireInt = nr1/nr2;
		//Afisez rezultatul si media 
		System.out.println("Impartirea este: "+impartire);
		System.out.println("media este: "+((nr1+nr2)/2));
		//Daca nr1 > nr2 atunci citesc prima instructiune din if daca nr1<nr2 citesc instructriunea din else
		if(nr1>nr2)
			System.out.println("DIstanta este: "+(nr1-nr2));
		else
			System.out.println("DIstanta este: "+(nr2-nr1));

		
		if(nr1>nr2)
			System.out.println("intregul maxm este: "+nr1+"(Nr 1)");
		else
		 if(nr1<nr2)
			System.out.println("Intregul maxim este: "+nr2+"(Nr 2)");
		 else
			System.out.println("Nr sunt egale"+nr1);
	}

}