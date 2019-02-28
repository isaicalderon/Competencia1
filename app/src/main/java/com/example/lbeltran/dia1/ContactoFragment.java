package com.example.lbeltran.dia1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lbeltran.dia1.pojo.Contacto;

import java.util.ArrayList;

public class ContactoFragment extends Fragment {
    ArrayList<Contacto> contactos;

    public ContactoFragment() {

    }

    @SuppressLint("ValidFragment")
    public ContactoFragment(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.contacto, container, false);


//        RecyclerView listaBebidas = v.findViewById(R.id.recycler_view);
//        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
//        llm.setOrientation(LinearLayoutManager.VERTICAL);
//        listaBebidas.setLayoutManager(llm);
//        ContactoAdapter bebidaAdapter = new ContactoAdapter(contactos);
//        listaBebidas.setAdapter(bebidaAdapter);

        return null;
    }

}
