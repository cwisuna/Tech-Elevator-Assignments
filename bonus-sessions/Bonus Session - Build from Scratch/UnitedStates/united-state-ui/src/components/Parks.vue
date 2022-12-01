<template>
  <div>
      <h1>Parks</h1>

      <table>
          <tr>
              <th>Park Id</th>
              <th>Park Name</th>
              <th>State Name</th>
          </tr>
          <tr v-for="park in parks" v-bind:key="park.parkId">
              <td>{{ park.parkId }}</td>
              <td>{{ park.parkName }}</td>
              <td>{{ park.stateName }}</td>

          </tr>
      </table>
  </div>
</template>

<script>
import parkService from '../services/parkService.js';

export default {
    name: 'park-list',
    data(){
        return {
            parks: []
        }
    },
    created() {
        parkService.getAllParks().then( response => {
                this.parks = response.data;

        })
    }
}
</script>

<style>

</style>