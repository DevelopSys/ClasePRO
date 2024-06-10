let boton = document.querySelector("#boton-enviar");
let inputNombre = document.querySelector("#input-nombre");
let inputFecha = document.querySelector("#input-fecha");
let inputCategoria = document.querySelector("#select-categoria");
let inputTexto = document.querySelector("#input-contenido");
let divTimeline = document.querySelector("#div-timeline");
let selectFiltro = document.querySelector("#select-filtro");
let tweets = [];

selectFiltro.addEventListener("change", (e) => {
  let seleccion = selectFiltro.value;
  // console.log(seleccion);
  // recorrer todos los tweets y buscar lo que conincida con la categoria -> crear carta
  divTimeline.innerHTML = "";
  if (seleccion.toLowerCase() == "todas") {
    // recorre el array pinta
    tweets.forEach((item) => {
      crearCarta(item[0], item[1], item[2]);
    });
  } else {
    // recorre el array - filtro y vuelvo a recorrer y pinta
    tweets
      .filter((item) => {
        return item[0] == seleccion;
      })
      .forEach((item) => {
        crearCarta(item[0], item[1], item[2]);
      });
  }
});

boton.addEventListener("click", (e) => {
  let nombre = inputNombre.value;
  let fecha = inputFecha.value;
  let categoria = inputCategoria.value;
  let texto = inputTexto.value;
  tweets.push([categoria, nombre, fecha, texto]);
  crearCarta(categoria, texto, fecha);
});

function crearCarta(categoria, contenido, fecha) {
  // deporte -> https://i.pinimg.com/originals/0b/6b/a8/0b6ba8e47cfb2932416f613eba76cf95.jpg
  // politica -> https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHjymLrOQlXI-txG4PpkrYqSL0iZz864CKJA&s
  // tecno ->
  // sociedad ->

  let imagen = "";

  switch (categoria.toLowerCase()) {
    case "deporte":
      imagen =
        "https://i.pinimg.com/originals/0b/6b/a8/0b6ba8e47cfb2932416f613eba76cf95.jpg";
      break;
    case "politica":
      imagen =
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHjymLrOQlXI-txG4PpkrYqSL0iZz864CKJA&s";
      break;
    case "sociedad":
      imagen =
        "https://wallpapers.com/images/hd/society-1423-x-800-background-c4dkl1e5c3d67lwt.jpg";
      break;
    case "tecnologia":
      imagen =
        "https://wallpapers.com/images/featured/information-technology-background-yj5lntx9lzio3yiz.jpg";
      break;
  }

  let carta = `<section class="col mb-3">
    <div class="card" style="width: 18rem">
      <img src="${imagen}" class="card-img-top" alt="..." />
      <div class="card-body">
        <h5 class="card-title">${categoria}</h5>
        <p class="card-text">
          ${contenido}
        </p>
        <span>${fecha}</span>
      </div>
    </div>
  </section>`;

  divTimeline.innerHTML += carta;
}
