import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Quote {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;

    public Quote(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = false;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}

public class QuoteService {
    private List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        return quotes.stream()
                .map(q -> q.getQuote())
                .collect(Collectors.toList());
    }

    public List<Quote> getQuotesForAuthor(String author) {
        return quotes.stream()
                .filter(q -> q.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<String> getAuthors() {
        return quotes.stream()
                .map(q -> q.getAuthor())
                .distinct()
                .collect(Collectors.toList());
    }

    public void setFavourite(int id) {
        Quote quote = quotes.stream()
                .filter(q -> q.getId() == id)
                .findFirst()
                .get();
        quote.setFavourite(true);
    }

    public List<Quote> getFavourites() {
        return quotes.stream()
                .filter(q -> q.isFavourite())
                .collect(Collectors.toList());
    }

    public String getRandomQuote() {
        Random random = new Random();
        int id = random.nextInt(quotes.size()) + 1;
        return quotes.stream()
                .filter(q -> q.getId() == id)
                .findFirst()
                .get()
                .getQuote();
    }
}
