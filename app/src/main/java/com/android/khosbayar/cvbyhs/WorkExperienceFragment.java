package com.android.khosbayar.cvbyhs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WorkExperienceFragment extends Fragment {
    private Button mWorkingBackgrounds;
    private Button mAcademicProjects;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_work_experience, container, false);
        mWorkingBackgrounds = view.findViewById(R.id.bWorkingBackgrounds);
        mWorkingBackgrounds.setOnClickListener(listener);

        mAcademicProjects = view.findViewById(R.id.bAcademicProjects);
        mAcademicProjects.setOnClickListener(listener);
        return view;
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.bWorkingBackgrounds:
                    Intent i = new Intent(getContext(),WorkingBackgroundsActivity.class);
                    startActivity(i);
                    break;
                case R.id.bAcademicProjects:
                    break;
            }
        }
    };
}
