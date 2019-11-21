package Day22.CW22_1.library;

public class Book {
    private String author;
    private String title;
    private int pageAmount;
    private String giftedBy;
    private String pressmark;
    private boolean isNeedsRepair;

    public Book(String author, String title, int pageAmount, String giftedBy, String pressmark, boolean isNeedsRepair) {
        this.author = author;
        this.title = title;
        this.pageAmount = pageAmount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.isNeedsRepair = isNeedsRepair;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    protected String getGiftedBy() {
        return giftedBy;
    }

    protected void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public String getPressmark() {
        return pressmark;
    }

    void setPressmark(String pressmark) {
        this.pressmark = pressmark;
    }

    protected boolean isNeedsRepair() {
        return isNeedsRepair;
    }

    void setNeedsRepair(boolean needsRepair) {
        isNeedsRepair = needsRepair;
    }
}
