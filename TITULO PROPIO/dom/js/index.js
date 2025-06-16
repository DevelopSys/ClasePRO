// tengo que tener una referencia del elemento que quiero gestionar
// querySelector -> HTMLElement
let botonAgregar = document.querySelector("#botonAgregar");
let inputNombreEquipo = document.querySelector("#inputNombreEquipo");
let inputPresupuestoEquipo = document.querySelector("#inputPresupuestoEquipo");
let selectEstadoEquipo = document.querySelector("#selectEstadoEquipo");
let listaEquipos = document.querySelector("#listaEquipos");
let equipo = [];

botonAgregar.addEventListener("click", (event) => {
  console.log("Pulsacion detectada");
  let nombre = inputNombreEquipo.value;
  let presupuesto = Number(inputPresupuestoEquipo.value);
  let estado = Number(selectEstadoEquipo.value);

  // si no hay nombre o presupuesto <=0 = no hay estado de forma
  // saltar aviso
  if (nombre.length > 0 && presupuesto > 0 && estado != 0) {
    // listaEquipos.innerHTML += `<li class="list-group-item animate__animated animate__fadeInRight"> ${nombre} </li>`;
    /* Swal.fire({
      position: "center",
      icon: "success",
      title: "Equipo agregado correctamente",
      timer: 3000,
      showConfirmButton: false,
    }); */
    // creo el nodo que quiero añadir
    let nodoLI = document.createElement("li");
    nodoLI.className =
      "list-group-item animate__animated animate__fadeInRight d-flex justify-content-between";
    nodoLI.innerText = nombre;
    let boton = document.createElement("button");
    boton.className = "btn btn-danger";
    boton.innerText = "Eliminar";
    boton.addEventListener("click", () => {
      boton.parentElement.classList.remove(
        "animate__fadeIn",
        "animate__animated"
      );
      boton.parentElement.classList.add("animate__animated", "animate__jello");

      setTimeout(() => {
        // aplicar la anumacion de salida
        boton.parentElement.classList.remove(
          "animate__jello",
          "animate__animated"
        );
        boton.parentElement.classList.add(
          "animate__animated",
          "animate__fadeOutRight"
        );

        // borrar el elemento LI
        setTimeout(() => {
          boton.parentElement.remove();
        }, 500);
      }, 500);
    });
    nodoLI.append(boton);
    listaEquipos.append(nodoLI);
    limpiarFormulario();
  } else {
    Swal.fire({
      position: "center",
      icon: "error",
      title: "Los datos del formulario están incompletos",
      timer: 3000,
      showConfirmButton: false,
    });
  }
});

// funcion agregarEquipo(){}
// funcion limpiarFormulario(){}

function limpiarFormulario() {
  inputNombreEquipo.value = "";
  inputPresupuestoEquipo.value = "";
  estado.value = "0";
}
