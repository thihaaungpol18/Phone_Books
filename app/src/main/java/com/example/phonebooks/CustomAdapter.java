package com.example.phonebooks;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * project : Phone Books
 * Created by : Thiha Eung
 * date : 1/22/2020
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<DataClass> itemLists;

    public CustomAdapter(ArrayList<DataClass> itemLists) {
        this.itemLists = itemLists;
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profileImageView;
        TextView nameTextView, positionTextView;
        CardView mainCardView;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            mainCardView = itemView.findViewById(R.id.mainCardView);
            profileImageView = itemView.findViewById(R.id.circularImageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            positionTextView = itemView.findViewById(R.id.positionTextView);
        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_layout, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder holder, final int position) {

        DataClass currentItem = itemLists.get(position);


        holder.profileImageView.setImageResource(currentItem.getmProfileImage());
        holder.nameTextView.setText(currentItem.getmName());
        holder.positionTextView.setText(currentItem.getmPosition());
        holder.mainCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final DataClass currentItem = itemLists.get(position);

                Context c = v.getContext();

                View viewLayout = LayoutInflater.from(c).inflate(R.layout.alert_dialog_layout, null, false);
                Dialog dialog = new Dialog(c);
                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                dialog.setContentView(viewLayout, params);


                CircleImageView circleImageViewAlert = viewLayout.findViewById(R.id.circularImageViewAlert);
                circleImageViewAlert.setImageResource(currentItem.getmProfileImage());

                ImageView flagImageView = viewLayout.findViewById(R.id.flagImageViewAlert);
                flagImageView.setImageResource(currentItem.getmFlagImage());

                TextView nameTextViewAlert = viewLayout.findViewById(R.id.nameTextViewAlert);
                nameTextViewAlert.setText(currentItem.getmName());

                TextView phoneTextView = viewLayout.findViewById(R.id.phoneTextViewAlert);
                phoneTextView.setText(currentItem.getmPhNumber());

                TextView messageTextView = viewLayout.findViewById(R.id.messageTextView);
                messageTextView.setText(currentItem.getmName().concat(" is a ").concat(currentItem.getmPosition()).concat(" from our team and he is from ").concat(currentItem.getmCountryName()));

                dialog.show();

                final ImageButton callBtn = viewLayout.findViewById(R.id.callBtnDialog);
                callBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse("tel:" + currentItem.getmPhNumber());
                        Intent callerIntent = new Intent(Intent.ACTION_DIAL, uri);
                        v.getContext().startActivity(callerIntent);
                    }
                });


            }
        });


    }

    @Override
    public int getItemCount() {
        return itemLists.size();
    }


}
