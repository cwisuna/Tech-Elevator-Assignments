<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <!-- <HelloWorld msg="Welcome to Your Vue.js App"/> -->
    <park-list></park-list>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'
import ParkList from '../components/Parks';

export default {
  name: 'Home',
  components: {
    // HelloWorld
    ParkList
  }
}
</script>
