// tengo que tener una referencia del elemento que quiero gestionar
// querySelector -> HTMLElement
let botonAgregar = document.querySelector("#botonAgregar");
let inputNombreEquipo = document.querySelector("#inputNombreEquipo");
let inputPresupuestoEquipo = document.querySelector("#inputPresupuestoEquipo");
let selectEstadoEquipo = document.querySelector("#selectEstadoEquipo");
let listaEquipos = document.querySelector("#listaEquipos");

let divEquipos = document.querySelector("#divEquipos");
let botonComenzar = document.querySelector("#botonComenzar");
let botonResetear = document.querySelector("#botonResetear");
let botonJugadores = document.querySelector("#botonJugadores");
let comienzo = false;
let equipos = [];

botonAgregar.addEventListener("click", (event) => {
  console.log("Pulsacion detectada");
  let nombre = inputNombreEquipo.value;
  let presupuesto = Number(inputPresupuestoEquipo.value);
  let estado = Number(selectEstadoEquipo.value);

  if (nombre.length > 0 && presupuesto > 0 && estado != 0) {
    let encontrado = equipos.find(
      (item) => item.nombre.toLowerCase() == nombre.toLowerCase()
    );
    if (encontrado == undefined) {
      agregarEquipo(new Equipo(nombre, presupuesto, estado));
      lanzaarMensaje("Equipo agregado correctamente", "success");
    } else {
      lanzaarMensaje("El equipo ya existe", "error");
    }
  } else {
    lanzaarMensaje("Por favor, completa todos los campos", "error");
  }
});

botonComenzar.addEventListener("click", () => {
  if (comienzo == false) {
    equipos.forEach((equipo) => {
      crearCartaEquipo(equipo);
    });
    comienzo = true;
  } else {
    lanzaarMensaje("Ya se ha comenzado el juego", "warning");
  }
});

botonResetear.addEventListener("click", () => {
  if (comienzo == false) {
    lanzaarMensaje("No se ha comenzado el juego", "warning");
  } else {
    // quiero preguntar en un dialogo de confirmacion si quiero mantener los equipos
    lanzarDialogo(
      "¿Deseas mantener los equipos en el juego ?",
      "Reiniciar Juego",
      "Mantener",
      "No mantener"
    );
  }
});

botonJugadores.addEventListener("click", () => {
  equipos.forEach((equipo) => {
    for (let index = 0; index < 3; index++) {
      equipo.plantilla.push(jugadores[index]);
    }
  });

  equipos.forEach((equipo) => {
    equipo.mostrarJugadores();
    console.log("-----------------");
  });
});

function lanzarDialogo(mensaje, titulo, botonConfirmar, botonCancelar) {
  Swal.fire({
    title: titulo,
    text: mensaje,
    icon: "warning",
    showDenyButton: true,
    showCancelButton: true,
    confirmButtonText: botonConfirmar,
    denyButtonText: botonCancelar,
  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      divEquipos.innerHTML = "";
      comienzo = false;
    } else if (result.isDenied) {
      divEquipos.innerHTML = "";
      listaEquipos.innerHTML = "";
      equipos = [];
      comienzo = false;
    }
  });
}

function crearCartaEquipo(equipo) {
  let nodoDiv = document.createElement("div");
  nodoDiv.className = "col animate__animated animate__fadeIn";
  nodoDiv.innerHTML = `<flip-card variant="click" class="trivia-card">
            <div slot="front">
              <div class="card">
                <img src="..." class="card-img-top" alt="..." />
                <div class="card-body">
                  <h5 class="card-title">${equipo.nombre}</h5>
                  <p class="card-text">${equipo.estado}</p>
                </div>
              </div>
            </div>
            <div slot="back">
              <div class="card">
                <img src="..." class="card-img-top" alt="..." />
                <div class="card-body">
                  <h5 class="card-title">${equipo.nombre}</h5>
                  <p class="card-text">Presupuesto ${equipo.presupuesto}</p>
                </div>
              </div>
            </div>
          </flip-card>`;
  divEquipos.append(nodoDiv);
}

// funcion agregarEquipo(){}
// funcion limpiarFormulario(){}

function lanzaarMensaje(mensaje, tipo) {
  Swal.fire({
    position: "center",
    icon: tipo,
    title: mensaje,
    timer: 3000,
    showConfirmButton: false,
  });
}

function limpiarFormulario() {
  inputNombreEquipo.value = "";
  inputPresupuestoEquipo.value = "";
}

function agregarEquipo(equipo) {
  equipos.push(equipo);
  agregarNodoEquipo(equipo.nombre);
}

function agregarNodoEquipo(nombre) {
  let nodoLI = document.createElement("li");
  nodoLI.className =
    "list-group-item animate__animated animate__fadeInRight d-flex justify-content-between";
  nodoLI.innerText = nombre;
  let boton = document.createElement("button");
  boton.className = "btn btn-danger";
  boton.innerText = "Eliminar";
  boton.addEventListener("click", () => {
    elimiarEquipo(nombre);
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
}

function elimiarEquipo(nombre) {
  // equipo que quiero eliminar
  equipos = equipos.filter(
    (item) => item.nombre.toLowerCase() != nombre.toLowerCase()
  );
}
