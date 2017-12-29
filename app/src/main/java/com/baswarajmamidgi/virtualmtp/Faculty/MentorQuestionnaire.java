package com.baswarajmamidgi.virtualmtp.Faculty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baswarajmamidgi.virtualmtp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MentorQuestionnaire extends Fragment {
    public static MentorQuestionnaire newInstance() {
        MentorQuestionnaire fragment = new MentorQuestionnaire();
        return fragment;
    }


    public MentorQuestionnaire() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_mentorquestionnaire, container, false);



        return view;
    }

}
