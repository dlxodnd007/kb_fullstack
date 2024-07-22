<template>
    <div>
        <h1>{{ count }}</h1>
    </div>
</template>

<script setup>
import { computed } from "vue";
import { useCounterStore } from "@/stores/counter";

const counterStore = useCounterStore();
const { increment } = counterStore;

const count = computed(() => counterStore.count);
const doubleCount = computed(() => counterStore.doubleCount);
</script>
