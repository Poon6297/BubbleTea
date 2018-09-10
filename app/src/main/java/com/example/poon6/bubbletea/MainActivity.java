package com.example.poon6.bubbletea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView mB1;
    ImageView mB2;
    ImageView mB3;
    ImageView mB4;

    ImageView mBC1;
    ImageView mBC2;
    ImageView mBC3;
    ImageView mBC4;

    TextView mTextView;

    Button m0;
    Button m20;
    Button m50;
    Button m70;
    Button m100;
    Button m120;

    ImageView mPlus;
    ImageView mMinus;
    TextView mQuantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mB1 = findViewById(R.id.iv_b1);
        mB2 = findViewById(R.id.iv_b2);
        mB3 = findViewById(R.id.iv_b3);
        mB4 = findViewById(R.id.iv_b4);

        mTextView = findViewById(R.id.tv_text);

        mBC1 = findViewById(R.id.iv_bc1);
        mBC2 = findViewById(R.id.iv_bc2);
        mBC3 = findViewById(R.id.iv_bc3);
        mBC4 = findViewById(R.id.iv_bc4);

        m0 = findViewById(R.id.btn_0);
        m20 = findViewById(R.id.btn_20);
        m50 = findViewById(R.id.btn_50);
        m70 = findViewById(R.id.btn_70);
        m100 = findViewById(R.id.btn_100);
        m120 = findViewById(R.id.btn_120);

        mPlus = findViewById(R.id.iv_plus);
        mMinus = findViewById(R.id.iv_minus);
        mQuantity = findViewById(R.id.tv_quantity);
    }

    public void setVisible(int id){
        switch (id) {
            case R.id.iv_b1:
                mBC1.setVisibility(View.VISIBLE);
                break;

            case R.id.iv_b2:
                mBC2.setVisibility(View.VISIBLE);
                break;

            case R.id.iv_b3:
                mBC3.setVisibility(View.VISIBLE);
                break;

            case R.id.iv_b4:
                mBC4.setVisibility(View.VISIBLE);
                break;
        }

        mTextView.setVisibility(View.VISIBLE);

        m0.setVisibility(View.VISIBLE);
        m20.setVisibility(View.VISIBLE);
        m50.setVisibility(View.VISIBLE);
        m70.setVisibility(View.VISIBLE);
        m100.setVisibility(View.VISIBLE);
        m120.setVisibility(View.VISIBLE);

        mPlus.setVisibility(View.VISIBLE);
        mMinus.setVisibility(View.VISIBLE);
        mQuantity.setVisibility(View.VISIBLE);
    }

    public void setInvisible() {
        mB1.setVisibility(View.INVISIBLE);
        mB2.setVisibility(View.INVISIBLE);
        mB3.setVisibility(View.INVISIBLE);
        mB4.setVisibility(View.INVISIBLE);
    }

    public void setColor(int id) {
        m0.setTextColor(-16777216);
        m20.setTextColor(-16777216);
        m50.setTextColor(-16777216);
        m70.setTextColor(-16777216);
        m100.setTextColor(-16777216);
        m120.setTextColor(-16777216);

        switch (id) {
            case R.id.btn_0:
                m0.setTextColor(-65536);
                break;

            case R.id.btn_20:
                m20.setTextColor(-65536);
                break;

            case R.id.btn_50:
                m50.setTextColor(-65536);
                break;

            case R.id.btn_70:
                m70.setTextColor(-65536);
                break;

            case R.id.btn_100:
                m100.setTextColor(-65536);
                break;

            case R.id.btn_120:
                m120.setTextColor(-65536);
                break;
        }
    }

    public void count(int id) {
        int quantity = Integer.parseInt(mQuantity.getText().toString());

        switch (id) {
            case R.id.iv_plus:
                quantity++;
                mQuantity.setText(Integer.toString(quantity));
                break;

            case R.id.iv_minus:
                if (quantity > 1) {
                    quantity--;
                    mQuantity.setText(Integer.toString(quantity));
                    break;
                }
        }
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.iv_b1:
                setInvisible();
                setVisible(id);
                break;

            case R.id.iv_b2:
                setInvisible();
                setVisible(id);
                break;

            case R.id.iv_b3:
                setInvisible();
                setVisible(id);
                break;

            case R.id.iv_b4:
                setInvisible();
                setVisible(id);
                break;

            case R.id.btn_0:
                setColor(id);
                break;

            case R.id.btn_20:
                setColor(id);
                break;

            case R.id.btn_50:
                setColor(id);
                break;

            case R.id.btn_70:
                setColor(id);
                break;

            case R.id.btn_100:
                setColor(id);
                break;

            case R.id.btn_120:
                setColor(id);
                break;

            case R.id.iv_plus:
                count(id);
                break;

            case R.id.iv_minus:
                count(id);
                break;
        }
    }
}
