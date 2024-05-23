function displayA(){
    console.log('A');
}

function displayB(callback){
    // console.log('B');
    // setTimeout(() => {f();},2000);
    setTimeout(() => {console.log('B');callback();},2000);
}

function displayC(){
    console.log('C');
}

displayA();
displayB(displayC);