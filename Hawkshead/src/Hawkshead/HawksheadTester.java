package Hawkshead;
/**
 * Tester class to test the library class's methods.
 * @author Daryl Leach
 * version 16/07/2021
 */

public class HawksheadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library myLibrary = new Library();
		Loan myLoan = new Loan();
		myLibrary.addNewMember(16655, "alan", "Stubs", "0777777777");
		myLibrary.addNewMember(16656, "Steven", "Jobs", "0777777712");
		myLibrary.addNewMember(16657, "Dick", "Dom", "0777777713");
		//
		myLibrary.addNewBook(20111, "Java for Dummies", "Barry Burd", "Non-Fiction", false);
		myLibrary.addNewBook(20112, "Terminator", "James Cameron", "Fiction", false);
		
		//myLibrary.searchLibrary("20111");
		//myLibrary.searchMembers("16655");
		//myLibrary.searchLibrarybyTitle("Java");
		//myLibrary.searchMemberbySurname("jobs");
		//myLibrary.removeMember(16657);
		//myLibrary.removeBook(20111);
		//myLibrary.removeMember(16657);
		myLibrary.showMembers();
		//myLibrary.showBooks();
		myLibrary.addNewLoan(10000, 16655, 20111);
		myLibrary.addNewLoan(10001, 16656, 20112);
		myLibrary.showLoans();
		//myLoan.printloanDetails();
	}

}
