package se.astridw.favoriteanimals;

import android.widget.Toast;

import java.util.ArrayList;


public class Zoo {

    private ArrayList<Animal> zooAnimals = new ArrayList<>();

    public Zoo() {

        Animal elk = new Animal(R.drawable.elkpic,"Älg", "Bor i skog");
        Animal panda = new Animal(R.drawable.pandapic, "Panda", "äter bambu");
        Animal katt = new Animal(R.drawable.catpic, "Katt", "Meow meow");

        zooAnimals.add(elk);
        zooAnimals.add(panda);
        zooAnimals.add(katt);

    }

    public Animal getAnimal (String whichAnimal) {

        int index = -1;

        switch (whichAnimal) {
            case "älg": index = 0;
                break;
            case "panda": index = 1;
                break;
            case "katt": index = 2;
                break;


        }
        if(index == -1) {
            return null;
        } else {
            return zooAnimals.get(index);
        }

    }



}
