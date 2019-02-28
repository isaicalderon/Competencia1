package com.example.lbeltran.dia1;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lbeltran.dia1.pojo.Contacto;
import com.example.lbeltran.dia1.restAPI.EndpointsApi;
import com.example.lbeltran.dia1.restAPI.adapter.RestApiAdapter;
import com.example.lbeltran.dia1.restAPI.model.ContactoResponse;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends ListActivity {

    private ArrayList<Contacto> contactos;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        consultar();

    }


    //https://github.com/belmarq/Dia1.git


    public void consultar(){

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();
        EndpointsApi endpointsApi = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);
        Call<ContactoResponse> contactoResponseCall = endpointsApi.getRecentMedia();
        contactoResponseCall.enqueue(new Callback<ContactoResponse>() {
            @Override
            public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                ContactoResponse contactoResponse = response.body();
                contactos = contactoResponse.getContactos();
                mostrarContactosRV(contactos);
            }

            @Override
            public void onFailure(Call<ContactoResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "¡Al pasó en la conexión! Intenta de nuevo", Toast.LENGTH_LONG).show();
                Log.e("FALLO LA CONEXION", t.toString());
            }
        });
    }

    public void mostrarContactosRV(ArrayList<Contacto> contactos){

        this.setListAdapter(new ContactListAdapter(this, contactos));

//        int n= contactos.size();
//        TextView textView= (TextView) findViewById(R.id.tvTexto);
//        //textView.setText(String.valueOf(n));
//        String str="";
//        for (Contacto contacto: contactos) {
//            str+= contacto.getUrlFoto().toString()+"\n";
//        }
//        textView.setText(str);
    }
}
