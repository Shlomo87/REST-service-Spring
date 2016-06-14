package main.groovy.test

/**
 * Created by klevshin on 6/13/2016.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class DriveSubscriberStructure {
    private String article;

    public DriveSubscriberStructure() {}

    public void setArticle(String s) {
        article = s;
    }

    public String getArticle() {
        return article;
    }

}



