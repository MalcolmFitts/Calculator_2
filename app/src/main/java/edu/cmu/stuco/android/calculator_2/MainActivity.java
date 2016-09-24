package edu.cmu.stuco.android.calculator_2;

import android.support.annotation.IdRes;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private Context mContext;
    private Button button_one;
    private Button button_two;
    private Button button_three;
    private Button button_four;
    private Button button_five;
    private Button button_six;
    private Button button_seven;
    private Button button_eight;
    private Button button_nine;
    private Button button_zero;
    private Button button_pound;
    private Button button_clear;
    private Button button_plus;
    private Button button_minus;
    private Button button_multiply;
    private Button button_divide;
    private Button button_equals;
    private TextView top_text;
    private TextView bottom_text;

    private int sum = 0;
    private int addend1 = 0;
    private boolean addendSet = false;
    private boolean sumSet = false;
    String nextOP = "";
    //String divByZero = "You can't do that";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_text = (TextView) findViewById(R.id.text_view_top);
        bottom_text = (TextView) findViewById(R.id.text_view_bottom);

        top_text.setText("");
        bottom_text.setText("");

        button_one = (Button) findViewById(R.id.one_button);
        button_two = (Button) findViewById(R.id.two_button);
        button_three = (Button) findViewById(R.id.three_button);
        button_four = (Button) findViewById(R.id.four_button);
        button_five = (Button) findViewById(R.id.five_button);
        button_six = (Button) findViewById(R.id.six_button);
        button_seven = (Button) findViewById(R.id.seven_button);
        button_eight = (Button) findViewById(R.id.eight_button);
        button_nine = (Button) findViewById(R.id.nine_button);
        button_zero = (Button) findViewById(R.id.zero_button);
        button_equals = (Button) findViewById(R.id.equal_button);
        button_clear = (Button) findViewById(R.id.clear_button);
        button_plus = (Button) findViewById(R.id.plus_button);
        button_minus = (Button) findViewById(R.id.minus_button);
        button_multiply = (Button) findViewById(R.id.multiplication_button);
        button_divide = (Button) findViewById(R.id.division_button);
        button_pound = (Button) findViewById(R.id.pound_button);

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 1; //adds 1 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 2; //adds 2 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 3; //adds 3 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 4; //adds 4 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 5; //adds 5 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 6; //adds 6 to the addend
                addendSet = true;
                updateTextViews();
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 7; //adds 7 to the addend
                addendSet = true;
                updateTextViews();
            }

        });

        button_eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 8; //adds 8 to the addend
                addendSet = true;
                updateTextViews();
            }

        });

        button_nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10 + 9; //adds 9 to the addend
                addendSet = true;
                updateTextViews();
            }

        });

        button_zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                addend1 = addend1 * 10; //adds 0 to the addend
                addendSet = true;
                updateTextViews();
            }


        });

        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(nextOP.equals("") || nextOP.equals("+")){
                    sum = sum + addend1;
                }

                else{
                    if(nextOP.equals("*")){ sum = sum * addend1; }
                    if(nextOP.equals("-")){ sum = sum - addend1; }
                    if(nextOP.equals("/")){
                        if(addend1 != 0){ sum = sum/addend1; }
                        else{
                            //Toast.makeText(this,divByZero,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                nextOP = "+";
                operatorReset();
                updateTextViews();
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(nextOP.equals("") || nextOP.equals("-")){
                    sum = sum - addend1;
                }

                else{
                    if(nextOP.equals("*")){ sum = sum * addend1; }
                    if(nextOP.equals("+")){ sum = sum + addend1; }
                    if(nextOP.equals("/")){
                        if(addend1 != 0){ sum = sum/addend1; }
                        else{
                            //Toast.makeText(this,divByZero,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                nextOP = "-";
                operatorReset();
                updateTextViews();
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(nextOP.equals("") || nextOP.equals("*")){
                    if(sum == 0){ sum = addend1; }
                    else if(sum != 0 && addendSet == false){ sum = sum; }
                    else { sum = sum * addend1; }
                }

                else{
                    if(nextOP.equals("-")){ sum = sum - addend1; }
                    if(nextOP.equals("+")){ sum = sum + addend1; }
                    if(nextOP.equals("/")){
                        if(addend1 != 0){ sum = sum/addend1; }
                        else{
                            //Toast.makeText(this,divByZero,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                nextOP = "*";
                operatorReset();
                updateTextViews();
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(nextOP.equals("") || nextOP.equals("/")){
                    if(addend1 != 0){ sum = sum/addend1; }
                    else{
                        //Toast.makeText(this,divByZero,Toast.LENGTH_SHORT).show();
                    }
                }

                else{
                    if(nextOP.equals("-")){ sum = sum - addend1; }
                    if(nextOP.equals("+")){ sum = sum + addend1; }
                    if(nextOP.equals("*")){ sum = sum * addend1; }
                }
                nextOP = "/";
                operatorReset();
                updateTextViews();
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(nextOP.equals("/")){
                    if(addend1 != 0){ sum = sum/addend1; }
                    else{
                        //Toast.makeText(this,divByZero,Toast.LENGTH_SHORT).show();
                    }
                }
                if(nextOP.equals("-")){ sum = sum - addend1; }
                if(nextOP.equals("+")){ sum = sum + addend1; }
                if(nextOP.equals("*")){ sum = sum * addend1; }

                nextOP = "";
                operatorReset();
                updateTextViews();
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                sum = 0;
                addend1 = 0;
                addendSet = false;
                sumSet = false;
                updateTextViews();
            }
        });


    }

    public void operatorReset(){
        addendSet = false;
        sumSet = true;
        addend1 = 0;
    }

    public void updateTextViews(){
        if(sumSet){
            top_text.setText(String.valueOf(sum));
        }
        else{
            top_text.setText("");
        }

        if(addendSet){
            bottom_text.setText(String.valueOf(addend1));
        }
        else{
            bottom_text.setText("");
        }

    }

}
