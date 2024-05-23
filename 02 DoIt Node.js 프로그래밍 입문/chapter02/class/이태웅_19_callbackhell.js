const fs = require('fs');


let callback = function(i,cd) {
    fs.readFile('readme.txt','utf-8',(err,data) => {
    if(err) {
        throw err;
    }
    else {
        console.log(`${i}번`,data);
        cd(i+1,callback);
        // if(i==4) stop();
    }
})};

callback(1,callback);