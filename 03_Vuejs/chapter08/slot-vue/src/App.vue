<script setup>
import ParrentSlot from "./components/ParrentSlot.vue";
import ChildSlot from "./components/ChildSlot.vue";
</script>

<template>
    <div>
        <ParrentSlot />
    </div>
</template>

<script>
export default {
    name: "App",
    components: {
        ParrentSlot,
    },
};
</script>
<style scoped></style>
