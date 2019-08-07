# spring-cloud-msa-sample

project|port|role|
|---|---|---|
|eureka|8000|eureka server|
|zuul|8500|gateway
|movie|8701|eureka client
|movie2|8711|eureka client
|ticketing|8702|eureka client, calling movie api via feign|
