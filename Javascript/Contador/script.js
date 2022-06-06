var currentNumberEl = document.getElementById("currentNumber");
var currentNumber = 0;

function increment() {
    currentNumber += 1;
    currentNumberEl.innerHTML = currentNumber;
}

function decrement() {
    currentNumber -= 1;
    currentNumberEl.innerHTML = currentNumber;
}