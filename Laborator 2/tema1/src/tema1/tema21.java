package tema1;

public class tema21 {

//	!!!!!       Dupa ce ati terminat de sris codul formatati fisierul cu Ctrl+shift+f

	public static void main(String[] args) {

	
		System.out.println("If else:");

		System.out.println(getMaxSpeedLimitByIfElse("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElse("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));



		System.out.println("\nIf else 2:");

		System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));



		System.out.println("\nSwitch:");

		System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));

	}
	//Declar Functia ce returneaza viteza maxima permisa pentru fiecare tip de drum.
	//Functia are un paremetru de tip String prin care primeste drumul ales.
	public static int getMaxSpeedLimitByIfElse(String roadType) {

		//Veirific daca tipul drumului este Drum Express , daca da execut prima instructiune adica 
		//afisez roadType , la fel se procedeaza si la restu.
		//Daca nu este drum express trec la urmatoarul else if 
		if (roadType == "Drum Express") {

			System.out.print(roadType +" ");

			return 100;
		//urmatorul else if 
		} else if (roadType == "Oras") {

			System.out.print(roadType + " ");

			return 50;

		} else if (roadType == "Zona rezidentiala") {

			System.out.print(roadType + " ");

			return 30;

		} else if (roadType == "Autostrada") {

			System.out.print(roadType + " ");

			return 130;

		} else

			System.out.print(roadType + " ");

		return 0;

	}
	//Procedez la fel aici ca la getMaxSpeedLimitByIfElse numai ca folosesc if esle 
	public static int getMaxSpeedLimitByIfElseComplex(String roadType) {

		if (roadType == "Drum Express") {

			System.out.print(roadType + " ");

			return 100;

		} else {

			if (roadType == "Oras") {

				System.out.print(roadType + " ");

				return 50;

			} else {

				if (roadType == "Zona rezidentiala") {

					System.out.print(roadType + " ");

					return 30;

				} else {

					if (roadType == "Autostrada") {

						System.out.print(roadType + " ");

						return 130;

					}

				}

			}

		}

		return 0;

	}
	//Cazul switch
	//Folosesc variabila roadType ca sa o "pasez" la switch .. iar in fuctie de ce variabila trimit 
	//se va selecta un case .
	public static int getMaxSpeedLimitBySwitch(String roadType) {

		switch (roadType) {

		case "Drum Express": {

			System.out.print(roadType + " ");

			return 100;

		}

		case "Oras": {

			System.out.print(roadType + " ");

			return 50;
		}

		case "Zona rezidentiala": {

			System.out.print(roadType + " ");

			return 30;

		}

		case "Autostrada": {

			System.out.print(roadType + " ");

			return 130;
		}

		}

		return 0;

	}
}