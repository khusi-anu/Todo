package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class AddNotes extends AppCompatActivity {

    ArrayList<String> list;
    EditText inputText, DescText;
    ListView listView;

    FloatingActionButton fab = findViewById(R.id.fabtick);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = DescText.getText().toString();

                if(!text.equals("")){
                    list.add(text);
                    inputText.setText("");
                }
            }
        });
    }
}


