package Day22.CW22_1.caller;

import Day22.CW22_1.library.Book;

public class ChildBook extends Book {

    public ChildBook(String author, String title, int pageAmount, String giftedBy, String pressmark, boolean isNeedsRepair) {
        super(author, title, pageAmount, giftedBy, pressmark, isNeedsRepair);
    }

    public static void main(String[] args) {
        ChildBook book = new ChildBook("A","T",10,"GB","AB",false);

        book.setGiftedBy("123");
    }

}
