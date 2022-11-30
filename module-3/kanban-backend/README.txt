In order to integrate the db back-end with the Vue VSCode front-end
Open the Vue project and modify package.json 

REPLACE 
{
 "serve": "npm-run-all --parallel json-server start",
 "start": "vue-cli-service serve",
 "json-server": "json-server ./db/kanban.json --delay 1000",
 "generate": "json-server ./db/generator.js",


WITH
{
 "serve": "vue-cli-service serve",