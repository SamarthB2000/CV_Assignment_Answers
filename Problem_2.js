// Task A: Reverse every word in a sentence
function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = words.map(word => reverseString(word));
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseString(str) {
    return str.split('').reverse().join('');
}

// Example for Task A
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log("Task A:");
console.log("Original Sentence: " + inputSentence);
console.log("Reversed Words: " + reversedSentence);

// Task B: Perform sorting of an array in descending order
function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

// Example for Task B
let inputArray = [5, 2, 8, 1, 7];
let sortedArray = sortArrayDescending(inputArray);
console.log("\nTask B:");
console.log("Original Array: " + inputArray.join(', '));
console.log("Sorted Array (Descending): " + sortedArray.join(', '));
