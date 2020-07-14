package Encapsulation;

public class Book {
	private String bname;
	private Author author;
	private double prize;
	private int quality;
	
	Book(String bname, Author author, double prize,int quality)
	{
		this.bname=bname;
		this.author = author;
		this.prize=prize;
		this.quality=quality;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
}
