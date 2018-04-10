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
import android.widget.LinearLayout;

public class ContactFragment extends Fragment {

    private LinearLayout mAddress, mPhone, mEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        mAddress = view.findViewById(R.id.llAddress);
        mPhone = view.findViewById(R.id.llPhoneNumber);
        mEmail = view.findViewById(R.id.llEmail);

        mAddress.setOnClickListener(listener);
        mPhone.setOnClickListener(listener);
        mEmail.setOnClickListener(listener);

        return view;
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.llAddress:
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:41.027829, -91.961229"));
                    break;
                case R.id.llPhoneNumber:
                    intent.setAction(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + getResources().getString(R.string.my_phone_number)));
                    break;
                case R.id.llEmail:
                    intent.setAction(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:"+getResources().getString(R.string.my_email_address)));
//                    intent.setType("text/plain");
//                    intent.putExtra("Intent.EXTRA_EMAIL", getResources().getString(R.string.my_address));
                    break;
            }
            startActivity(intent);
        }
    };
}
