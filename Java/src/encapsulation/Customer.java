package encapsulation;

public class Customer {
   private String firstName;
   private String lastName;
   private String creditCard;
   
   public String getFirstName(){
	    return firstName;
   }
   
   public  void setFirstName(String firstName ) {
	   if (firstName == null) {
		   System.out.println("Invalid First Name");
	   }
	   this.firstName  = firstName;
   }

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCreditCard() {
	return creditCard;
}

public void setCreditCard(String creditCard) {
	this.creditCard = creditCard;
}
}
