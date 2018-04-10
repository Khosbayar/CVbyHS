package com.android.khosbayar.cvbyhs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.khosbayar.cvbyhs.R;
import com.android.khosbayar.cvbyhs.model.WorkExperience;

import java.util.ArrayList;

/**
 * Created by khosbayar on 4/9/18.
 */

public class WorkingBackgroundsAdapter extends BaseAdapter {

    private ArrayList<WorkExperience> experiences;
    private Context context;
    private static LayoutInflater inflater = null;


    public WorkingBackgroundsAdapter(Context context, ArrayList<WorkExperience> experiences) {
        this.experiences = experiences;
        this.context = context;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder {
        ImageView mCompanyImg;
        TextView mCompanyName;
        TextView mFromTo;
        TextView mTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        View rowView;
        rowView = inflater.inflate(R.layout.workexp_row, null);

        holder.mCompanyImg = (ImageView) rowView.findViewById(R.id.ivCompanyImg);
        holder.mCompanyName = rowView.findViewById(R.id.tvCompanyName);
        holder.mFromTo = rowView.findViewById(R.id.tvFromTo);
        holder.mTitle = rowView.findViewById(R.id.tvTitle);

        holder.mCompanyImg.setImageResource(experiences.get(position).getCompanyImg());
        holder.mCompanyName.setText(experiences.get(position).getCompanyName());
        holder.mFromTo.setText(experiences.get(position).getFromTo());
        holder.mTitle.setText(experiences.get(position).getTitle());

        return rowView;
    }
}
