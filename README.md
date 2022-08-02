# cars-api
API Rest that consumes an external API http://api-test.bhut.com.br:3000<br />

How to:<br />
1. Ter o MongoDB instalado em sua máquina com o host localhost e porta 27017.
2. Iniciar a aplicação pelo eclipse ou terminal com o comando 'mvn spring-boot:run' dentro do repositório (necessário Maven instalado).
3. Utilizar Postman ou Insomnia para efetuar as requisições HTTP.<br />
3.1. Listagem de carros: Adicionar o endpoint GET http://localhost:8080/api/listCars e efetuar a requisição.<br />
3.2. Novo registro de carro: Adicionar o endpoint POST http://localhost:8080/api/createCar passando um JSON conforme modelo abaixo e efetuar a requisição.<br />
{<br />
	"title": "Testolino",<br />
	"brand": "BMW",<br />
	"price": "200000",<br />
 	"age": 2022<br />
}<br />
3.3. Listagem de logs de registros criados a partir do endpoint acima: Adicionar o endpoint GET http://localhost:8080/api/logs e efetuar a requisição..
