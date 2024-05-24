const fs = require('fs').promises;

fs.readFile('readme1.txt')
    .then((data) =>{
        console.log('1번 : ',data.toString());
        return fs.readFile('readme2.txt');
    })
    .then((data) =>{
        console.log('2번 : ',data.toString());
        return fs.readFile('readme3.txt');
    })
    .then((data) =>{
        console.log('3번 : ',data.toString());
        return fs.readFile('readme4.txt');
    })
    .then((data) =>{
        console.log('4번 : ',data.toString());
    })
    .catch(function (err) {
        // throw err;
        console.log(err);
    })
