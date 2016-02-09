package se.astridw.favoriteanimals;

/**
 * Created by Wille on 2016-02-02.
 */
public class Animal {

    // Instansvariabler
    // Bild
    // Namn
    // Beskrivning

    private int imageId;
    private String name;
    private String description;

    // Klassvariabler
    // Konstruktorer
    public Animal () {

    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public Animal (int imageId, String name, String desc) {
        this.imageId = imageId;
        this.name = name;
        this.description = desc;
    }

    public int getImageId() {
        return this.imageId;
    }
}
