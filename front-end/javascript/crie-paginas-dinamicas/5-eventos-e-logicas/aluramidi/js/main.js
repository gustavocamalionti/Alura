//Funções --------------------------------------------------------------------------------------------
function TocaSom(idElementoAudio){
    document.querySelector(idElementoAudio).play();
}

//Referências ----------------------------------------------------------------------------------------
const listaDeTeclas = document.querySelectorAll('.tecla'); //o valor é constante

//Para -------------------------------------------------------------------------------------------
for (let contador=0; contador < listaDeTeclas.length; contador++) {
    const tecla = listaDeTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`

    tecla.onclick = function() {
        TocaSom(idAudio);
    };

    tecla.onkeydown = function() {
        tecla.classList.add('ativa');
    }
}