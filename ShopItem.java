public interface ShopItem {
    String name();
    int price();
    Category category();
}

public enum Category {
    ON_SALE,
    NEW,
    REFURBISHED
}

public class Clothes implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}

public class Electronics implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}

public class Fruits implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }
}

public class Shop<T extends ShopItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                result.add
