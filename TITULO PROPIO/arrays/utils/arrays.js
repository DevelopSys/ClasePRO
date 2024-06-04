const tareas = ["tarea1", "tarea2", "tarea3", "tarea4", "tarea5"];
/* tareas[6] = "tarea4";
console.log(tareas);
console.log(tareas[tareas.length - 1]); */
// console.log(tareas.push("tarea4", "tarea5", "tarea6"));
// tareas.unshift("tarea4", "tarea5", "tarea6");
// console.log(`La tarea eliminada es ${tareas.pop()}`);
// console.log(`La tarea elimina es ${tareas.shift()}`);
// console.log(tareas);
const resultante = tareas.filter((item, index) => {
  return index != 2;
});
// console.log(resultante);

const palos = ["C", "P", "R", "T"];
const baraja = [];

for (let index = 0; index < palos.length; index++) {
  const palo = palos[index];
  // console.log(palo);
  for (let index1 = 1; index1 < 13; index1++) {
    if (index1 == 10) {
      baraja.push("J" + palo);
    } else if (index1 == 11) {
      baraja.push("Q" + palo);
    } else if (index1 == 12) {
      baraja.push("K" + palo);
    } else {
      baraja.push(index1 + palo);
    }
  }

  console.log(baraja);
}
