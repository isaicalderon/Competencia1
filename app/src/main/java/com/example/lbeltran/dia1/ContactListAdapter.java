package com.example.lbeltran.dia1;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lbeltran.dia1.pojo.Contacto;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ContactListAdapter extends BaseAdapter {
    private ArrayList<Contacto> contactos;
    private Activity activity;

    public ContactListAdapter() {

    }

    public ContactListAdapter (Activity activity, ArrayList<Contacto> contactos) {
        super();
        this.activity = activity;
        this.contactos = contactos;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contacto contacto = contactos.get(position);
        View view = convertView;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        view = layoutInflater.inflate(R.layout.contacto, null, true);
        ImageView c_pic = (ImageView) view.findViewById(R.id.contact_pic);
        TextView c_id =(TextView)view.findViewById(R.id.contact_id);
        TextView c_name =(TextView)view.findViewById(R.id.contact_name);
        TextView c_likes =(TextView)view.findViewById(R.id.contact_likes);
        TextView c_comments =(TextView)view.findViewById(R.id.contact_comments);

        c_id.setText("ID: "+contacto.getId());
        c_name.setText("Nombre: "+contacto.getNombreCompleto());
        c_likes.setText("Likes: "+String.valueOf(contacto.getLikes()));
        c_comments.setText("Comments: "+String.valueOf(contacto.getComments()));
        
        Picasso.with(activity).load(contacto.getUrlFoto()).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(c_pic, new com.squareup.picasso.Callback(){
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });
        // textView.setText(lista.elementAt(position));
        // ImageView imageView=(ImageView)view.findViewById(R.id.icono);

        return view;

    }


}
