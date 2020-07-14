package Encapsulation;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name:");
		String book = sc.nextLine();
		System.out.println("enter book Authour name :");
		String authourName = sc.nextLine();
		System.out.println("enter book Authour mail :");
		String gmail = sc.nextLine();
		System.out.println("enter book authour gender :");
		char gender = sc.next().charAt(0);
		System.out.println("enter book prize :");
		double prize = sc.nextDouble();
		System.out.println("enter book quality :");
		int quality = sc.nextInt();
		sc.close();
        Author a = new Author(authourName,gmail,gender);	
		Book b1 = new Book(book,a,prize,quality);
		
		b1.setBname(book);
		b1.setPrize(prize);
		b1.setQuality(quality);
		
		Author a1 = b1.getAuthor();
		
		System.out.println("\n\n 	 book : "  + b1.getBname() +
				           "\n   book prize : "+ b1.getPrize() + 
				           "\n book quality : "+b1.getQuality()+
				           "\n      authour : "+ a1.getName() +
				           "\n authour mail : "+ a1.getEmail()+
				           "\nauthor gender : "+ a1.getGender());
	}

}
