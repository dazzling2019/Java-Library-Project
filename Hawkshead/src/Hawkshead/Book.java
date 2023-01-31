package Hawkshead;
/**
 * Class for storing the book information  details
 * @author Daryl Leach
 * version 16/07/2021
 */
public class Book {
	


	public static void main(String[] args) {}
		
		public int bookID;
		public String title;
		public String author;
		public String ficNonfic;
		
		
	




public Book(int newbookID, String newTitle,String newAuthor, String newFic, boolean newLoan){
	/** Create a class constructor for the Main class*/
	bookID = newbookID;
	title = newTitle;
    author= newAuthor;
    ficNonfic = newFic;
    
	}
	
	public void setbookID(int newbookID)
	{
		bookID = newbookID;
	}
	/**
	 * Mutator method to change books ID.
	 * @param newbook:
	 */
	public int getbookID()
	{
		return bookID;
	}
	
	/**
 	*  Getter method for the bookID.
 	* @return title.
 	*/
	


    public void setTitle(String newTitle)
    {
     title = newTitle;
    }
    
    /**
     * Mutator method to change books title.
     * @param newAuthor:
     */
   
    public String getTitle()
    {
     return title;
    }
    /**
     *  Getter method for the title.
     * @return title.
     */
    public void setauthor(String newAuthor)
    {
     author = newAuthor;
     
    }
    /**
     * mutator method for the author.
     * @param the books author.
     */
    public String getAuthor()
    {
     return author;
    }
   /**
     * Getter method to change books author.
     * @return newFic:
     */
    public void setficNonfic(String newFic)
    {
    	ficNonfic = newFic;
    	/**
         * Mutator method to change book to fiction or non-fiction.
         * @param newFic:
         */
    }
    public String getficNonfic()
    {
     return ficNonfic;
    }
    /**
     * Getter method for fiction or non-fiction
     * @return books fiction or non-fiction status
     */
  
    
   
    /**
     * Create a string that can be used for printing.
     * @return description Member
     */

    public void printbookDetails()
    {
     System.out.println("Title: " + title + ",  Author : " + author + ", Fiction/Non-Fiction: " + ficNonfic);
        }
    
	}


