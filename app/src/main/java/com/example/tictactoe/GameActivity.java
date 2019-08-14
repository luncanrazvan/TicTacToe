package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private ImageView img11;
    private ImageView img12;
    private ImageView img13;
    private ImageView img21;
    private ImageView img22;
    private ImageView img23;
    private ImageView img31;
    private ImageView img32;
    private ImageView img33;

    private TextView textView;

    private Button buttonReset;

    private int count=0;

    final int[][] matrix= new int[3][3];

    private ArrayList<ImageView> imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.imageViews=new ArrayList<>();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j]=-1;
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        img11=findViewById(R.id.img11);
        img12=findViewById(R.id.img12);
        img13=findViewById(R.id.img13);
        img21=findViewById(R.id.img21);
        img22=findViewById(R.id.img22);
        img23=findViewById(R.id.img23);
        img31=findViewById(R.id.img31);
        img32=findViewById(R.id.img32);
        img33=findViewById(R.id.img33);
        imageViews.add(img11);
        imageViews.add(img12);
        imageViews.add(img13);
        imageViews.add(img21);
        imageViews.add(img22);
        imageViews.add(img23);
        imageViews.add(img31);
        imageViews.add(img32);
        imageViews.add(img33);
        textView=findViewById(R.id.agTV);
        buttonReset=findViewById(R.id.btnReset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        matrix[i][j]=-1;
                    }
                    for(ImageView imageView:imageViews){
                        imageView.setEnabled(true);
                        imageView.setImageResource(R.drawable.whiteimg);
                    }
                    count=0;
                    textView.setText("");
                }
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img11.setImageResource(R.drawable.xletter);
                    img11.setEnabled(false);
                    count++;
                    matrix[0][0]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                       textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img11.setImageResource(R.drawable.oletter);
                    img11.setEnabled(false);
                    count++;
                    matrix[0][0]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img12.setImageResource(R.drawable.xletter);
                    img12.setEnabled(false);
                    count++;
                    matrix[0][1]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img12.setImageResource(R.drawable.oletter);
                    img12.setEnabled(false);
                    count++;
                    matrix[0][1]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img13.setImageResource(R.drawable.xletter);
                    img13.setEnabled(false);
                    count++;
                    matrix[0][2]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img13.setImageResource(R.drawable.oletter);
                    img13.setEnabled(false);
                    count++;
                    matrix[0][2]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img21.setImageResource(R.drawable.xletter);
                    img21.setEnabled(false);
                    count++;
                    matrix[1][0]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img21.setImageResource(R.drawable.oletter);
                    img21.setEnabled(false);
                    count++;
                    matrix[1][0]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews) {
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img22.setImageResource(R.drawable.xletter);
                    img22.setEnabled(false);
                    count++;
                    matrix[1][1]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img22.setImageResource(R.drawable.oletter);
                    img22.setEnabled(false);
                    count++;
                    matrix[1][1]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img23.setImageResource(R.drawable.xletter);
                    img23.setEnabled(false);
                    count++;
                    matrix[1][2]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img23.setImageResource(R.drawable.oletter);
                    img23.setEnabled(false);
                    count++;
                    matrix[1][2]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img31.setImageResource(R.drawable.xletter);
                    img31.setEnabled(false);
                    count++;
                    matrix[2][0]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img31.setImageResource(R.drawable.oletter);
                    img31.setEnabled(false);
                    count++;
                    matrix[2][0]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img32.setImageResource(R.drawable.xletter);
                    img32.setEnabled(false);
                    count++;
                    matrix[2][1]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img32.setImageResource(R.drawable.oletter);
                    img32.setEnabled(false);
                    count++;
                    matrix[2][1]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
        img33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count%2==0){
                    img33.setImageResource(R.drawable.xletter);
                    img33.setEnabled(false);
                    count++;
                    matrix[2][2]=1;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP1Name()+" won!");
                    }
                }else{
                    img33.setImageResource(R.drawable.oletter);
                    img33.setEnabled(false);
                    count++;
                    matrix[2][2]=0;
                    if(verif()){
                        for(ImageView imageView:imageViews){
                            imageView.setEnabled(false);
                        }
                        textView.setText("Player "+Players.getP2Name()+" won!");
                    }
                }
            }
        });
    }

    public boolean verif(){
        if(matrix[0][0]==matrix[1][0] && matrix[0][0]==matrix[2][0] &&(matrix[0][0]!=-1 && matrix[1][0]!=-1 && matrix[2][0]!=-1)){
            return true;
        }

        if(matrix[0][1]==matrix[1][1] && matrix[0][1]==matrix[2][1] &&(matrix[0][1]!=-1 && matrix[1][1]!=-1 && matrix[2][1]!=-1)){
            return true;
        }

        if(matrix[0][2]==matrix[1][2] && matrix[0][2]==matrix[2][2] &&(matrix[0][2]!=-1 && matrix[1][2]!=-1 && matrix[2][2]!=-1)){
            return true;
        }

        if(matrix[0][0]==matrix[0][1] && matrix[0][0]==matrix[0][2] && (matrix[0][0]!=-1 && matrix[0][1]!=-1 && matrix[0][2]!=-1)){
            return true;
        }

        if(matrix[1][0]==matrix[1][1] && matrix[1][0]==matrix[1][2] && (matrix[1][0]!=-1 && matrix[1][1]!=-1 && matrix[1][1]!=-1)){
            return true;
        }

        if(matrix[2][0]==matrix[2][1] && matrix[2][0]==matrix[2][2] && (matrix[2][0]!=-1 && matrix[2][1]!=-1 && matrix[2][2]!=-1)){
            return true;
        }

        if(matrix[0][0]==matrix[1][1] && matrix[1][1]==matrix[2][2] && (matrix[0][0]!=-1 && matrix[1][1]!=-1 && matrix[2][2]!=-1)){
            return true;
        }

        if(matrix[0][2]==matrix[1][1] && matrix[1][1]==matrix[2][0] && (matrix[0][2]!=-1 && matrix[1][1]!=-1 && matrix[2][0]!=-1)){
            return true;
        }

        return false;
    }
}
