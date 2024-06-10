// getJSONObect("accesorios").geString("nombre")

// coche1.revalorizar(6000);
// coche1.mostarDatos();
/* garaje.forEach((item) => {
  console.log(item.revalorizar(10000));
}); */

let usuario1 = new Usuario("Borja1", "Martin1", "1234A", 40);
let usuario2 = new Usuario("Borja2", "Martin2", "1235A", 30);

usuario1.setNombre("Borja cambiado");
usuario1.mostrarDatos();

usuario1.setApellido = "Apellido nuevo";
console.log(usuario1.getApellido);
