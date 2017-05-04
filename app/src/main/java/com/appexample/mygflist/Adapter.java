package com.appexample.mygflist;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myviewholder>{


    private List<MyList> myGF;
    private Context context;

    public class myviewholder extends RecyclerView.ViewHolder {

        LinearLayout layout1;
        public TextView Name, Age, Nationality;
        public ImageView img;


        public myviewholder(View itemView) {
            super(itemView);

            Name = (TextView) itemView.findViewById(R.id.name);
            Age = (TextView) itemView.findViewById(R.id.age);
            Nationality = (TextView) itemView.findViewById(R.id.nationality);
            layout1 = (LinearLayout) itemView.findViewById(R.id.layout1);
            img= (ImageView) itemView.findViewById(R.id.img);
        }

    }

    public Adapter(Context context,List<MyList> myGF) {
        this.myGF = myGF;
        this.context=context;
    }
        @Override
        public myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.mytext, parent, false);

            return new myviewholder(itemView);
        }

            @Override
            public void onBindViewHolder(myviewholder holder, int position) {
                final MyList heroine = myGF.get(position);
                holder.Name.setText(heroine.getName());
                holder.Age.setText(heroine.getAge());
                holder.Nationality.setText(heroine.getNationality());
                Glide.with(context).load("").placeholder(heroine.img_id).into(holder.img);
                holder.layout1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, heroine.getName(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Main2Activity.class);
                        intent.putExtra("Name",heroine.getName());
                        intent.putExtra("Image",heroine.img_id);
                        intent.putExtra("Description",heroine.getDescription());
                        context.startActivity(intent);
                    }
                });
              /*  try{
                 holder.img.setBackgroundResource(movie.img_id);
                }catch (OutOfMemoryError e){
                    holder.img.setBackgroundResource(movie.img_id);
                }*/
            }

            @Override
            public int getItemCount() {
                return myGF.size();
            }

}
