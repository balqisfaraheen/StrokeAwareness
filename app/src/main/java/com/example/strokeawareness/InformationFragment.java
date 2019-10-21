package com.example.strokeawareness;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.strokeawareness.FAQ;
import com.example.strokeawareness.FAST;
import com.example.strokeawareness.R;
import com.example.strokeawareness.SYMPTOM;
import com.example.strokeawareness.TREATMENT;
import com.example.strokeawareness.TYPEOFSTROKE;

public class InformationFragment extends Fragment {

    TextView textViewtype, textViewtreatment, textViewsymptom, textViewfAQ, textViewfAST, textViewquiz;

    public InformationFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_information, container, false);

        TextView textViewtype = (TextView ) view.findViewById(R.id.textViewtype);
        TextView  textViewtreatment = (TextView ) view.findViewById(R.id.textViewTreatment);
        TextView  textViewsymptom = (TextView ) view.findViewById(R.id.textViewSymptom);
        TextView  textViewfAQ = (TextView ) view.findViewById(R.id.textViewFAQ);
        TextView  textViewfAST = (TextView ) view.findViewById(R.id.textViewFAST);
        TextView  textViewquiz = (TextView ) view.findViewById(R.id.quizTV);
       // TextView  Video = (TextView ) view.findViewById(R.id.VideoTV);

        textViewtype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), TYPEOFSTROKE.class);
                startActivity(i);
            }
        });

        textViewtreatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), TREATMENT.class);
                startActivity(i);
            }
        });

        textViewsymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), SYMPTOM.class);
                startActivity(i);
            }
        });

        textViewfAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), FAQ.class);
                startActivity(i);
            }
        });

        textViewfAST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), FAST.class);
                startActivity(i);
            }
        });

        textViewquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), simpleQuiz.class);
                startActivity(i);
            }
        });



        return view;


    }

}




