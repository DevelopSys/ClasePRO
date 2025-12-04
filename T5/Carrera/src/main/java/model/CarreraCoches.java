package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarreraCoches {

    private int km;
    private ArrayList<Coche> participantes;

    public CarreraCoches(int km) {
        this.km = km;
        this.participantes = new ArrayList<>();
    }

    public void inscribirParticipante(Coche coche){
        if (buscarCoche(coche.getMatricula())!=null){
            System.out.println("Coche ya en la lista de participantes");
        } else {
            if (participantes.size()<20){
                participantes.add(coche);
                System.out.println("Participante agregado correctamente");
            } else {
                System.out.println("Lista completa");
            }

        }
    }

    private Coche buscarCoche(String mat){

        for (Coche coche: participantes) {
            if (coche.getMatricula().equals(mat)){
                return coche;
            }
        }
        return null;
    }

    public void iniciarCarrera(){

        if (participantes.size()<4){

        } else {
            do {
                for (:) {

                }
            }while ();
        }

    }




}
