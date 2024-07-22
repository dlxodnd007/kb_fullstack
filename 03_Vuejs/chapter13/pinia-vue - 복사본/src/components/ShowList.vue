<template>
  <div>
    <h2>최근사용내역</h2>
    <ul>
      <MakeComponent />
    </ul>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import MakeComponent from '@/components/MakeComponent.vue';
</script>
