package Hawkshead;

/**
 * Class for storing the library information  details, also mostly the main engine for the program.
 * @author Daryl Leach
 * version 16/07/2021
 */

import java.util.ArrayList;
public class Library {
	
	private ArrayList<Book> bookList; /** creates an array for the books list to store a list of books.*/
	private static ArrayList<Member> memberList; /**creates an array for the members list to store a list of members.*/
	private static ArrayList<Loan> loanList;/**creates an array for the loans list to store a list of loans.*/
	 /**
     * 
     * @param booklist
     * @param memberList
     * @param loanList
     */
	
	public Library()  /**Creates a class constructor for the Main class*/
    {	
		
     bookList = new ArrayList<Book>(); /**creates a new array for the @param book list*/
     memberList = new ArrayList<Member>(); /**creates a new array for @param the member list*/
     loanList = new ArrayList<Loan>(); /**creates a new array for the @param loan list*/
     
}
	   
	public void addNewMember(int memberID, String firstName, String lastName, String phoneNumber) {
		memberList.add(new Member(memberID, firstName, lastName, phoneNumber));/**the add() method is from the ArrayList class (Java Library class).*/
		/**
	     * This method stores (adds) a new member into the library.
	     * @param member The member details to be stored.
	     */
	}
	public void addNewBook(int bookID, String title, String author, String ficNonfic, boolean Loan) {
		bookList.add(new Book(bookID, title, author, ficNonfic, Loan ));/** the add() method is from the ArrayList class (Java Library class).*/
		/**
	     * This method stores (adds) a new book into the library.
	     * @param member The book details to be stored.
	     */
	}
	public void addNewLoan(int loanID, int memberID, int bookID) {
		loanList.add(new Loan(loanID, memberID, bookID));/** the add() method is from the ArrayList class (Java Library class).*/
		/**
	     * This method stores (adds) a new loan into the library.
	     * @param member The loan details to be stored.
	     */
	}
		
	public void showMembers() { /** @return shows a list of member saved in the  members array.*/
		 for (int i=0; i< memberList.size();i++) {
			 memberList.get(i).printmemberDetails();
		 }}
	public void showBooks() { /** @return shows a list of books saved in the @param books array.*/
		for (int i=0; i< bookList.size();i++) {
				 bookList.get(i).printbookDetails();
			 }
	}
	
	public void searchLibrarybyID(int bookID) { /** @return searches  books by ID and prints the details.*/ 
	System.out.println("The details of book with the book ID you searched for are: ");
    for (Book element : bookList){
        if (element.getbookID() == (bookID)){
        	element.printbookDetails();
        }}}
	

	public void searchMembersbyID(int memberID) { /**searches @return member by ID and prints their details.*/ 
	System.out.println("The details of member with the member ID you searched for are: ");
    for (Member element : memberList){
        if (element.getmemberID() == (memberID)){
        	element.printmemberDetails();
        }}}
	
	
	public void searchLibrarybyTitle(String title) {/**searches @return book by surname and prints the details.*/ 
	System.out.println("Contents of the library: ");
    for (Book element : bookList){
        if (element.getTitle() .contains(title)){
        	element.printbookDetails();
        }}}
	
	
	public void searchMemberbySurname(String lastName) { /**searches @return member by surname and prints their details.*/ 
	System.out.println("Contents of the library: ");
    for (Member element : memberList){
        if (element.getlastName() .contains(lastName)){
        	element.printmemberDetails();
        }}}
	
		
	
	
	public void removeBook(int id) /**removes a @param book if the ID is found if not it prints an error message.*/ 
		{
    boolean successful = false;
    for (int i=0;i<bookList.size();i++)
    {
        if((int)bookList.get(i).getbookID()==id)
        {
            bookList.remove(i);
            System.out.println("Book removal successful");
            successful=true;
        }
    }

    if (!successful)
    {
        System.out.println("Could not remove book id "+id);
        }}
    



	public void removeMember(int id)/**removes a @param book if the ID is found if not it prints an error message. */
	{
		boolean successful = false;
		for (int i=0;i<memberList.size();i++)
		{
			if((int)memberList.get(i).getmemberID()==id)
			{
				memberList.remove(i);
				System.out.println("Member removed successfully");
				successful=true;
			}
			
		}

		if (!successful)
		{
			System.out.println("Could not remove member id "+id);
		}
		
		
			
			



}

	public void showLoans() { /**shows a list of loans stored in the @return loans arrays.*/ 
		for (int i=0; i< loanList.size();i++) {
			 loanList.get(i).printloanDetails();
		 }
}
	
	public void removeLoan(int id)/**removes a @param loan if the ID is found if not it prints an error message*/ 
	{
		boolean successful = false;
		for (int i=0;i<loanList.size();i++)
		{
			if((int)loanList.get(i).getloanID()==id)
			{
				loanList.remove(i);
				System.out.println("Loan removed successfully");
				successful=true;
			}
			
		}

		if (!successful)
		{
			System.out.println("Could not remove member id "+id);
		}
}
}





