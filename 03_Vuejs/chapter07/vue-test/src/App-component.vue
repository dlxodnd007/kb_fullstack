<script setup>
import CheckList from "./CheckList.vue";
import TodoProps from "./TodoProps.vue";
</script>

<style>
.todo {
    text-align: center;
}
</style>

<template>
    <div class="todo">
        <h1>오늘의 할일</h1>
        <CheckList />
        <hr />
        <TodoProps todo="Vue 부수기" />
        <TodoProps todo="배열 함수 끝장내기" />
        <CheckList />
    </div>
</template>

<style scoped></style>
