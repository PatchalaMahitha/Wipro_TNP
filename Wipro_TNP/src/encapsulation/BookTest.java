package encapsulation;

public class BookTest {
	public static void main(String[] args) {

        if(args.length != 7) {
            System.out.println("Please enter 7 arguments");
            return;
        }

        String authorName = args[0];
        String authorEmail = args[1];
        char gender = args[2].charAt(0);

        String bookName = args[3];
        double price = Double.parseDouble(args[4]);
        int qty = Integer.parseInt(args[5]);

        // 7th argument is ignored or can be used as another value if needed

        Author a = new Author(authorName, authorEmail, gender);
        Book b = new Book(bookName, a, price, qty);

        System.out.println("Book Name      : " + b.getName());
        System.out.println("Price          : " + b.getPrice());
        System.out.println("Quantity       : " + b.getQtyInStock());

        System.out.println("Author Name    : " + b.getAuthor().getName());
        System.out.println("Author Email   : " + b.getAuthor().getEmail());
        System.out.println("Author Gender  : " + b.getAuthor().getGender());
    }
}
