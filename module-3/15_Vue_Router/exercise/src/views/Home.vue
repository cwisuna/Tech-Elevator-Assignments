<template>
<!-- step one -->
<div >
  <best-seller-list/>
  <new-releases-list/>
  </div>
</template>

<script>
// step one
import BestSellerList from '../components/BestSellerList.vue'
import NewReleasesList from '../components/NewReleasesList.vue'

export default {
    // step one
    name: "home",
    components: {
        BestSellerList,
        NewReleasesList,

    }
}
</script>

<style>

</style>
