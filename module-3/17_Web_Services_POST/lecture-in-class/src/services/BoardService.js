import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000",
  headers: {
    'Authorization': `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJncmVnIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY2OTk5MDIzNH0.D43CIahX_uOtOM5yQqbxnksMuY36LxZIExG5Om4qAv60whpln8XmkbV1453j5jDl68kh0VCRUsVi8VPrMQoppg`
  }
});

export default {

  getBoards() {
    return http.get('/boards');
  },

  getCards(boardID) {
    return http.get(`/boards/${boardID}`)
  },

  getCard(cardID) {
    return http.get(`/cards/${cardID}`)
  },

  addCard(card) {
    return http.post('/cards', card);
  },

  updateCard(card) {
    return http.put(`/cards/${card.id}`, card);
  },

  deleteCard(cardID) {
    return http.delete(`/cards/${cardID}`);
  },
  addBoard(board){
    return http.post('/boards', board);
  },
  deleteBoard(boardID){
    return http.delete(`/boards/${boardID}`);
  }

}
