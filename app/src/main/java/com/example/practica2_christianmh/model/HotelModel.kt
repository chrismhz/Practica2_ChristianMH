package com.example.practica2_christianmh.model

class HotelModel {

    var cantidadDias = 0.0
    var cantidadPrecio = 0.0

    fun calcularVenta(): String {
        val subTotal: Double
        val descuento: Double
        val total: Double
        val respuesta:String

        subTotal = cantidadDias * cantidadPrecio

        if (cantidadDias > 5 && cantidadDias <= 10){
            descuento = subTotal * 0.10
            respuesta = "Descuento de 10%"
        }else if(cantidadDias > 10 && cantidadDias <= 15){
            descuento = subTotal * 0.15
            respuesta = "Descuento de 15%"
        }else if (cantidadDias > 15){
            descuento = subTotal * 0.20
            respuesta = "Descuento de 20%"
        }else{
            descuento = 0.0
            respuesta = "Sin descuento aplicado"
        }

        total = subTotal - descuento

        return """
           Subtotal a pagar: $$subTotal
           $respuesta
           Total a pagar: $$total
           """
    }
}