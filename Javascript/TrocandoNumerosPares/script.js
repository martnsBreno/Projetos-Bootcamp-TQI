function trocaNumeros(array) {
    for(let i = 0; i < array.length; i++) {
        if(array[i] === 0) console.log("Indice já é 0.")
        if (array[i] % 2 === 0) {
            console.log(`${array[i]} substituido por 0`);
            array[i] = 0;
        }
    }
    return array;
}

let arr = [0, 1, 2, 3, 4, 5, 6]
console.log(trocaNumeros(arr));