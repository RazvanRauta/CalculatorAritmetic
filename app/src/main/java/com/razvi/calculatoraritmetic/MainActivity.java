package com.razvi.calculatoraritmetic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean imgBuna = true;

    public void adunare(View view){
        EditText primulNumar = (EditText) findViewById(R.id.primulNumar);
        EditText alDoileaNumar = (EditText) findViewById(R.id.alDoileaNumar);
        String primulNumarString = primulNumar.getText().toString();
        String alDoileaNumarString = alDoileaNumar.getText().toString();
        int primulNumarInt = Integer.parseInt(primulNumarString);
        int alDoileanumarInt = Integer.parseInt(alDoileaNumarString);

        int sum = primulNumarInt + alDoileanumarInt;

        String sumString = Integer.toString(sum);

        Toast.makeText(this,"Rezultatul adunarii este: " + sumString,Toast.LENGTH_LONG).show();

    }

    public void scadere(View view){
        EditText primulNumar = (EditText) findViewById(R.id.primulNumar);
        EditText alDoileaNumar = (EditText) findViewById(R.id.alDoileaNumar);
        String primulNumarString = primulNumar.getText().toString();
        String alDoileaNumarString = alDoileaNumar.getText().toString();
        int primulNumarInt = Integer.parseInt(primulNumarString);
        int alDoileanumarInt = Integer.parseInt(alDoileaNumarString);

        int sum = primulNumarInt - alDoileanumarInt;

        String sumString = Integer.toString(sum);

        Toast.makeText(this,"Rezultatul scaderii este: " + sumString,Toast.LENGTH_LONG).show();

    }

    public void inmultire(View view){
        EditText primulNumar = (EditText) findViewById(R.id.primulNumar);
        EditText alDoileaNumar = (EditText) findViewById(R.id.alDoileaNumar);
        String primulNumarString = primulNumar.getText().toString();
        String alDoileaNumarString = alDoileaNumar.getText().toString();
        int primulNumarInt = Integer.parseInt(primulNumarString);
        int alDoileanumarInt = Integer.parseInt(alDoileaNumarString);

        int sum = primulNumarInt * alDoileanumarInt;

        String sumString = Integer.toString(sum);

        Toast.makeText(this,"Rezultatul inmultirii este: " + sumString,Toast.LENGTH_LONG).show();

    }

    public void impartire(View view){
        EditText primulNumar = (EditText) findViewById(R.id.primulNumar);
        EditText alDoileaNumar = (EditText) findViewById(R.id.alDoileaNumar);
        String primulNumarString = primulNumar.getText().toString();
        String alDoileaNumarString = alDoileaNumar.getText().toString();
        int primulNumarInt = Integer.parseInt(primulNumarString);
        int alDoileanumarInt = Integer.parseInt(alDoileaNumarString);

        float sum = (float) primulNumarInt / alDoileanumarInt;

        String sumString = String.format("%.2f",sum);

        Toast.makeText(this,"Rezultatul impartirii este: " + sumString,Toast.LENGTH_LONG).show();

    }

    public void fade(View view){
        Log.i("Info","Imageview tapped");

        ImageView imageView = findViewById(R.id.imageView);

        ImageView imageView2 = findViewById(R.id.imageView2);



        if(imgBuna) {

            final MediaPlayer scream = MediaPlayer.create(this,R.raw.nmhscream1);

            ImageView img =  this.findViewById(R.id.imageView);
            img.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    scream.start();
                }

            });
            scream.start();

            imgBuna = false;

            imageView.animate().alpha(0).setDuration(100);

            imageView2.animate().alpha(1).setDuration(400);

            Toast.makeText(this, "Nu da click aiurea! :))", Toast.LENGTH_LONG).show();
        }else{
            imgBuna = true;

            imageView.animate().alpha(1).setDuration(1000);

            imageView2.animate().alpha(0).setDuration(1000);


            Toast.makeText(this, "Sa-ti fie invatatura de minte!", Toast.LENGTH_LONG).show();

        }


    }

//    public void playsound(View view){
//        ImageView imageView = findViewById(R.id.imageView);
//        imageView.playSoundEffect(R.raw.nmhscream1);
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



}
