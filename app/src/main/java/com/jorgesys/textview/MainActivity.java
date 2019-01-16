package com.jorgesys.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String longText = "Elenasys lives in Iasi. Iași (UK: /ˈjæʃi/, US: /ˈjɑːʃ(i)/; Romanian: [ˈjaʃʲ] (About this soundlisten); also referred to as Jassy or Iassy)[8][9] is the second largest city in Romania,[7] and the seat of Iași County. Located in the historical region of Moldavia, Iași has traditionally been one of the leading centres of Romanian social, cultural, academic and artistic life. The city was the capital of the Principality of Moldavia from 1564 to 1859, then of the United Principalities from 1859 to 1862, and the capital of Romania from 1916 to 1918. There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";
        longText += "\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";

        TextView textView = findViewById(R.id.myTextView);
        textView.setText(longText);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
