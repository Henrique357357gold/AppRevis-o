package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEnd:EditText = findViewById(R.id.edtEndereco)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener { Toast.makeText(this,"Nome"+edtNome.text.toString(),Toast.LENGTH_LONG).show() }


    }
}