package com.shubham.adypuuser;//package com.shubham.adypunoticeboarduser;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
////import android.widget.FolderView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//import androidx.cardview.widget.CardView;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class FolderAdapter extends RecyclerView.Adapter<FolderAdapter.FolderViewHolder>  {
//
//    private Context mContext;
//    private List<Upload> mUploads;
//
//    public FolderAdapter(Context context, List<Upload> uploads) {
//        mContext = context;
//        mUploads = uploads;
//    }
//
//
//
//    @Override
//    public FolderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(mContext).inflate(R.layout.folder_item, parent, false);
//        return new FolderViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(FolderViewHolder holder, final int position) {
//        final Upload uploadCurrent = mUploads.get(position);
//        holder.textViewName.setText(uploadCurrent.getName());
////        Picasso.get()
////                .load(uploadCurrent.getFolderUrl())
////                // .placeholder(R.mipmap.ic_launcher)
////                .fit()
////                .centerCrop()
////                .into(holder.FolderView);
//
//        holder.cardLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(mContext ,uploadCurrent.getName() , Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(mContext, Content.class);
//                //intent.putExtra("Folder_url", uploadCurrent.getFolderUrl());
//                intent.putExtra("location_name", uploadCurrent.getName());
//                mContext.startActivity(intent);
//            }
//        });
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return mUploads.size();
//    }
//
//    public class FolderViewHolder extends RecyclerView.ViewHolder {
//        public TextView textViewName;
//       // public FolderView FolderView;
//
//        public CardView cardLayout;
//
//
//
//        public FolderViewHolder(View itemView) {
//            super(itemView);
//
//            textViewName = itemView.findViewById(R.id.text_view_name);
//          //  FolderView = itemView.findViewById(R.id.Folder_view_upload);
//
//            cardLayout = itemView.findViewById(R.id.card_layout);
//
//        }
//    }
//
//
//
//
//}
