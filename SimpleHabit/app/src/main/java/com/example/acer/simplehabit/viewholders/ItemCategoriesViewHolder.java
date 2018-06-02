package com.example.acer.simplehabit.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.acer.simplehabit.R;
import com.example.acer.simplehabit.data.vo.CategoriesProgramsVO;
import com.example.acer.simplehabit.data.vo.ProgramVO;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Acer on 5/18/2018.
 */

public class ItemCategoriesViewHolder extends BaseViewHolder<ProgramVO>{
    @BindView(R.id.tv_category_name)
    TextView tvCategory;

    @BindView(R.id.tv_category_time)
    TextView tvCategoryTime;

    public ItemCategoriesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void setData(ProgramVO data) {
         tvCategory.setText(data.getTitle());
         String avgLength="";
         for (int length:data.getAverageLengths()){
             avgLength += length+",";
         }
         tvCategoryTime.setText(avgLength);

    }






    @Override
    public void onClick(View view) {

    }
}
