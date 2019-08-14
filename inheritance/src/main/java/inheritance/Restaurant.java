package inheritance;

import java.util.LinkedList;

public class Restaurant {
    public String name;
    public int stars;
    public String price;
    public LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, int stars, String price){
        this.name = name;
        this.stars = stars;
        this.price = price;

    }

    public String toString() {
        return this.name + ", stars " + this.stars + ", price " + this.price;
    }
    //add review to list
    public void addReview(Review review) {
        reviews.add(review);

        //update stars
        int sum = 0;
        for (Review rev : reviews) {
            sum += rev.stars;
        }
        //calculate stars
        this.stars = sum / reviews.size();
    }
}
