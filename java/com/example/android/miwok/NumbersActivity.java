package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("one","ek",R.drawable.number_one));
        words.add(new word("two","do",R.drawable.number_two));
        words.add(new word("three","teen",R.drawable.number_three));
        words.add(new word("four","chaar",R.drawable.number_four));
        words.add(new word("five","panj",R.drawable.number_five));
        words.add(new word("six","chhah",R.drawable.number_six));
        words.add(new word("seven","saat",R.drawable.number_seven));
        words.add(new word("eight","aath",R.drawable.number_eight));
        words.add(new word("nine","nine",R.drawable.number_nine));
        words.add(new word("ten","das",R.drawable.number_ten));


       /* words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");*/

        WordAdapter Adapter = new WordAdapter(this,  words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

        /*int index = 0;
        while(index<words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            simple.addView(wordView);
            index++;*/



    }
}
