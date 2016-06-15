package hello;

import java.util.ArrayList;

/**
 * Created by klevshin on 6/8/2016.
 */
public class DrivePublisher {
    public ArrayList<DriveSubscriber> subscribers = new ArrayList<DriveSubscriber>();
    public String SendingResult;

    public void sendArticle(String article) {

        for(DriveSubscriber subscriber : subscribers) {
            SendingResult = subscriber.receiveArticle(article);
        }
    }




}



