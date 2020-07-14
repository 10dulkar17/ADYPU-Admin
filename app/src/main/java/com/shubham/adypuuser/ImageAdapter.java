package com.shubham.adypuuser;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder>  {

    private Context mNewContext;
    private List<Upload> mNewuploads;

    public ImageAdapter(Context context, List<Upload> uploads) {
        mNewContext = context;
        mNewuploads = uploads;
    }


    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mNewContext).inflate(R.layout.image_items, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position) {
        final Upload uploadCurrent = mNewuploads.get(position);
        holder.textViewName.setText(uploadCurrent.getName());
        Picasso.get()
                .load(uploadCurrent.getImageUrl())
               // .placeholder(R.mipmap.ic_launcher)
                .fit()
                .centerCrop()
                .into(holder.imageView);

       holder.cardLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(mNewContext ,uploadCurrent.getName() , Toast.LENGTH_SHORT).show();

              Intent intent = new Intent(mNewContext, Content.class);
              intent.putExtra("image_url", uploadCurrent.getImageUrl());
               intent.putExtra("location_name", uploadCurrent.getName());
               mNewContext.startActivity(intent);
           }
       });


    }

    @Override
    public int getItemCount() {
        return mNewuploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public ImageView imageView;

        public CardView cardLayout;



        public ImageViewHolder(View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.text_view_name);
            imageView = itemView.findViewById(R.id.image_view_upload);
            cardLayout = itemView.findViewById(R.id.card_layout);

        }
    }
}
