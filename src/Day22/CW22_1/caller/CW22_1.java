package Day22.CW22_1.caller;

import Day22.CW22_1.library.Book;

public class CW22_1 {

    public static void main(String[] args) {
        Book book = new Book("Mukhtar Kasimov","How to sleep better", 3, "Nobody", "MKHTSB-01", false);

        book.setAuthor("Aidin Sabyrov");
        book.setPageAmount(10);

//        book.setGiftedBy("123");

//        ApiUser.main(book.setGiftedBy("asd"));
    }
}
