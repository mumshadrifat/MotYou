package com.techkarkhana.motivateme.activityall;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
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
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=inflater.inflate(R.layout.page_list_item, container, false);  //page_list is also fragment

         TextView tv=view.findViewById(R.id.textView_id);
         imageButton_one=view.findViewById(R.id.image_button_one);
         imageButton_two=view.findViewById(R.id.image_button_two);


        view.setTag(position);
        ((ViewPager) container).addView(view);

        PagerModel model=pagerModelList.get(position);
        tv.setText(model.getTitle());

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
