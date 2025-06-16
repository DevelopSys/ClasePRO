class Jugador {
  nombre;
  valor;
  posicion;
  nacionalidad;

  constructor(nombre, valor, posicion, nacionalidad) {
    this.nombre = nombre;
    this.valor = valor;
    this.posicion = posicion;
    this.nacionalidad = nacionalidad;
  }

  mostrarDatos() {
    console.log(this.nombre);
    console.log(this.valor);
    console.log(this.posicion);
    console.log(this.nacionalidad);
  }

  get getNombre() {
    return this.nombre;
  }

  set setNombre(nombre) {
    this.nombre = nombre;
  }

  set setNacionalidad(nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
}
class Equipo {
  nombre;
  presupuesto;
  plantilla;
  estadoDeForma;

  constructor(nombre, presupuesto, estadoDeForma) {
    this.nombre = nombre;
    this.presupuesto = presupuesto;
    this.plantilla = [];
    this.estadoDeForma = estadoDeForma;
  }

  mostrarJugadores() {
    console.log("Los jugadores de la plantilla son:");
    this.plantilla.forEach((element) => {
      element.mostrarDatos();
    });
  }

  ficharJugador(jugador) {
    if (jugador.valor < this.presupuesto) {
      this.presupuesto -= jugador.valor;
      this.plantilla.push(jugador);
    } else {
      console.log("No tienes pasta suficiente");
    }

    // jugador.valor < this.presupuesto ? asdasdasdasd : asdasdasd
  }
}
