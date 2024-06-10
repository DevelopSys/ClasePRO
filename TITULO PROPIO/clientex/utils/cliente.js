let boton = document.querySelector("#boton-enviar");
let inputNombre = document.querySelector("#input-nombre");
let inputFecha = document.querySelector("#input-fecha");
let inputCategoria = document.querySelector("#select-categoria");
let inputTexto = document.querySelector("#select-contenido");

boton.addEventListener("click", (e) => {
  let nombre = inputNombre.ariaValueMax;
  let fecha = inputFecha.ariaValueMax;
  let categoria = inputCategoria.ariaValueMax;
  let texto = inputTexto.ariaValueMax;
});

function crearCarta(categoria, contenido, fecha) {
  // deporte -> https://i.pinimg.com/originals/0b/6b/a8/0b6ba8e47cfb2932416f613eba76cf95.jpg
  // politica -> https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHjymLrOQlXI-txG4PpkrYqSL0iZz864CKJA&s
  // tecno -> https://wallpapers.com/images/featured/information-technology-background-yj5lntx9lzio3yiz.jpg
  // sociedad -> https://wallpapers.com/images/hd/society-1423-x-800-background-c4dkl1e5c3d67lwt.jpg

  let carta = `<div class="col">
    <div class="card" style="width: 18rem">
      <img src="..." class="card-img-top" alt="..." />
      <div class="card-body">
        <h5 class="card-title">${categoria}</h5>
        <p class="card-text">
          ${contenido}
        </p>
        <span>${fecha}</span>
      </div>
    </div>
  </div>`;
}
