// par clave - valor
// [{},{},{},{},{},{}]

let coche1 = {
  modelo: "Focus",
  marca: "Ford",
  cv: 150,
  valor: 30000,
  accesorios: [
    { nombre: "techo", valor: 10000 },
    { nombre: "paquete sport", valor: 1000 },
  ],
  disponibilidad: true,
  revalorizar: function (cantidad) {
    console.log("Estas revalorizando el coche");
    // incrementar en 5000 su valor
    console.log(`El valor actua es ${this.valor}`);
    this.valor += cantidad;
    console.log(`El valor nuevo del coche es ${this.valor}`);
  },
  mostarDatos: function () {
    console.log(`Marca: ${this.marca}`);
    console.log(`Modelo: ${this.modelo}`);
    console.log(`CV: ${this.cv}`);
    console.log("Accesorios: ");
    this.accesorios.forEach((item) => {
      console.log(`\t ${item.nombre}`);
      console.log(`\t ${item.valor}`);
    });
  },
};

let coche2 = {
  modelo: "Mondeo",
  marca: "Ford",
  cv: 250,
  valor: 40000,
  accesorios: [{ nombre: "paquete sport", valor: 1000 }],
  disponibilidad: false,
};

let garaje = [coche1, coche2];
