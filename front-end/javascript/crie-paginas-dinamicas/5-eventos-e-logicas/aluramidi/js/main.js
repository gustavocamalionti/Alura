//Funções --------------------------------------------------------------------------------------------
function TocaSom(seletorAudio){
    const elemento = document.querySelector(seletorAudio);
   
    if (elemento != null && elemento.localName == 'audio') {
        elemento.play();
    } else {
        console.log('Elemento não encontrado ou seletor inválido.');
    }
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

    tecla.onkeydown = function(e) {
        if (e.code == "Enter" || e.code == "Space") {
            tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function () {
        tecla.classList.remove('ativa');
    }
}