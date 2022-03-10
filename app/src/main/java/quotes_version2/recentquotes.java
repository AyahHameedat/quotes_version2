package quotes_version2;

import java.util.Arrays;

public class recentquotes {


     String author;
     String text;

    public recentquotes(String author, String text) {

        this.author = author;
        this.text = text;
    }


    @Override
    public String toString() {
        return "recentquotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
