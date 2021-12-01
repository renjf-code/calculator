package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button dot;
    Button equ;
    Button clear;
    Button fang;
    Button gen;
    Button change;
    EditText result;

    double num1 = 0, num2 = 0;
    double Result = 0;
    int op = 0;
    String text = "", num = "";
    String mys = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn0 = findViewById(R.id.btn_0);
        add = findViewById(R.id.btn_add);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        equ = findViewById(R.id.btn_equ);
        dot = findViewById(R.id.btn_dot);
        clear = findViewById(R.id.btn_clear);
        result = findViewById(R.id.et_result);
        fang = findViewById(R.id.btn_fang);
        gen = findViewById(R.id.btn_gen);
        change = findViewById(R.id.btn_change);

        btn1.setOnClickListener(new Click());
        btn2.setOnClickListener(new Click());
        btn3.setOnClickListener(new Click());
        btn4.setOnClickListener(new Click());
        btn5.setOnClickListener(new Click());
        btn6.setOnClickListener(new Click());
        btn7.setOnClickListener(new Click());
        btn8.setOnClickListener(new Click());
        btn9.setOnClickListener(new Click());
        btn0.setOnClickListener(new Click());
        add.setOnClickListener(new Click());
        sub.setOnClickListener(new Click());
        mul.setOnClickListener(new Click());
        div.setOnClickListener(new Click());
        equ.setOnClickListener(new Click());
        dot.setOnClickListener(new Click());
        clear.setOnClickListener(new Click());
        result.setOnClickListener(new Click());
        fang.setOnClickListener(new Click());
        gen.setOnClickListener(new Click());
        change.setOnClickListener(new Click());
    }


    class Click implements View.OnClickListener {
        double operation(){
            switch (op) {
                case 0:
                    Result = num1;
                    break;
                case 1:
                    Result = num1 + num2;
                    break;
                case 2:
                    Result = num1 - num2;
                    break;
                case 3:
                    Result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0)
                    {
                        result.setText("除数不能为0");
                        Result = 1;
                    }
                    else
                        Result = num1 / num2;
                    break;
                default:
                    Result = 0;
                    break;
            }
            //System.out.println(num1+" "+num2+"=" +Result);
            return Result;
        }
        void clear(){
            result.setText(null);
            Result=num1=num2=0;
            num=mys="";
            op=0;
        }
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_0:
                    if(op==5){
                        clear();
                    }
                    mys = result.getText().toString()+"0";
                    num+="0";
                    result.setText(mys);
                    break;
                case R.id.btn_1:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"1";
                    num+="1";
                    result.setText(mys);
                    break;
                case R.id.btn_2:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"2";
                    num+="2";
                    result.setText(mys);
                    break;
                case R.id.btn_3:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"3";
                    num+="3";
                    result.setText(mys);
                    break;
                case R.id.btn_4:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"4";
                    num+="4";
                    result.setText(mys);
                    break;
                case R.id.btn_5:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"5";
                    num+="5";
                    result.setText(mys);
                    break;
                case R.id.btn_6:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"6";
                    num+="6";
                    result.setText(mys);
                    break;
                case R.id.btn_7:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"7";
                    num+="7";
                    result.setText(mys);
                    break;
                case R.id.btn_8:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"8";
                    num+="8";
                    result.setText(mys);
                    break;
                case R.id.btn_9:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+"9";
                    num+="9";
                    result.setText(mys);
                    break;
                case R.id.btn_dot:
                    if(op==5){
                        clear();
                    }
                    mys=result.getText().toString()+".";
                    num+=".";
                    result.setText(mys);
                    break;
                case R.id.btn_add:
                    if(num==""){
                        num="0";
                    }
                    if(op==5){
                    }
                    else if (op != 0) {
                        num2 = Double.valueOf(num);
                        num1 = operation();
                    }
                    else{
                        num1=Double.valueOf(num);
                    }
                    mys = result.getText().toString()+"+";
                    num="";
                    result.setText(mys);
                    op = 1;
                    break;
                case R.id.btn_sub:
                    if(num==""){
                        num="0";
                    }
                    if(op==5){
                    }
                    else if (op != 0) {
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    else{
                        num1=Double.valueOf(num);
                    }

                    mys = result.getText().toString()+"-";
                    num="";
                    result.setText(mys);
                    op = 2;
                    break;
                case R.id.btn_mul:
                    if(num==""){
                        num="0";
                    }
                    if(op==5){
                    }
                    else if (op != 0) {
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    else{
                        num1=Double.valueOf(num);
                    }
                    mys=result.getText().toString()+"*";
                    num="";
                    result.setText(mys);
                    op = 3;
                    break;
                case R.id.btn_div:
                    if(num==""){
                        result.setText("除数为0");
                        break;
                    }
                    if(op==5){
                    }
                    else if (op != 0) {
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    else{
                        num1=Double.valueOf(num);
                    }
                    mys=result.getText().toString()+"/";
                    num="";
                    result.setText(mys);
                    op = 4;
                    break;
                case R.id.btn_change:
                    if(num==""){
                        result.setText("格式错误");
                        break;
                    }
                    if(op==5){
                    }
                    else if(op==0){
                        num1=Double.valueOf(num);
                    }
                    else{
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    if(num1!=0){
                        num1=0-num1;
                    }
                    else {
                        num1=0;
                    }
                    mys=result.getText().toString()+"+/- ="+num1;
                    num="";
                    result.setText(mys);
                    op = 5;
                    break;
                case R.id.btn_fang:
                    if(num==""){
                        result.setText("格式错误");
                        break;
                    }
                    if(op==5){
                    }
                    else if(op==0){
                        num1=Double.valueOf(num);
                    }
                    else{
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    num1=num1*num1;
                    mys=result.getText().toString()+"^2 ="+num1;
                    num="";
                    result.setText(mys);
                    op = 5;
                    break;
                case R.id.btn_gen:
                    if(mys==""){
                        result.setText("格式错误");
                        break;
                    }
                    if(op==5){
                    }
                    else if(op==0){
                        num1=Double.valueOf(num);
                    }
                    else{
                        num2=Double.valueOf(num);
                        num1=operation();
                    }
                    if(num1<0){
                        result.setText("负数无法开根");
                        break;
                    }
                    else {
                        num1=Math.sqrt(num1);
                    }
                    mys=result.getText().toString()+"开根=" +num1;
                    num="";
                    result.setText(mys);
                    op = 5;
                    break;
                case R.id.btn_clear:
                    clear();
                    break;
                case R.id.btn_equ:
                    if(num==""){
                        result.setText("格式错误");
                        break;
                    }
                    num2=Double.valueOf(num);
                    num1=operation();
                    if(op != 4 && num2 != 0)
                        result.setText(mys+"="+num1);
                    op = 5;
                    break;
                default:
                    break;
            }
        }
    }
}