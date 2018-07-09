package com.example.ashish.foodies;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class programmingadapter extends RecyclerView.Adapter<programmingadapter.ProgrammingViewHolder> {

    public String[] data;
    Context context;

    public programmingadapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyclerlayout, parent, false);

        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, final int position) {
        String title = data[position];
        holder.title.setText(title);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DemoActivity.class);

                switch (position) {
                    case 0:
                        intent.putExtra("data", "food1");
                        break;
                    case 1:
                        intent.putExtra("data", "food2");
                        break;
                    case 2:
                        intent.putExtra("data", "food3");
                        break;
                    case 3:
                        intent.putExtra("data", "food4");
                        break;
                    case 4:
                        intent.putExtra("data", "food5");
                        break;
                    case 5:
                        intent.putExtra("data", "food6");
                        break;
                    case 6:
                        intent.putExtra("data", "food7");
                        break;

                }

                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        CardView card;
        View parent;

        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.texttitle);
            card = itemView.findViewById(R.id.cardview);
            parent = this.itemView;
        }
    }
}
