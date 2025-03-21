import controller.Heladeria;
import model.Batido;
import model.Helado;
import utils.CantidadException;
import utils.Sabores;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Heladeria<Batido,Helado> heladeria = new Heladeria();
        heladeria.comprarMaquina(67);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce cuantos helados quieres");
        int cantidad=0;
        try{
            cantidad = scanner.nextInt();
            // me han puesto un <0
            if (cantidad<=0){
                // controlo la situacion
                throw new CantidadException("Error en las cantidades");
            }

            System.out.println("1-Vainilla");
            System.out.println("2-Chocolate");
            System.out.println("3-Mango");
            System.out.println("4-Fresa");
            System.out.println("Indica que sabor quieres");
            int saborOpcion = scanner.nextInt();
            Sabores sabor = Sabores.Chocolate;
            switch (saborOpcion){
                case 1:
                    sabor = Sabores.Vainilla;
                    break;
                case 2:
                    sabor = Sabores.Chocolate;
                    break;
                case 3:
                    sabor = Sabores.Mango;
                    break;
                case 4:
                    sabor = Sabores.Fresa;
                    break;
                default:
                    throw new Exception("Error en la seleccion");
            }

            Helado helado = new Helado(5, sabor);
            System.out.println("PEdido correcto, el helado te sale a "+helado.getPrecio());

        } catch (InputMismatchException e){
            System.out.println("Datos incorrectos");
        } catch (CantidadException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Error en el pedido");
        }
        finally {
            // ejecuciones obligatorias -> cerrado de flujos
        }
        // Sabores sabor1 = Sabores.Fresa;
        System.out.println("La cantidad seleccionada es: "+cantidad);

    }
}
