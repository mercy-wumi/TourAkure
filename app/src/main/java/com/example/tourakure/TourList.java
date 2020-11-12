package com.example.tourakure;

public class TourList {
    private String name;
    private String description;
    private int image= N0_IMAGE_PROVIDED;
    private static final  int N0_IMAGE_PROVIDED = -1;

    public TourList(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TourList(String name, String description, int mImage) {
        this.name = name;
        this.description = description;
        this.image = mImage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
    public boolean hasImage(){
        return image != N0_IMAGE_PROVIDED;
    }
}
