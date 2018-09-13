package com.example.esperimenti.myfirebase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.example.esperimenti.myfirebase2.model.Pessoa;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText edtName,edtEmail;
    ListView listV_dados;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_nome);
        edtEmail= findViewById(R.id.edt_email);

        listV_dados = findViewById(R.id.listV_dados);

        iniciarfirebase();
    }

    private void iniciarfirebase() {

    }
}
