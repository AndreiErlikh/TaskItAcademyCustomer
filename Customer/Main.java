package by.it_academy.tr.object.Customer;

public class Main {

	public static void main(String[] args)
	{
		 new Customer(123," Erlikh"," Andrei"," Vital'evich"," Starinovsaya 23"," 1234567891234567");
		 
		CustomerLogic cl = new CustomerLogic();
		
		cl.customerAdd("Mikhail",new Customer(321," Mikhadziuk"," Mikhail"," Vasil'evich"," Russiyanova 3/2","9876543219876543"));
		cl.customerAdd("Andrey",new Customer(123," Erlikh"," Andrei"," Vital'evich"," Starinovsaya 23","1234567891234567"));
		cl.customerAdd("Artem", new Customer(111," Marusalov"," Artem"," Denisovich"," Shugaevo 2","12345678910"));
		
		System.out.println("Список покупателей в алфавитном порядке (по имени):");
		cl.CustomerAlphabetOrder();
		System.out.println("--------------------------------------");
		System.out.println("Список покупателей, у которых номер кредитной карточки в заданном интервале:");
		cl.listCreditNumber((Customer ct)->{return ct.getCreditCardNumber().length() > 12 &&  ct.getCreditCardNumber().length()<=16;});
	}

}
