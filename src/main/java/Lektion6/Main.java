package Lektion6;

public class Main {
        public static void main(String[] args) {
            Book myBook= new Book("Animal Farm", "George Orwell");
            myBook.showInfo();
            Book myFavoriteBook = new Book("Denemeler", "Montaigne");
            myBook.setAuthor("Tolstoy"); //Set metod to change the value
            myBook.setTitle("Itiraflarim");
            myBook.showInfo();
            Book mySecondBook = new Book ("Kasagi","Ömer Seyfettin");
            mySecondBook.showInfo();
            System.out.println("Book: "+ myBook.getTitle());
            System.out.println("Author: "+ myBook.getAuthor());
            mySecondBook.showInfo();

        }

    }

