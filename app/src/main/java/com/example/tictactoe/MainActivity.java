package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;
    int count = 0;
    int b1,b2,b3,b4,b5,b6,b7,b8,b9=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        iv4 = findViewById(R.id.iv4);
        iv5 = findViewById(R.id.iv5);
        iv6 = findViewById(R.id.iv6);
        iv7 = findViewById(R.id.iv7);
        iv8 = findViewById(R.id.iv8);
        iv9 = findViewById(R.id.iv9);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1 == 0) {
                    if (count % 2 == 0) {
                        iv1.setImageResource(R.drawable.zero);
                    } else {
                        iv1.setImageResource(R.drawable.close);
                    }
                    count++;
                    b1++;
                }
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2 == 0) {
                    if (count % 2 == 0) {
                        iv2.setImageResource(R.drawable.zero);
                    } else {
                        iv2.setImageResource(R.drawable.close);
                    }
                    count++;
                    b2++;
                }
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3 == 0) {
                    if (count % 2 == 0) {
                        iv3.setImageResource(R.drawable.zero);
                    } else {
                        iv3.setImageResource(R.drawable.close);
                    }
                    count++;
                    b3++;
                }
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4 == 0) {
                    if (count % 2 == 0) {
                        iv4.setImageResource(R.drawable.zero);
                    } else {
                        iv4.setImageResource(R.drawable.close);
                    }
                    count++;
                    b4++;
                }
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5 == 0) {
                    if (count % 2 == 0) {
                        iv5.setImageResource(R.drawable.zero);
                    } else {
                        iv5.setImageResource(R.drawable.close);
                    }
                    count++;
                    b5++;
                }
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6 == 0) {
                    if (count % 2 == 0) {
                        iv6.setImageResource(R.drawable.zero);
                    } else {
                        iv6.setImageResource(R.drawable.close);
                    }
                    count++;
                    b6++;
                }
            }
        });
        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7 == 0) {
                    if (count % 2 == 0) {
                        iv7.setImageResource(R.drawable.zero);
                    } else {
                        iv7.setImageResource(R.drawable.close);
                    }
                    count++;
                    b7++;
                }
            }
        });
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8 == 0) {
                    if (count % 2 == 0) {
                        iv8.setImageResource(R.drawable.zero);
                    } else {
                        iv8.setImageResource(R.drawable.close);
                    }
                    count++;
                    b8++;
                }
            }
        });
        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9 == 0) {
                    if (count % 2 == 0) {
                        iv9.setImageResource(R.drawable.zero);
                    } else {
                        iv9.setImageResource(R.drawable.close);
                    }
                    count++;
                    b9++;
                }
            }
        });
    }
}