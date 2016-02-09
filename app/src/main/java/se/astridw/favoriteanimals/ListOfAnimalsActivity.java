package se.astridw.favoriteanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ListOfAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);


    }

    public void exploreAnimal(View view) {

        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("Animal", "älg");

        startActivity(intent);
    }

    public void exploreAnimalPanda (View view) {

        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("Animal", "panda");

        startActivity(intent);
    }

    public void exploreAnimalCat (View view) {

        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("Animal", "katt");

        startActivity(intent);
    }

    // Instansmetoder

    // Vad som händer när man klickar på "SHARE"
    public void shareInformation(View view) {



    }
}
