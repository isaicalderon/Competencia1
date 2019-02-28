package com.example.lbeltran.dia1;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lbeltran.dia1.pojo.Contacto;

import java.util.ArrayList;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ContactosViewHolder> {

    private ArrayList <Contacto> contactos;

    public ContactoAdapter(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public ContactosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.contacto,
                viewGroup,
                false);
        ContactosViewHolder contactosViewHolder = new ContactosViewHolder(v);
        return contactosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ContactosViewHolder contactosViewHolder, int i) {
        // final Bebida bebida = bebidas.get(i);
        final Contacto contacto = contactos.get(i);
        System.out.println("Imprimiendo datos desde el adapter: ");
        System.out.println("ref: "+i);
        System.out.println("ID: "+contacto.getId());
        System.out.println("Name: "+contacto.getNombreCompleto());
        System.out.println("Likes: "+contacto.getLikes());
        System.out.println("Comments: "+contacto.getComments());

        // contactosViewHolder.foto.setImageResource(bebida.getFoto());
        //contactosViewHolder.nombre.setText(bebida.getNombre());
        //contactosViewHolder.precio.setText(String.valueOf(bebida.getPrecio()));
        //contactosViewHolder.cantidad.setText(String.valueOf(bebida.getCantidad()));

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class ContactosViewHolder extends RecyclerView.ViewHolder{
        private ImageView contact_pic;
        private TextView  contact_ID;
        private TextView  contact_name;
        private TextView  contact_likes;
        private TextView  contact_comments;

        public ContactosViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_pic = itemView.findViewById(R.id.contact_pic);
            contact_ID = itemView.findViewById(R.id.contact_id);
            contact_name = itemView.findViewById(R.id.contact_name);
            contact_likes = itemView.findViewById(R.id.contact_likes);
            contact_comments = itemView.findViewById(R.id.contact_comments);

        }
    }
}
