package com.calebwhang.myappportfolio;

/**
 * Created by caleb on 6/6/15.
 */
public class PortfolioApp {
    String title;
    String description;
    int icon;

    public PortfolioApp(String title, String description, int icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}
