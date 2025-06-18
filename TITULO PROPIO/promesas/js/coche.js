// hacer una clase coche con las siguientes propiedades:
// marca, modelo, color, año, precio
// constructor que reciba todas las propiedades
// getters y setters para todas las propiedades
// mostrar datos

// en el fichero promesas
// crear un array de coches, con al menos 5 coches con datos aleatorios
class Coche {
  constructor(marca, modelo, color, año, precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.año = año;
    this.precio = precio;
  }
  get marca() {
    return this._marca;
  }
  set marca(value) {
    this._marca = value;
  }
  get modelo() {
    return this._modelo;
  }
  set modelo(value) {
    this._modelo = value;
  }

  mostarDatos() {
    console.log(
      `Marca: ${this.marca}, Modelo: ${this.modelo}, Color: ${this.color}, Año: ${this.año}, Precio: ${this.precio}`
    );
  }
}
