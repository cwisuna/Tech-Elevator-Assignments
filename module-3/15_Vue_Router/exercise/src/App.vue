<template>
  <div id="app">
    <router-view />
    <!--step three-->
      <nav>
          <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|
          <router-link v-bind:to="{ name: 'mybooks' }">My Books</router-link>
      </nav>
  </div>
</template>

<script>

export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}

</style>
