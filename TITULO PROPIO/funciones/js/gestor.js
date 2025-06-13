/* 

CREAR UN PROGRAMA QUE PERMITA:
- CREAR 3 EQUIPOS, LOS CUALES TIENEN UN NOMBRE, UN PRESUPUESTO Y UNA LISTA DE JUGADORES
- CREAR UNA LISTA DE 10 JUGADORES: CADA JUGADOR TIENE NOMBRE, VALOR, POSICION
- FICHA 5 JUGADORES POR CADA EQUIPO (SI EL EQUIPO NO TIENE SUFICIENTE PRESUPUESTO, NO PODRA)
- MOSTRAR TODOS LOS JUGADORES DE CADA EQUIPO
- MOSTRAR DE TODOS LOS JUGADORES INICIALES, AQUELLOS QUE TENGAN UN VALOR SUPERIOR A 100000000

CLASES: JUGADOR, EQUIPO, GESTORLIGA

*/
/* 
let jugador1 = new Jugador("Messi", 10000000, "Delantero");
jugador1.setNacionalidad = "Argentina";
jugador1.mostrarDatos();
 */
const jugadores = [
  new Jugador("Lionel Messi", 50000000, "Delantero", "Argentina"),
  new Jugador("Kylian Mbappé", 180000000, "Delantero", "Francia"),
  new Jugador("Erling Haaland", 170000000, "Delantero", "Noruega"),
  new Jugador("Kevin De Bruyne", 80000000, "Centrocampista", "Bélgica"),
  new Jugador("Jude Bellingham", 120000000, "Centrocampista", "Inglaterra"),
  new Jugador("Vinícius Jr.", 150000000, "Delantero", "Brasil"),
  new Jugador("Pedri", 90000000, "Centrocampista", "España"),
  new Jugador("Alphonso Davies", 70000000, "Defensa", "Canadá"),
  new Jugador("Harry Kane", 95000000, "Delantero", "Inglaterra"),
  new Jugador("Luka Modrić", 10000000, "Centrocampista", "Croacia"),
  new Jugador("Mohamed Salah", 65000000, "Delantero", "Egipto"),
  new Jugador("Thibaut Courtois", 60000000, "Portero", "Bélgica"),
  new Jugador("Rúben Dias", 75000000, "Defensa", "Portugal"),
  new Jugador("Joshua Kimmich", 85000000, "Centrocampista", "Alemania"),
  new Jugador("Rodri", 100000000, "Centrocampista", "España"),
  new Jugador("Neymar Jr.", 50000000, "Delantero", "Brasil"),
  new Jugador("Bruno Fernandes", 70000000, "Centrocampista", "Portugal"),
  new Jugador("Christian Pulisic", 30000000, "Centrocampista", "EE. UU."),
  new Jugador("João Félix", 50000000, "Delantero", "Portugal"),
  new Jugador("Frenkie de Jong", 75000000, "Centrocampista", "Países Bajos"),
  new Jugador("Raheem Sterling", 40000000, "Delantero", "Inglaterra"),
  new Jugador("Achraf Hakimi", 65000000, "Defensa", "Marruecos"),
  new Jugador("Marcus Rashford", 85000000, "Delantero", "Inglaterra"),
  new Jugador("Manuel Neuer", 12000000, "Portero", "Alemania"),
  new Jugador("Antoine Griezmann", 25000000, "Delantero", "Francia"),
  new Jugador("Phil Foden", 110000000, "Centrocampista", "Inglaterra"),
  new Jugador("Declan Rice", 100000000, "Centrocampista", "Inglaterra"),
  new Jugador("Marc-André ter Stegen", 50000000, "Portero", "Alemania"),
  new Jugador("Marquinhos", 60000000, "Defensa", "Brasil"),
  new Jugador("Trent Alexander-Arnold", 90000000, "Defensa", "Inglaterra"),
];

let equipo = new Equipo("Barcelona", 180000000);
equipo.ficharJugador(jugadores[0]);
equipo.ficharJugador(jugadores[3]);
equipo.ficharJugador(jugadores[1]);

// equipo.mostrarJugadores();
// console.log(equipo.presupuesto);

// Los jugadores que valen mas de 100000000
jugadores
  .filter((item) => item.valor < 100000000)
  .forEach((item) => item.mostrarDatos());
