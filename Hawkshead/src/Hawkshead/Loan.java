package Hawkshead;
/**
 * Class to test the loan class's methods.
 * @author Daryl Leach
 * version 16/07/2021
 */

public class Loan {
	public static void main(String[] args) {}
	
	public int memberID;
	public int bookID;
	public int loanID;
	
	
	public Loan(int newloanID, int newmemberID, int newbookID) {
		/**Creates a class constructor for the Loan class*/
		loanID = newloanID;
		memberID = newmemberID;
		bookID	= newbookID;	
		
	}
	
	
	public Loan() {
		
	}
	
	public void setloanID(int newloanID)
	{
		loanID = newloanID;
	}
	
	public int getloanID()
	{
		return loanID;
	}

	    
public void printloanDetails()
/**
 * Create a string that can be used for printing.
 * @return description Loan
 */
{
 System.out.println("Loan ID: "+ loanID + " Book ID: " + bookID + " Member ID : " + memberID);
 
    }



}

