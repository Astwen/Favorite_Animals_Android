package se.astridw.favoriteanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        ImageView animalImage = (ImageView) findViewById(R.id.animalImage);

        TextView animalName = (TextView) findViewById(R.id.textName);

        TextView animalInfo = (TextView) findViewById(R.id.textinfo);

        Intent intent = getIntent();

        String animalDisplay = intent.getStringExtra("Animal");

        Zoo myZoo = new Zoo();

        Animal animal = myZoo.getAnimal(animalDisplay);



        if(animal != null) {

            animalName.setText(animal.getName());
            animalInfo.setText(animal.getDescription());
            animalImage.setImageResource(animal.getImageId());
        }





    }
}
