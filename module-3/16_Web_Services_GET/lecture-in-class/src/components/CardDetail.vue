<template>
  <div>
    <h1>{{ card.title }}</h1>
    <p>{{ card.description }}</p>

    <div class="loading" v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" />
    </div>
     <!-- comment list -->
     <comments-list v-bind:comments="card.comments" v-else />

     <div class="board-actions" v-if="!isLoading" >
      <router-link
      v-bind:to="{ name: 'Board', params: {id: $route.params.boardID}}"
      >Back to board</router-link>
     </div>
  </div>
</template>

<script>
import boardsService from "../services/BoardService";
import CommentsList from "../components/CommentsList";

export default {
  name: "card-detail",
  components: {
    CommentsList,
  },
  data() {
    return {
      card: {
        title: "",
        description: "",
        status: "",
        comments: [],
      },
      isLoading: true,
    };
  },

  created() {
    boardsService
      .getCard(this.$route.params.boardID, this.$route.params.cardID)
      .then((response) => {
        this.card = response;
        this.isLoading = false;
      });

    // boardsService.getThisCard(this.$route.params.cardID)
    // .then( response => {
    //   this.card = response;
    //   this.isLoading = false;
    // })
  },
};
</script>
