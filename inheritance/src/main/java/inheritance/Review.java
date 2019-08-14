package inheritance;

public class Review {
    public String author;
    public String body;
    public int stars;

    public Review(String author, String body, int stars, Restaurant restaurant){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String toString() {
        return this.author + "," + this.body + ", stars " + this.stars;
    }
}

