const BASE_URL = 'http://localhost:8080';

const endpoints = {
  ALL_CLOTHES: BASE_URL + '/cloth/all',
  ALL_TOYS: BASE_URL + '/toy/all',
  ALL_BOOKS: BASE_URL + '/book/all',
  ALL_GAMES: BASE_URL + '/game/all',
  ALL_JEWELRY: BASE_URL + '/jewelry/all',
  ALL_PURSE: BASE_URL + '/purse/all',
  ONE_ITEM: BASE_URL + '/book/user/',
  REVIEW: BASE_URL + '/book/user/review/'
};

export default endpoints;
