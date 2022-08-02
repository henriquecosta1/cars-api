# cars-api
API Rest that consumes an external API http://api-test.bhut.com.br:3000

How to:
1 - Ter o MongoDB instalado em sua máquina com o host localhost e porta 27017.
2 - Iniciar a aplicação pelo eclipse ou terminal com o comando 'mvn spring-boot:run' dentro do repositório (necessário Maven instalado).
3 - Utilizar Postman ou Insomnia para efetuar as requisições HTTP.
3.1 - Listagem de carros: Adicionar o endpoint GET http://localhost:8080/api/listCars e efetuar a requisição.
3.2 - Novo registro de carro: Adicionar o endpoint POST http://localhost:8080/api/createCar passando um JSON conforme modelo abaixo e efetuar a requisição.
{
	"title": "Testolino",
	"brand": "BMW",
	"price": "200000",
  "age": 2022
}
3.3 - Listagem de logs de registros criados a partir do endpoint acima: Adicionar o endpoint GET http://localhost:8080/api/logs e efetuar a requisição..
