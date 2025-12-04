package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coche {
    private String marca, modelo, matricula;
    private int velocidad, cv, km, puntos;

    public Coche(){
        this.cv = (int) (Math.random()*101)+50;
        // km
        // velocidad
        // marca, modelo
    }

    public Coche(String marca, String modelo, String matricula, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        // this.km =0;
        // this.velocidad=0;
    }

    public void acelerar(int velocidad){
        //150 + 10
        this.velocidad += velocidad;
        if(this.velocidad>180){
            this.velocidad=180;
        }
        this.km += (this.velocidad*this.cv)/8;
    }

    public void frenar(int velocidad){

        this.velocidad -= velocidad;
        if(this.velocidad<0){
            this.velocidad=0;
        }

    }

    public void mostrarDatos(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("velocidad = " + velocidad);
        System.out.println("cv = " + cv);
        System.out.println("km = " + km);
    }
}
