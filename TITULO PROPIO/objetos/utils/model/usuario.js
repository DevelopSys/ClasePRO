class Usuario {
  // propiedades
  nombre;
  apellido;
  edad;
  dni;

  // constructor

  constructor(nombreP, apellidoP, dniP, edadP) {
    this.nombre = nombreP;
    this.apellido = apellidoP;
    this.edad = edadP;
    this.dni = dniP;
  }

  // metodos

  mostrarDatos() {
    console.log(`Nombre ${this.nombre}`);
    console.log(`Apellido ${this.apellido}`);
    console.log(`DNI ${this.dni}`);
    console.log(`Edad ${this.edad}`);
  }

  getNombre() {
    return this.nombre;
  }

  setNombre(nombre) {
    this.nombre = nombre;
  }

  // getter setter
  set setApellido(apellido) {
    console.log("Llamando al meotodo set");
    this.apellido = apellido;
  }

  get getApellido() {
    console.log("Llamando al meotodo get");
    return this.apellido;
  }
}
