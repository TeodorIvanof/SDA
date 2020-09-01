package tema3;

public class Customer {

	private String LastName;
	private String FirstName;
	private int age;
	private Adress adress;

	private PaymentMethod paymentMethod;

	public String getLastName() {

		return LastName;

	}

	public String getFirstName() {

		return FirstName;

	}

	public int getAge() {

		return age;

	}

	public Adress getAdress() {

		return adress;

	}

	public PaymentMethod getPaymentMethod() {

		return paymentMethod;

	}

	public Customer(String LastName, String FirstName, int age)

	{
		this.LastName = LastName;
		this.FirstName = FirstName;
		this.age = age;

	}

	public Customer(Adress adr, PaymentMethod paymentmethod1)

	{

		adress = adr;

		paymentMethod = paymentmethod1;

	}

	public String getCompleteName()

	{

		return FirstName + LastName + " " + age;

	}

}