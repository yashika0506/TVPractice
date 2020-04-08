package ItemsProject;

public enum ItemType {

    APPLE(10),
    NEWS_PAPER(1),
    MILK(20);

    private final int price;

    ItemType(int price) {
        this.price = price;
    }

    public String toString() {
        return this.name()+"";
    }

    public int price() {
        return this.price;
    }
}

