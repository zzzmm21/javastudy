package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private boolean stateCode; // 0: 재고 있음 , 1 : 대여중
	private int rent;
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		
	}
	public void stateCode() {
		if(bookNo == 1) {
			rent = 1;		}
		else {
			rent =0 ;
		}
		
		
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	  public void showinfo()
	    {
	        System.out.println("Book[num : " +bookNo +"] [title : "+title +"] [author : "+author+"])대여중"+rent);
	    }

}
