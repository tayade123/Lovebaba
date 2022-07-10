package com.example.lovebaba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    ImageView img3;
    EditText edit,edit1,ed1;
    String result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    button=findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
        edit=findViewById(R.id.edit);
        edit1=findViewById(R.id.edit1);
        ed1=findViewById(R.id.ed1);
        img3=findViewById(R.id.img3);
        String m=edit.getText().toString();
        String f=edit1.getText().toString();
        String sum=m+f;
        sum=sum.toLowerCase();
        int value=sum.hashCode();

        Random random= new Random(value);
        result=(random.nextInt(100)+1)+"%";

        if(f.equals("")||m.equals("")){
            Toast.makeText(MainActivity3.this,"Enter The Names ",Toast.LENGTH_SHORT).show();
        }
        else
        ed1.setText(result);

        }
    });
}
}