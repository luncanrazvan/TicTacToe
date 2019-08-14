package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private Button submitButton;

    private EditText p1NameET;
    private EditText p2NameET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton=findViewById(R.id.startBtn);


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this).create();
                LayoutInflater inflater=MainActivity.this.getLayoutInflater();
                final View dialogView=inflater.inflate(R.layout.layout_for_alert_dialog,null);
                submitButton=dialogView.findViewById(R.id.btnSubmit);
                submitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        p1NameET=dialogView.findViewById(R.id.tvInsertP1Name);
                        p2NameET=dialogView.findViewById(R.id.tvInsertP2Name);
                        Players.setP1Name(p1NameET.getText().toString());
                        Players.setP2Name(p2NameET.getText().toString());
                        Intent intent=new Intent(MainActivity.this,GameActivity.class);
                        startActivity(intent);
                    }
                });
                alertDialog.setView(dialogView);
                alertDialog.show();
            }
        });
    }
}
