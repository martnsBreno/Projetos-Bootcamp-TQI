function validandoArrays(array, num) {
    try {
        if (!array || !num) {
            throw new ReferenceError("Você não enviou os parâmetros");
        }
    
        if (typeof(array) !== "object") {
            throw new TypeError("O array deve ser um objeto");
        }
    
        if (typeof(num) !== "number") {
            throw new TypeError("Número inválido");
        }
    
        if(array.length !== num) throw new RangeError("Tamanho inválido");

        return array;
    }
    catch(e) {
        if (e instanceof ReferenceError) {
            console.log("Reference error");
            throw e;
        } else if (e instanceof TypeError) {
            console.log('Type error');
            throw e;
        } else if (e instanceof RangeError) {
            console.log('Range error');
            throw e;
        } else {
            console.log('Erro inesperado');
        }
    }
}

console.log(validandoArrays([1, 2, 3, 4, 5], 5));