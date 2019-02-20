package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("red","laal",R.drawable.color_red));
        words.add(new word("yellow","peela",R.drawable.color_mustard_yellow));
        words.add(new word("green","hara",R.drawable.color_green));
        words.add(new word("brown","bhoora",R.drawable.color_brown));
        words.add(new word("gray","dhoosar",R.drawable.color_gray));
        words.add(new word("black","kaalee",R.drawable.color_black));
        words.add(new word("white","saphed",R.drawable.color_white));



       /* words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");*/

        WordAdapter Ada = new WordAdapter(this,  words);

        ListView listVi = (ListView) findViewById(R.id.list);

        listVi.setAdapter(Ada);
    }
}
