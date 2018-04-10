package com.android.khosbayar.cvbyhs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
    ImageView mLinkedIn;
    ImageView mFacebook;
    ImageView mGithub;
    ImageView mMedium;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mLinkedIn = (ImageView) view.findViewById(R.id.ivLinkedin);
        mLinkedIn.setOnClickListener(listener);

        mFacebook = (ImageView) view.findViewById(R.id.ivFacebook);
        mFacebook.setOnClickListener(listener);

        mGithub = (ImageView) view.findViewById(R.id.ivGithub);
        mGithub.setOnClickListener(listener);

        mMedium = (ImageView) view.findViewById(R.id.ivMedium);
        mMedium.setOnClickListener(listener);

        return view;
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String url = "";
            switch (v.getId()) {
                case R.id.ivFacebook:
                    url = "https://www.facebook.com/hosoo1";
                    break;
                case R.id.ivLinkedin:
                    url = "https://www.linkedin.com/in/khosbayar-buyandalai-00386393";
                    break;
                case R.id.ivGithub:
                    url = "https://github.com/Khosbayar";
                    break;
                case R.id.ivMedium:
                    url = "https://medium.com/@khosbayar";
                    break;

            }
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
    };


}


