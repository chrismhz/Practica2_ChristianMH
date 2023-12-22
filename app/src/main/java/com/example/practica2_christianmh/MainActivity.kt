package com.example.practica2_christianmh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.practica2_christianmh.model.HotelModel
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDias = findViewById<TextInputEditText>(R.id.txtDias)
        val txtPrecio = findViewById<TextInputEditText>(R.id.txtPrecio)
        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)
        val myTextView = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener(){
            val hotel = HotelModel()

            if(txtDias.text.toString().trim().isEmpty()){
                txtDias.setError("Ingrese el numero de dias")
            }else{
                hotel.cantidadDias = txtDias.text.toString().toDouble()
            }
            if(txtPrecio.text.toString().trim().isEmpty()){
                txtPrecio.setError("Ingrese el precio")
            }else{
                hotel.cantidadPrecio = txtPrecio.text.toString().toDouble()
            }
            myTextView.text = hotel.calcularVenta()
        }
    }
}