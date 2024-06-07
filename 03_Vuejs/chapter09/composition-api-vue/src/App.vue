<script setup>
import { ref, reactive, computed } from "vue";
</script>

<template>
    <h1>{{ count }}</h1>
    <h1>x = {{ obj.x }} / y = {{ obj.y }}</h1>
    <h1>{{ double }}</h1>
    <button @click="increment">+1</button>
</template>

<script>
const count = ref(2);
const obj = reactive({ x: 0, y: 0, result: 0 });
const double = computed(function () {
    return count.value * 2;
});
function increment() {
    count.value++;
}
</script>
