<template>
  <div>
      <!--step two-->
      <reading-list/>
      <!--step five-->
      <nav>
          <router-link v-bind:to="{ name: 'newbook' }">Add Book to Reading List</router-link>
      </nav>
  </div>
</template>

<script>
//step two
import ReadingList from '../components/ReadingList.vue'
export default {
    //step two
    name: 'mybooks',
    components: {
        ReadingList
    }

}
</script>

<style>

</style>