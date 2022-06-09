const alunos = [
    {
        nome: "João",
        nota: 5,
        turma: "1B",
    },

    {
        nome: "Maria",
        nota: 9,
        turma: "1B",
    },

    {
        nome: "Pedro",
        nota: 6,
        turma: "2C",
    },

    {
        nome: "Paulo",
        nota: 3,
        turma: "2C",
    }
];

function AlunosAprovados (array, mediaFinal) {
    let aprovados = [];

    for (let i = 0; i < array.length; i++) {

        const {nota, nome} = array[i];

        if(nota >= mediaFinal) {
            aprovados.push(nome);
        }
    }

    return aprovados;
}

console.log(AlunosAprovados(alunos, 8));

//Atividade 2

function calculaIdade(anos) {
    return `Daqui a ${anos} anos, ${this.name} terá ${this.idade + anos} anos de idade. `;
}

const pessoa1 = {
    name: "Maria",
    idade: 30
};

const pessoa2 = {
    name: "Pedro",
    idade: 26,
};

const cachorro = {
    name: "Bob",
    idade: 13,
    raca: "vira-lata",
};

console.log(calculaIdade.call(cachorro, 30));

