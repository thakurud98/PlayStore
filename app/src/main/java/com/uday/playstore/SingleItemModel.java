package com.uday.playstore;

/**
 * Created by Uday on 1/17/2017.
 */
import com.uday.playstore.*;

public class SingleItemModel {

    private String name;
    private String url;
    private String description;
    private int btn;
    public SingleItemModel(String name, String url) {
        this.name = name;
        this.btn= btn;
        this.url = url;

    }

    public SingleItemModel() {
    }


    public int getBtn() {
        return btn;
    }

    public void setBtn(int btn) {
        this.btn = btn;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
