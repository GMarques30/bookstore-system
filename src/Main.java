import entity.Book;
import entity.Customer;
import entity.Library;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    Book book1 = new Book("Harry Potter e a Pedra Filosofal", "Jk", "Rowling", true, 1965, 7, 31);
    Book book2 = new Book("O Senhor dos Anéis: A Sociedade do Anel", "Jrr", "Tolkien", true, 1892, 1, 3);
    Book book3 = new Book("Harry Potter e a Câmara Secreta", "Jk", "Rowling", true, 1965, 7, 31);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    while(true) {
      System.out.println("Deseja ver os livros disponíveis? (sim/não)");
      String answer = scanner.nextLine().toLowerCase();

      if(answer.equals("não")) {
        System.out.println("Obrigado por utilizar o sistema da biblioteca.");
        break;
      }

      List<Book> booksAvailable = library.getBooksAvailable();
      if(booksAvailable.isEmpty()) {
        System.out.println("Não há livros disponíveis no momento.");
        break;
      }

      System.out.println("Livros disponíveis:");
      for (Book book : booksAvailable) {
        System.out.println(book.bookId + ": " + book.title);
      }

      System.out.println("Digite o ID do livro que você deseja emprestar:");
      String bookId = scanner.next();
      scanner.nextLine();
      Book bookSelected = library.getBookById(bookId);

      if(bookSelected == null) {
        System.out.println("Livro não encontrado ou não disponível para empréstimo.");
      }

      System.out.println("Digite seu primeiro nome:");
      String customerFirstName = scanner.nextLine();

      System.out.println("Digite seu ultimo nome:");
      String customerLastName = scanner.nextLine();

      System.out.println("Digite seu email:");
      String customerEmail = scanner.nextLine();

      System.out.println("Digite seu ano de aniverário:");
      int customerYear = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite seu mês de aniverário:");
      int customerMonth = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Digite seu dia de aniverário:");
      int customerDay = scanner.nextInt();
      scanner.nextLine();

      Customer customer = new Customer(customerFirstName, customerLastName, customerEmail, customerYear, customerMonth, customerDay);

      library.loanBook(bookId, customer.customerId);
      bookSelected.unavailable();
      library.updateBook(bookSelected);
      System.out.println("O livro " + bookSelected.title + " foi emprestado para " + customer.getName());
    }
    scanner.close();
  }
}