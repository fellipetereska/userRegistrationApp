package com.example.userregistrationapp;

import android.content.Intent;
import android.os.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextCPF, editTextEmail, editTextPhone;

    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da tela

        //Inicializar os campos de entrada
        editTextName = findViewById(R.id.editTextName);
        editTextCPF = findViewById(R.id.editTextCPF);
        editTextEmail = findViewById(R.id.editTextMail);
        editTextPhone = findViewById(R.id.editTextPhone);

        // Inicializa os botões
        Button buttonSave = findViewById(R.id.buttonSave);
        Button buttonReport = findViewById(R.id.buttonReport);

        // Configuração do banco de dados usando o Room
        UserDataBase db = Room.databaseBuilder(getApplicationContext(),
                userDatabase.class, "user-database").allowMainThreadQueries().build();
        userDao - db.userDao(); // Obtem uma instancia DAO para interagir com os dados


        // Configura o botao de salvar
        buttonSave.setOnClickListener(v -> {
            Log.d("MainActivity", "Botão Cadastrar Usuário clicado");

            // Coleta os dados do front
            string name = editTextName.getText().toString();
            string cpf = editTextCPF.getText().toString();
            string email = editTextEmail.getText().toString();
            string phone = editTextPhone.getText().toString();
        });
    }
}