package com.techkarkhana.motivateme.activityall;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.techkarkhana.motivateme.R;
import com.techkarkhana.motivateme.model.PagerModel;

import java.util.List;

public class TestPagerAdapter extends PagerAdapter {
    Context context;
    List<PagerModel>pagerModelList;
    LayoutInflater inflater;
    ImageButton imageButton_one;
    ImageButton imageButton_two;
    static boolean isAgain=true;
    static boolean btnOneSelected;
    static boolean btnTwoSelected;

    public TestPagerAdapter(Context context, List<PagerModel> pagerModelList) {
        this.context = context;
        this.pagerModelList = pagerModelList;  //pageModel is a Class

        inflater=((Activity)context).getLayoutInflater();
    }

    @Override
    public int getCount() {
        return pagerModelList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull  ViewGroup container,  int position) {
        final int pos=position;
        isAgain=true;
        btnOneSelected=true;
        btnTwoSelected=true;

        View view=inflater.inflate(R.layout.page_list_item, container, false);  //page_list is also fragment

         //initialize fragment elements
         final TextView tv=view.findViewById(R.id.textView_id);
         imageButton_one=view.findViewById(R.id.imageBtn_one_id);  // fragment er ImageButton(past: id related problem are occured here)
         imageButton_two=view.findViewById(R.id.imageBtn_two_id); //

        //check page avaliable or not
        // also declare a boolean for a pagte only one time show;
        imageButton_one.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(isAgain &&btnTwoSelected)
                    {

                        Toast.makeText(context, "Image One selected! Swipe Right to left", Toast.LENGTH_SHORT).show();
                        isAgain=false;
                        btnOneSelected=false; //btn One selected
                    }
                    else {
                        isAgain=false;
                        if (!btnTwoSelected) //if btn Two already selected
                        {
                            Toast.makeText(context, "Image Two selected already ! Swipe Right to left", Toast.LENGTH_SHORT).show();
                        }
                        else{ // if btn One click One more times
                            Toast.makeText(context, "Image One selected already ! Swipe Right to left", Toast.LENGTH_SHORT).show();
                        }

                    }


                }
            });


        imageButton_two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(isAgain && btnOneSelected)
                {
                    Toast.makeText(context, "Image Two selected! Swipe Right to left", Toast.LENGTH_SHORT).show();
                    isAgain=false;
                    btnTwoSelected=false;
                }
                else {
                    isAgain=false;
                    if (!btnOneSelected) //if btn one already selected
                    {
                        Toast.makeText(context, "Image One selected already ! Swipe Right to left", Toast.LENGTH_SHORT).show();
                    }
                    else{ //if btn two clicked one more times
                        Toast.makeText(context, "Image Two selected already ! Swipe Right to left", Toast.LENGTH_SHORT).show();
                    }

                }


            }

        });
        //if all page are complete to selected
        // then DOne Button are performed

        if(pos>2)
        {
            //destroyItem(container,position,null);
        }
        else {
            Log.d("POSITION ", String.valueOf(position));
            view.setTag(position);
            ((ViewPager) container).addView(view);
            PagerModel model=pagerModelList.get(position);
            tv.setText(model.getTitle());
        }
        return view;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==((View)object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager)container).removeView((View)object);
    }


//    DialogInterface.OnClickListener listener=new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialog, int which) {
//
//            imageButton_one.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(context, "Image One Clicked ", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//            imageButton_two.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(context, "Image Two Clicked ", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }
//    };

}
