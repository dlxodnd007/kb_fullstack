<script setup>
import ChildScopedSlot from "./components/ChildScopedSlot.vue";
import ParentScopedSlot from "./components/ParentScopedSlot.vue";
</script>

<template>
    <ParentScopedSlot />
</template>

<script>
export default {
    name: "App",
    components: { ChildScopedSlot, ParentScopedSlot },
};
</script>
<style scoped></style>
