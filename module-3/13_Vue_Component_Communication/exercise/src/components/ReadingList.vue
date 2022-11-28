<template>
  <div class="book-container">
    <!-- step one -->
        <book-card v-for="book in $store.state.books" v-bind:book="book" v-bind:key="book.title" />
  </div>
</template>

<script>
  //step one
import BookCard from './BookCard.vue'

export default {
  //step one
  components: { BookCard },
    name: 'reading-list',
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>