<template>

    <button v-on:click="showForm = !showForm">Add New Book</button>

  <form v-on="showForm">
      <div class="new-book-form">
          <label for="title-input">Title:</label>
          <input type="text" id="title-input">
      </div>
      <div class="new-book-form">
          <label for="author-input">Author:</label>
          <input type="text" id="author-input">
      </div>
      <div class="new-book-form">
          <label for="isbn-input">ISBN:</label>
          <input type="text" id="isbn-input">
      </div>
  </form>
</template>

<script>
export default {
    name: 'add book',
    showForm: false,
    book: {
        title: '',
        author: '',
        read: false,
        isbn: '',

    }

}
</script>

<style>

</style>