package com.example.listview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    ImageView image;
    TextView items;
    TextView itemN;
    ProgramViewHolder(View v){
        image =v.findViewById(R.id.imItem);
        items =v.findViewById(R.id.tvItem);
        itemN =v.findViewById(R.id.tvName);

    }

}