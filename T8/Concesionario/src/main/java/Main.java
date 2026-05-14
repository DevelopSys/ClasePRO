import dao.CocheDAO;
import model.Coche;
import model.Combustible;
import model.Estado;
import model.Marca;

public class Main {

    public static void main(String[] args) {
        CocheDAO cocheDAO = new CocheDAO();
        // String matriculia, Marca marca, String modelo, String color, Combustible combustible, int anio, int km, int precio, Estado estadp
        Coche coche = new Coche("1234ABC",
                new Marca("Ford", "Coche normal"),
                "Focus",
                "Amarillo",
                new Combustible("Diesel", "Contamina mucho"),
                1984,
                100000,
                5000,
                new Estado("USado"));
        cocheDAO.insertarCoche(coche);
    }
}
