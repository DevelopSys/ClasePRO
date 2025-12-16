package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private String titulo, autor;
    private int codigo;

    public void mostrarDatos(){
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("codigo = " + codigo);
    }
}
