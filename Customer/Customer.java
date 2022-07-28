package by.it_academy.tr.object.Customer;

public class Customer 
{
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String creditCardNumber;
	
	public Customer(int id,String surname,String name,String patronymic, String address,String creditCardNumber)
	{
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPatronymic()
	{
		return patronymic;
	}

	public void setPatronymic(String patronymic) 
	{
		this.patronymic = patronymic;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getCreditCardNumber() 
	{
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) 
	{
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() 
	{
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + "]";
	}
	
	
}
