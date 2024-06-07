<script setup>
import FancyPhotoBox from "./components/FancyPhotoBox.vue";
import ParentFancyPhotoBox from "./components/ParentFancyPhotoBox.vue";
</script>

<template>
    <ParentFancyPhotoBox />
</template>
<script>
export default {
    name: "App",
    components: {
        ParentFancyPhotoBox,
        FancyPhotoBox,
    },
};
</script>

<style scoped></style>
