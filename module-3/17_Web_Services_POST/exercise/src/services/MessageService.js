import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  get(id) {
    return http.get(`/messages/${id}`);
  },
  //part 2: step one
  create(message){
    return http.post(`/messages/`, message);
  },
  //part 2: step two
  update(id, message){
    return http.put(`/messages/${id}`, message)
  },
  //part 2: step three
  delete(id){
    return http.delete(`/messages/${id}`)
  }

}
