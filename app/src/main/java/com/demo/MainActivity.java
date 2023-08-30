package com.demo;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;

    private EditText editTextEmail;

    private Button btn;

    private RadioButton radioButtonMale;

    private int currentImageIndex = 0;

    private int[] images = {R.drawable.chat, R.drawable.chat2_foreground, R.drawable.cat_foreground};

    private ImageButton btnPrev;

    private ImageButton btnNext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame);

//        btn = findViewById(R.id.btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                editTextName= findViewById(R.id.editTextName);
//
//                editTextEmail= findViewById(R.id.editTextEmail);
//
//                String name  = editTextName.getText().toString();
//                String email = editTextEmail.getText().toString();
//
//                radioButtonMale = findViewById(R.id.radioButtonMale);
//
//                String genre = radioButtonMale.isChecked() ?  "Homme" : "Femme";
//
//                String message = "Nom : " + name + " " + "email :" + email + " " + "Genre : " + genre ;
//
//                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
//            }
//        });
//    }
    }
}