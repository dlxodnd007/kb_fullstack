<script setup></script>

<template>
    <div>
        <nav>
            <router-link to="/">홈페이지</router-link>
            &nbsp;
            <RouterLink to="/about">라우터란?</RouterLink>
            &nbsp;
            <RouterLink to="/dynamic/happy">행복하다</RouterLink>
            &nbsp;
            <router-link to="/dynamic/exciting">씐난다</router-link>
            &nbsp;
        </nav>
        <!-- <router-view /> -->
        <RouterView />
    </div>
</template>
