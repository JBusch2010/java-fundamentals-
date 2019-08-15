package inheritance;

public class Review<T> {
    public String author;
    public String body;
    public int stars;
    public T businessType;
    public String movie;

    public Review(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public Review(String body, String author, int stars, T businessType) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.businessType = businessType;
    }

    public String toString() {
        return this.author + "," + this.body + ", stars " + this.stars;
    }
}

