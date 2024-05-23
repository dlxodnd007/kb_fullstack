const obj = {
    name: "이효석",
    isOld: true,
};

function getkeyValue(obj, key) {
    console.log(obj[key]);
}

getkeyValue(obj, "name");
