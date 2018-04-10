package com.android.khosbayar.cvbyhs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutMeFragment extends Fragment {
    private TextView mPersonalInfo, mEducationalBackground, mStrength, mWeakness;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_me, container, false);
        mPersonalInfo = view.findViewById(R.id.tvPersonalInfo);

        mPersonalInfo.setText("Knowledgeable software developer with over 5 years of experience playing key role in development of high-performance Android mobile apps. Hands-on expertise in ERP and database administration; augmented reality; and material design. Certified Ethical Hacker and security specialist with experience developing and testing customer-facing Android apps for highly regulated finance industry. Advanced technical knowledge spanning HTML, CSS, JavaScript, jQuery, AJAX, and PHP.");

        mEducationalBackground = view.findViewById(R.id.tvEducationalBackground);

        mEducationalBackground.setText("Master of Science in Computer Science\n" +
                "(In progress via distance education; expected completion 2020)\n" +
                "Maharishi University of Management, Fairfield, Iowa\n" +
                "\n" +
                "Bachelor of Science in Information Technology\n" +
                "Mongolian University of Science & Technology, Ulaanbaatar, Mongolia\n" +
                "\n" +
                "Key Courses: Fundamentals of Algorithms, Visual Programming, Data Structures, Digital Logic, Object-Oriented Technology, UNIX & Linux Operating Systems, Microprocessors & Programming, Java Programming");

        mStrength = view.findViewById(R.id.tvStrength);

        mStrength.setText("Hard working \n Honest \n Good at suffering");

        mWeakness = view.findViewById(R.id.tvWeakness);

        mWeakness.setText("Not skilled at delegating tasks \n Perfectionism");
        return view;
    }
}
