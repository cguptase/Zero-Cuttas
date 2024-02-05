package com.test.zerocuttas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, restartBtn;
    String strBtn1, strBtn2, strBtn3, strBtn4, strBtn5, strBtn6, strBtn7, strBtn8, strBtn9;
    int flag = 0, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        restartBtn = findViewById(R.id.restart);

        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });
    }

    public void start(View v) {
        Button currentBtn = (Button) v;     // user will click on random button, so to click that button we have to build an object of that button, and the reference of that random button is store in v
        count++;
        if (currentBtn.getText().toString().equals("")) {
            if (flag == 0) {
                currentBtn.setText("X");
                flag = 1;
            } else {
                currentBtn.setText("O");
                flag = 0;
            }

            // winning condition
            if (count > 4) {
                strBtn1 = btn1.getText().toString();
                strBtn2 = btn2.getText().toString();
                strBtn3 = btn3.getText().toString();
                strBtn4 = btn4.getText().toString();
                strBtn5 = btn5.getText().toString();
                strBtn6 = btn6.getText().toString();
                strBtn7 = btn7.getText().toString();
                strBtn8 = btn8.getText().toString();
                strBtn9 = btn9.getText().toString();

                if (strBtn1.equals(strBtn2) && strBtn2.equals(strBtn3) && !strBtn1.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn4.equals(strBtn5) && strBtn5.equals(strBtn6) && !strBtn4.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn4, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn7.equals(strBtn8) && strBtn8.equals(strBtn9) && !strBtn7.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn7, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn1.equals(strBtn4) && strBtn4.equals(strBtn7) && !strBtn1.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn2.equals(strBtn5) && strBtn5.equals(strBtn8) && !strBtn2.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn2, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn3.equals(strBtn6) && strBtn6.equals(strBtn9) && !strBtn3.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn1.equals(strBtn5) && strBtn5.equals(strBtn9) && !strBtn1.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn1, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (strBtn3.equals(strBtn5) && strBtn5.equals(strBtn7) && !strBtn3.equals("")) {
                    Toast.makeText(this, "Winner is " + strBtn3, Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                } else if (count == 9) {
                    Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            restart();
                        }
                    },2000);
                }
            }
        }
    }

    public void restart() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        flag = 0;

    }
}