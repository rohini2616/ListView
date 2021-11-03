package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;





public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;
    int[] itemImage;
    String[] item;
    String[] itemName;

    public ProgramAdapter( Context context,String[] item,int[]itemImage,String[]itemName) {
        super(context, R.layout.row_item,R.id.tvItem,item);

        this.context=context;
        this.item=item;
        this.itemImage=itemImage;
        this.itemName=itemName;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row_item=convertView;
        ProgramViewHolder holder=null;
        if(row_item==null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row_item=layoutInflater.inflate(R.layout.row_item,parent,false);
            holder=new ProgramViewHolder(row_item);
            row_item.setTag(holder);
        }
        else {
            holder= (ProgramViewHolder) row_item.getTag();
        }
        holder.image.setImageResource(itemImage[position]);
        holder.items.setText(item[position]);
        holder.itemN.setText(itemName[position]);
        row_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),itemName[position],Toast.LENGTH_SHORT).show();
            }
        });
        return row_item;


    }
}
