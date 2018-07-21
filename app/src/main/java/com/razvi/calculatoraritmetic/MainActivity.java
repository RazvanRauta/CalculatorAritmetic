package com.razvi.calculatoraritmetic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
