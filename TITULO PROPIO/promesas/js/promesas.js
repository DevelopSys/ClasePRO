// vamos a calcular un numero aleatorio entre 0 y 10
// si el numero es mayor de 5, se resuelve la promesa OK
// si el numero es menor o igual a 5, se resuelve la promesa NO OK

/* let promesa = new Promise((res, rej) => {
  setTimeout(() => {
    let aleatorio = Math.floor(Math.random() * 10);
    console.log(`Numero aleatorio: ${aleatorio}`);
    if (aleatorio >= 5) {
      res(`Funcion ok: ${aleatorio}`);
    } else {
      rej(`Funcion no ok: numero pequeño`);
    }
  }, 3000);
});

promesa
  .then((res) => {
    console.log(res);
  })
  .catch((err) => {
    console.log(err);
  }); */

let coches = [
  new Coche("Toyota", "Corolla", "Rojo", 2020, 15000),
  new Coche("Ford", "Focus", "Azul", 2019, 14000),
  new Coche("Volkswagen", "Golf", "Negro", 2021, 18000),
  new Coche("Honda", "Civic", "Blanco", 2022, 20000),
  new Coche("Chevrolet", "Cruze", "Gris", 2018, 13000),
];

let inputPrecio = document.querySelector("#inputPrecio");
let boton = document.querySelector("#botonBuscar");
let divAlerta = document.querySelector("#divAlerta");
let lista = document.querySelector("#listaResultados");

boton.addEventListener("click", () => {
  let precio = Number(inputPrecio.value);
  let promesa = new Promise((res, rej) => {
    let listaResultados = coches.filter((item) => item.precio <= precio);
    if (listaResultados.length > 0) {
      res("Hay coches disponibles");
    } else {
      rej("No hay coches disponibles");
    }
  });

  promesa
    .then((res) => {})
    .catch((err) => {
      Swal.fire({
        icon: "warning",
        title: "",
        text: err,
        timer: 2500,
      });
    });
});

// let precio = Number(prompt("Que precio te quieres gastar en un coche?"));

// si hay coches con ese precio, se resuelve la promesa OK
// y ademas se pinta en una lista los coches que cumplen el precio
// y ademas se muestra el nº de resultados encontrados -> alert (bootstrap)
// si no hay coches con ese precio, se resuelve la promesa NO OK
// y sale un dialogo de sweetalert que diga que no hay coches con ese precio
