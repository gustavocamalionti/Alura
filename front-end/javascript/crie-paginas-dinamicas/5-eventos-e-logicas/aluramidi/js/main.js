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

    tecla.onclick = function () {
        TocaSom(idAudio);
    };
}

// //Enquanto -------------------------------------------------------------------------------------------
//let contador = 0  //receber sempre um valor novo;
// while (contador < listaDeTeclas.length) {
//     const tecla = listaDeTeclas[contador];
//     const instrumento = tecla.classList[1];

//     //template string - pesquisar sobre
//     const idAudio = `#som_${instrumento}`

//     tecla.onclick = function () {
//         TocaSom(idAudio);
//     };

//     contador = contador + 1;
//     // console.log(contador);
// }