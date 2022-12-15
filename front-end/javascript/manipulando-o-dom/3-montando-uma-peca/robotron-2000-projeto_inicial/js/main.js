const subtrair = document.querySelector('#subtrair');
const somar = document.querySelector('#somar');
const braco = document.querySelector('#braco');

const controle = document.querySelectorAll(".controle-ajuste");


function manipulaDados(operacao) {
    if(operacao === "-") {
        braco.value = parseInt(braco.value) - 1;
    } else {
        braco.value =  parseInt(braco.value) + 1;
    }
}

controle.forEach( (elemento) => {
    elemento.onclick = (evento) => {
        console.log('funcionou');
        manipulaDados(evento.target.textContent);
    }
})