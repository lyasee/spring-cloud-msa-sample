# spring-cloud-msa-sample

## Project 
|project|port|role|
|---|---|---|
|eureka|8000|eureka server|
|zuul|8500|gateway
|movie|8701|eureka client, load balancing project 1
|movie2|8711|eureka client, load balancing project 2
|ticketing|8702|eureka client, calling movie api via feign|
  
## Url 
|service|url|
|---|---|
|eureka server|http://localhost:8000/|
|movie api|http://localhost:8500/api/v1/movie/movie|
|ticketing api|http://localhost:8500/api/v1/ticketing/tickets|
|ticketing hystrix dashboard|http://localhost:8702/hystrix|
|zipkin|http://localhost:9411|
