let display = document.getElementById('display');
let currentInput = '';

function appendSymbol(symbol) {
    currentInput += symbol;
    display.value = currentInput;
}

function clearDisplay() {
    currentInput = '';
    display.value = '';
}

function calculate() {
    try {
        currentInput = eval(currentInput).toString();
        display.value = currentInput;
    } catch (error) {
        display.value = 'Error';
    }
}
