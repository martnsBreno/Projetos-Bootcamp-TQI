function ativarEscuro() {
    mudarClasses();
    mudarTexto();
}

function mudarClasses() {
    modeBtn.classList.toggle('dark-mode');
    h1.classList.toggle('dark-mode');
    bodyEl.classList.toggle('dark-mode');
}

function mudarTexto() {
    if(bodyEl.classList.contains(classeDarkmode)) {
        modeBtn.innerHTML = "Modo Claro";
        h1.innerHTML = "Modo Escuro Ativado!";
    } else {
        modeBtn.innerHTML = "Modo Escuro";
        h1.innerHTML = "Modo Claro ativado!";
    }
}

const classeDarkmode = 'dark-mode';
const modeBtn = document.getElementById("mode-selector");
const bodyEl = document.getElementsByTagName("body")[0];
const h1 = document.getElementById("page-title");

modeBtn.addEventListener('click', ativarEscuro);
