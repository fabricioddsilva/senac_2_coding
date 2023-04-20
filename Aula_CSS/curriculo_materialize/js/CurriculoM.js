const ola = document.getElementById("ola");
ola.addEventListener("click", saudacoes)

function saudacoes(){
    let nome = prompt("Olá Mundo")
    //alert("Olá" + " " + nome + "!");
    alert(`Olá, ${nome}!`)
}
