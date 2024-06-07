<script setup>
import PropsList from "./PropsList.vue";
import PropsList2 from "./PropsList2.vue";
</script>

<style></style>

<template>
    <PropsList siteName="네이버" siteUrl="http://naver.com" visited="방문" />
    <PropsList siteName="다음" siteUrl="http://daum.net" visited="미방문" />
    <PropsList2 :siteInfo="siteData" />
</template>
<script>
export default {
    name: "App",
    data() {
        return {
            siteData: {
                siteName: "페이스북",
                siteUrl: "https://facebook.com",
                visited: "방문",
            },
        };
    },
};
</script>

<style scoped></style>
