package tema3;

public class tema21 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Adress address = new Adress("Sibiu ", "Siretului ", 18);

		PaymentMethod pm = new PaymentMethod("cash");

		Customer c = new Customer(address, pm);

		Customer c1 = new Customer("Prisca", "Darius ", 21);

		System.out.println(c1.getCompleteName());

		System.out.println(c.getAdress().getCompleteAdress());

		System.out.println(c.getPaymentMethod().getType());

	}

}
