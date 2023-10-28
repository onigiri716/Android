package com.example.ungdungnotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_screen);
    }
    public void OpenNote(View view){
        startActivity(new Intent(this,tao_note.class));
    }
    }