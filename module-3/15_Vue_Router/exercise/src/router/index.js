import Vue from 'vue';
import VueRouter from 'vue-router';
//step one
import Home from '../views/Home';
//step two
import MyBooks from '../views/MyBooks';
//step four
import NewBook from '../views/NewBook';
//step five
import BookDetails from '../views/BookDetails'
Vue.use(VueRouter);

const routes = [
  //step one
  {path: '/', name: 'home', component: Home},
  //step two
  {path: '/myBooks' ,name: 'mybooks', component: MyBooks},
  //step four
  {path: '/addBook', name: 'newbook', component: NewBook},
  //step five
  {path: '/book/:isbn', name: 'book-details', component: BookDetails}
  
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
