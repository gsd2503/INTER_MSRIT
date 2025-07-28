// 1. Write a Node.js program that defines a function add(a, b, callback) which adds two numbers and returns the result via a callback. Chain this with another callback to multiply the result by 10 and log it. Finally, use fs.readFile() to read and display the contents of a file named info.txt.

const fs = require('fs');

function add(a, b, callback) {
  const sum = a + b;
  callback(sum);
}

// First, add 5 + 3, then multiply result by 10 and log it
add(5, 3, (sum) => {
  const multiplied = sum * 10;
  console.log('Multiplied result:', multiplied);

  // After logging, read and display contents of info.txt
  fs.readFile('info.txt', 'utf8', (err, data) => {
    if (err) {
      console.error('Error reading file:', err);
      return;
    }
    console.log('Contents of info.txt:');
    console.log(data);
  });
});