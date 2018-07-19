package com.techkarkhana.motivateme.activityall;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.techkarkhana.motivateme.R;
import com.techkarkhana.motivateme.model.PagerModel;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

public class QuestionPageOneActivity extends AppCompatActivity {

    Button startQuesBtn, goingNextbtn;
    ImageButton btn_one,btn_two;

    //image button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page_one);

        init();

        startQuesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //showQuestionDialog();
                showDialog();
                goingNextbtn.setVisibility(View.VISIBLE);

            }
        });
        goingNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(QuestionPageOneActivity.this,HomePageActivity.class);
                startActivity(nextIntent);
                finish();
            }
        });
    }

    private void showQuestionDialog() {
        final Dialog dialog=new Dialog(QuestionPageOneActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_dialog_question_layout);

        final Button img_onebtn,img_twobtn;
        img_onebtn=dialog.findViewById(R.id.image_button_one);
        img_twobtn=dialog.findViewById(R.id.image_button_two);

        img_onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuestionPageOneActivity.this, "Image One Selected !!", Toast.LENGTH_SHORT).show();
                img_onebtn.setBackgroundResource(R.drawable.images);
                img_twobtn.setBackgroundResource(R.drawable.images2);
              //  changeImage(img_onebtn,dialog);

            }
        });

        img_twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuestionPageOneActivity.this, "Image Two Selected !!", Toast.LENGTH_SHORT).show();
                img_onebtn.setBackgroundResource(R.drawable.profile1);
                img_twobtn.setBackgroundResource(R.drawable.ic_launcher_background);

            }
        });


        dialog.show();

    }

    public void showDialog()
    {
        Dialog dialog=new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(R.layout.pager_layout); //page_layout fragment

        List<PagerModel> pagerArr=new ArrayList<>();


        pagerArr.add(new PagerModel("1","What do u want to put yourself"));
        pagerArr.add(new PagerModel("2","What song u are like most"));
        pagerArr.add(new PagerModel("3","Do you like Tree "));

        TestPagerAdapter adapter=new TestPagerAdapter(this,pagerArr);


        AutoScrollViewPager pager=dialog.findViewById(R.id.pager);
        pager.setAdapter(adapter);
        CirclePageIndicator pageIndicator=dialog.findViewById(R.id.page_idicator);
        pageIndicator.setViewPager(pager);
        pageIndicator.setCurrentItem(0);
        dialog.show();

    }

    private void init() {

        startQuesBtn=findViewById(R.id.questionStart_buttonID);
        goingNextbtn=findViewById(R.id.going_next_btn_id);
        goingNextbtn.setVisibility(View.INVISIBLE);

    }
}
