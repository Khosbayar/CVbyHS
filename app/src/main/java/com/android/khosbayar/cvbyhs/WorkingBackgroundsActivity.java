package com.android.khosbayar.cvbyhs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.khosbayar.cvbyhs.adapter.WorkingBackgroundsAdapter;
import com.android.khosbayar.cvbyhs.model.WorkExperience;

import java.util.ArrayList;

public class WorkingBackgroundsActivity extends AppCompatActivity {

    private ListView mWorkingBackgrounds;
    private ArrayList<WorkExperience> experiences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Working backgrounds");
        setContentView(R.layout.activity_working_backgrounds);
        mWorkingBackgrounds = findViewById(R.id.lvWorkingBackgrounds);
        experiences = new ArrayList<>();
        populateExperiences();
        mWorkingBackgrounds.setAdapter(new WorkingBackgroundsAdapter(this, experiences));
    }

    private void populateExperiences() {
        experiences.add(new WorkExperience("Chinggis Systems",2013,2014,"Ulaanbaatar, Mongolia","Software Developer",R.drawable.chinggissystemslogo));
        experiences.add(new WorkExperience("Trade & Development Bank",2014,2015,"Ulaanbaatar, Mongolia","System administrator",R.drawable.tdblogo));
        experiences.add(new WorkExperience("Trade & Development Bank",2015,2017,"Ulaanbaatar, Mongolia","Software Developer",R.drawable.tdblogo));
    }
}
