import java.io.*;

import java.util.Scanner;

class Book{

private String bookname,authorname,publisher;

private long ISBN;

public Book() {

}

public Book(String bookname,long ISBN,String authorname,String publisher) {

this.bookname=bookname;

this.ISBN=ISBN;

this.authorname=authorname;

this.publisher=publisher;

}

public void setData(String bookname,long ISBN,String authorname,String publisher)

{

this.bookname=bookname;

this.ISBN=ISBN;

this.authorname=authorname;

this.publisher=publisher;

}

public void getData() {

System.out.println("Book Name = "+bookname);

System.out.println("ISBN No. = "+ISBN);

System.out.println("Author Name = "+authorname);

System.out.println("Publisher = "+publisher);

}

}

class ArrayBook{

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

Book b=new Book();System.out.println("Enter Book name, ISBN number, Author name,Publisher :- ");

b.setData(scan.next(),scan.nextLong(),scan.next(),scan.next());

b.getData();

}

}
