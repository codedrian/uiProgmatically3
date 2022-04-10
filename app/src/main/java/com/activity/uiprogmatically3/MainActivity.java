package com.activity.uiprogmatically3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

import static android.graphics.Color.GREEN;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //for text view 1
        LinearLayout firsttextView = new LinearLayout(this);
        TextView tvtextView = new TextView(this);
        tvtextView.setText("Text View");
        tvtextView.setTextSize(19);
        firsttextView.addView(tvtextView);

        //for edit text 2
        LinearLayout secondeditText = new LinearLayout(this);
        secondeditText.setOrientation(LinearLayout.HORIZONTAL);
        EditText eteditText = new EditText(this);
        eteditText.setText("Edit Text");
        eteditText.setGravity(Gravity.LEFT);
        eteditText.setWidth(1000);
        secondeditText.addView(eteditText);

        //button 1
        LinearLayout firstbuttonLayout = new LinearLayout(this);
        Button firstButton = new Button(this);
        firstButton.setText("Button");
        firstButton.setTextSize(20);
        firstButton.setWidth(1000);
        firstbuttonLayout.addView(firstButton);

        //image view
        LinearLayout firstImageView = new LinearLayout(this);
        ImageView ivAssignment = new ImageView(this);
        firstImageView.setBackgroundResource(R.drawable.ic_baseline_assignment_ind_24);
        firstImageView.addView(ivAssignment);

        //button 2
        LinearLayout secondbuttonLayout = new LinearLayout(this);
        Button secondButton = new Button(this);
        secondButton.setText("Enable");
        secondButton.setTextSize(17);
        secondButton.setWidth(1000);
        secondbuttonLayout.addView(secondButton);

        //for checkbox 6
        LinearLayout sixthcheckBox = new LinearLayout(this);
        CheckBox chcheckBox1 = new CheckBox(this);
        chcheckBox1.setText("Checkbox1");
        sixthcheckBox.addView(chcheckBox1);

        //for checkbox 7
        LinearLayout seventhcheckBox = new LinearLayout(this);
        CheckBox chcheckBox2 = new CheckBox(this);
        chcheckBox2.setText("Checkbox2");
        seventhcheckBox.addView(chcheckBox2);

        //for first Radio Button
        LinearLayout eighthRadioButton = new LinearLayout(this);
        eighthRadioButton.setOrientation(LinearLayout.VERTICAL);
        RadioButton rbradioButton1 = new RadioButton(this);
        rbradioButton1.setText("RadioButton1");
        eighthRadioButton.addView(rbradioButton1);

        //for second Radio Button

        RadioButton rbradioButton2 = new RadioButton(this);
        rbradioButton2.setText("RadioButton2");
        eighthRadioButton.addView(rbradioButton2);


        LinearLayout datePickerLayout=new LinearLayout(this);
        EditText dateEditText=new EditText(this);
        dateEditText.setHint("Date");
        dateEditText.setWidth(1000);

        dateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        dateEditText.setText(date);

                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        datePickerLayout.addView(dateEditText);

        LinearLayout timePickerLayout=new LinearLayout(this);
        EditText timePicker=new EditText(this);
        timePicker.setHint("Time");
        timePicker.setWidth(1000);
        timePickerLayout.addView(timePicker);



        //to display all group view
        mainLayout.addView(firsttextView);
        mainLayout.addView(secondeditText);
        mainLayout.addView(firstbuttonLayout);
        mainLayout.addView(firstImageView);
        mainLayout.addView(secondbuttonLayout);
        mainLayout.addView(sixthcheckBox);
        mainLayout.addView(seventhcheckBox);
        mainLayout.addView(eighthRadioButton);
//        mainLayout.addView(secondRadioButton);
        mainLayout.addView(datePickerLayout);
        mainLayout.addView(timePickerLayout);


        //to connect with xml file
        LinearLayout xmllayout = (LinearLayout)findViewById(R.id.javaLayout);
        xmllayout.addView(mainLayout);

    }
}