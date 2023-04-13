package com.example.diagnosticssample;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    ImageButton itemImage;
    TextView programTitle;
    TextView programDescription;
    ProgramViewHolder(View v){
        itemImage=v.findViewById(R.id.imageButton);
        programTitle=v.findViewById(R.id.textView1);
        programDescription=v.findViewById(R.id.textView2);
    }
}
