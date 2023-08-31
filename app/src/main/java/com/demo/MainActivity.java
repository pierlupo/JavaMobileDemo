package com.demo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    private EditText editTextName;
//
//    private EditText editTextEmail;
//
//    private Button btn;
//
//    private RadioButton radioButtonMale;

//    private int currentImageIndex = 0;
//
//    private int[] images = {R.drawable.chat, R.drawable.chat2_foreground, R.drawable.cat_foreground};
//
//    private ImageButton btnPrev;
//
//    private ImageButton btnNext;
//
//    private ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_button);

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



//        imageView = findViewById(R.id.imageVue);
//
//        btnNext = findViewById(R.id.btnNext);
//
//        btnPrev = findViewById(R.id.btnPrev);
//
//        btnPrev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showPrevImage();
//            }
//        });
//
//        btnNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showNextImage();
//            }
//        });

//        LinearLayout mainLayout = findViewById(R.id.main_table);
//
//        for (int i = 0; i < 4; i++) {
//            Button b = new Button(this);
//            b.setText("Contenu Button" + i);
//            mainLayout.addView(b);
//
//        }
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        TableLayout tableLayout = findViewById(R.id.main_table);
        for (int i = 0; i < tableLayout.getChildCount(); i++) {
            TableRow tableRow = (TableRow) tableLayout.getChildAt(i);
            for (int j = 0; j < tableRow.getChildCount(); j++) {
                Button button = (Button) tableRow.getChildAt(j);
                button.setOnClickListener((e)->{
                    alertDialog.setMessage(((Button)e).getText()).create().show();
                });
            }

        }

    }

//    private void showImgAtIndex(int index){
//        imageView.setImageResource(images[index]);
//    }
//
//    private void showPrevImage(){
//        if(currentImageIndex > 0 ){
//            currentImageIndex --;
//        }
//        showImgAtIndex(currentImageIndex);
//    }
//
//    private void showNextImage(){
//        if(currentImageIndex < images.length - 1 ){
//            currentImageIndex ++;
//        }
//        showImgAtIndex(currentImageIndex);
//    }



}