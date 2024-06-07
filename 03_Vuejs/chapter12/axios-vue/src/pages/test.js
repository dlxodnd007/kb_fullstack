const todo = {
    id: "1",
    todo: "오브젝트 이해하기",
    done: false,
};

// const copytodo = {
//     id: todo.id,
//     todo: todo.todo,
//     done: true,
// };

const copytodo = {
    ...todo,
    done: true,
};

console.log(todo === copytodo);
console.log(copytodo);
