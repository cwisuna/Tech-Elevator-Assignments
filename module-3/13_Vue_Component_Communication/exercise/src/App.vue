<template>
  <div id="app">
    <h1>Reading List</h1>
    <!-- step one -->
    <reading-list />
    <new-book-form />
  </div>
</template>

<script>
//step one
import ReadingList from './components/ReadingList.vue';
import NewBookForm from './components/NewBookForm.vue';



export default {
  name: 'app',
  components: {
    // step one
    ReadingList,
    NewBookForm
  }
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
