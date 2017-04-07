package com.google.firebase.udacity.friendlychat;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MessageHolder extends RecyclerView.ViewHolder {
    private final TextView mNameField;
    private final TextView mTextField;
    private final ImageView mPhotoUrlField;

    public MessageHolder(View itemView) {
        super(itemView);
        mNameField = (TextView)itemView.findViewById(R.id.nameTextView);
        mPhotoUrlField = (ImageView)itemView.findViewById(R.id.photoImageView);
        mTextField = (TextView)itemView.findViewById(R.id.messageTextView);

    }

   /* public MessageHolder(View itemView) {
        super(itemView);
      //  ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        //TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
       // TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

        mPhotoUrlField = (ImageView) itemView.findViewById(R.id.photoImageView);
        mNameField = (TextView) itemView.findViewById(R.id.nameTextView);
        mTextField = (TextView) itemView.findViewById(R.id.messageTextView);
        if (mPhotoUrlField == null || mNameField == null || mTextField == null)
            Log.e(" holder", "here not ok");
        Log.e(" holder", "here ok");
    }*/

    public ImageView getmPhotoUrlField() {
        return mPhotoUrlField;
    }

    public TextView getmTextField() {
        return mTextField;
    }

    public TextView getmNameField() {
        return mNameField;
    }

    public void setPhotoUrlField(String photoUrlField){
        //mPhotoUrlField.
        Glide.with(mPhotoUrlField.getContext())
                .load(photoUrlField)
                .into(mPhotoUrlField);
    }

    public void setName(String name) {
        mNameField.setText(name);
    }

    public void setText(String text) {
        mTextField.setText(text);
    }

    
}
