package tema3;

//Creez clasa Adress
public class Adress {
	//Declar atributele pentru clasa 
	private String street;
	private String city;
	private int number;
	
	//Functia getCity pentru obtinerea atribulului city 
	public String getCity() {

		return city;

	}
	//Functia getStreet pentru obtinerea atribululuui Street
	public String getStreet() {

		return street;

	}
	//Functia getNumber pentru obtinerea atribulului number 
	public int getNumber() {

		return number;

	}
	//Constructorul pentru initializarea obiectului.
	public Adress(String city, String street, int number)

	{
		this.city = city;
		this.street = street;
		this.number = number;

	}
	//Functie get pentru a returna oras+strada+numar
	public String getCompleteAdress()

	{

		return city + street + number;

	}
}
