package Hawkshead;
/**
 * Class for storing the members information library details
 * @author Daryl Leach
 * version 16/07/2021
 */

public class Member {

	public static void main(String[] args) {}
		
		public int memberID;
		public String firstName;
		public String lastName; 
		public String phoneNumber; 
	
	
			public Member (int newmID, String newfName,String newlName, String newphoneNumber){
				/**Creates a class constructor for the Member class*/
				memberID = newmID;
				firstName= newfName;
				lastName = newlName;
				phoneNumber = newphoneNumber;
			    
			}
			public int getmemberID()
		    {
		     return memberID;
		     /**
			     * getter method for the first name.
			     * @return the first name.
			     */
		    }
			public void setmemberID(int newmemberID)
		    {
				memberID = newmemberID;
		     /**Mutator method for member ID
		      * @param member ID */
		    }

			      
			    public String getfirstName()
			    {
			     return firstName;
			     /**
				     * getter method for the first name.
				     * @return the first name.
				     */
			    }
			    public void setfirstName(String newfirstName)
			    {
			    	firstName = newfirstName;
			     
			    }
			    /**
			     * getter method for last name.
			     * @param last name.
			     */
			    
			    public String getlastName()
			    {
			     return lastName;
			     /**
				     * getter method for the first name.
				     * @return the first name.
				     */
			    }
			    public void setlastName(String newlastName)
			    {
			    	firstName = newlastName;
			     
			    }
			    /**
			     * mutator method for last name.
			     * @param the last name.
			     */
			   
			    public String getphoneNumber()
			    {
			     return phoneNumber;
			    }
			    /**
			    
			    /**
			     * Getter method for the phone number.
			     * @return members phone number.
			     */
			   
			    
			    public void setphoneNumber(String newphoneNumber)
			    {
			    	phoneNumber = newphoneNumber;
			     
			    }
			    
			    /**
			     * Mutator method for phone number.
			     * @param member's phone number.
			     */
			   
			    public void printmemberDetails()
			    /**
			     * Create a string that can be used for printing.
			     * @return description member
			     */
			    {
			     System.out.println("Member ID: "+ memberID + " First Name: " + firstName + ",  Last Name : " + lastName + ", Phone number: " + phoneNumber);
			        }
	

}
