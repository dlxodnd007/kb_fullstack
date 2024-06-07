<template>
    <div>
        <input type="text" v-model.trim="todo" />
        <button v-on:click="$emit('addTodo', { todo })">추가</button>
    </div>
</template>

<script>
export default {
    name: "InputTodo",
    data() {
        return {
            todo: "",
        };
    },
};
</script>

<style lang="scss" scoped></style>
