package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("father","pita",R.drawable.family_father));
        words.add(new word("mother","maan",R.drawable.family_mother));
        words.add(new word("son","beta",R.drawable.family_son));
        words.add(new word("daughter","betee",R.drawable.family_daughter));
        words.add(new word("older brother","bada bhaee",R.drawable.family_older_brother));
        words.add(new word("younger brother","chhota bhaee",R.drawable.family_younger_brother));
        words.add(new word("older sister","badee bahan",R.drawable.family_older_sister));
        words.add(new word("younger sister","chhotee bahan",R.drawable.family_younger_sister));
        words.add(new word("grandmother","daadee ma",R.drawable.family_grandmother));
        words.add(new word("grandfather","daada",R.drawable.family_grandfather));


       /* words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");*/

        WordAdapter Adap = new WordAdapter(this,  words);

        ListView listV = (ListView) findViewById(R.id.list);

        listV.setAdapter(Adap);
    }
}
