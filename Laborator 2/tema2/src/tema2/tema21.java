package tema2;

import java.util.ArrayList;
import java.util.List;

public class tema21 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Declar un array ce contine valori temperaturi.
		double[] temperaturi= {34.0, 35.5, 37.0, 37.5, 38.5, 36.5, 38, 39, 36};
		//Declar 2 liste de tip ArrayList 
		List<Double> list1 = new ArrayList<Double>();

		List<Double> list2 = new ArrayList<Double>();


		for(double x: temperaturi) {
			//adaug in lista tempereturile mai mici de 37.0
			if(x<37.0) {

				list1.add(x);

			}

			else {
				//adaug in lista temperaturile > 37.0
				list2.add(x);

		}

		}
		//Afisez temteraturile mai mici de 37.0
		System.out.println("temperaturi mai mici de 37.0:\n");
		//Cum un for parcurg prima lista si afisez temperatura si persoana.
		for(int i=0;i<list1.size();i++) 

				System.out.println("persoana" +" "+ list1.get(i));

		System.out.println("\ntemperaturi mai mari de 37.0:\n");

		for(int i=0;i<list2.size();i++)

			System.out.println("persoana"  +" "+ list2.get(i));

	}
}