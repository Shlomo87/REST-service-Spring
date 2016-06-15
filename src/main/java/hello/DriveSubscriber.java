package hello;

/**
 * Created by klevshin on 6/8/2016.
 */
public class DriveSubscriber {

    public String article;

    public String receiveArticle(String s) {
        article = s;
        return article + " ok";
    }

}


