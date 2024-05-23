// let getTriangle = function(base,height){
//     return base * height  / 2;
// };

// console.log(`삼각형의 면적: ${getTriangle(5,2)}`);

// const getTriangle = function(base,height){
//     return base * height  / 2;
// };

// const getTriangle = (base,height) => {
//     return base * height / 2;
// };

const getTriangle = (base,height) => (base * height) / 2;

const testFunc = (a,b) => {
    b = a;
};

const testFunc2 = (a,b) =>(b = a);

const normalFunc = function (){
    console.log('normalFunc : ',this);
};

const arrowFunc = () => {
    console.log('arrowFunc : ',this);
};

normalFunc();
arrowFunc();

console.log('testFunc : ',testFunc(1,2));
console.log('testFunc2 : ',testFunc2(1,2));

console.log(`삼각형의 면적: ${getTriangle(5,2)}`);