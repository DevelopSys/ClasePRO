let coches = [
  new Coche("Ford", "Focus", 350, false, 20000, [new Accesorio("Techo", 1000)]),
  new Coche("Ford", "Focus", 150, true, 20000, [new Accesorio("Techo", 1000)]),
  new Coche("Ford", "Focus", 200, true, 30000, [
    new Accesorio("Techo", 1000),
    new Accesorio("Camara", 2000),
  ]),
  new Coche("Ford", "Mondeo", 250, true, 35000, [new Accesorio("Techo", 1000)]),
  new Coche("Seat", "Ibiza", 150, true, 24000, []),
  new Coche("Seat", "Leon", 100, true, 10000, [new Accesorio("Camara", 500)]),
  new Coche("VW", "Tigual", 150, true, 30000, [
    new Accesorio("Techo", 1000),
    new Accesorio("Paquete Sport", 1000),
  ]),
];

let resultados = [];

let marcaInput = document.querySelector("#input-marca");
let modeloInput = document.querySelector("#input-modelo");
let botonBuscar = document.querySelector("#boton-buscar");
let divResultado = document.querySelector("#div-resultados");
let divNumero = document.querySelector("#div-resultados-numero");

botonBuscar.addEventListener("click", () => {
  let marca = marcaInput.value;
  let modelo = modeloInput.value;

  console.log(marca);
  console.log(modelo);

  let busqueda = new Promise((res, rej) => {
    resultados = coches.filter((item) => {
      //console.log(item);
      return item.marca == marca && item.modelo == modelo;
    });
    divResultado.innerHTML = "";
    if (resultados.length > 0) {
      res(resultados);
    } else {
      rej("No hay coincidencias");
    }
  });

  busqueda
    .then((result) => {
      result.forEach((element) => {
        divResultado.innerHTML += `<div class="col">
            <div class="card" style="width: 18rem;">
                
                <div class="card-body">
                  <h5 class="card-title">${element.marca} ${element.modelo}</h5>
                  <p class="card-text">${element.valor}</p>
                </div>
              </div>
        </div>`;
      });
    })
    .catch((error) => alert(error))
    .finally(() => {
      divNumero.innerHTML = `<div class="alert alert-success" role="alert">
  El numero de resultados es ${resultados.length}
</div>`;
    });
});
