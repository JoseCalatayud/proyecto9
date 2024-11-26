# proyecto09

Cuando quieras probarlo para leer un registro
curl 'http://localhost:8080/solicitud/5'

Cuando quieras listar
curl 'http://localhost:8080/solicitud'

Cuando quieras borrar
curl 'http://localhost:8080/solicitud/5' -X DELETE

Cuando quieras crear sin ID
curl 'http://localhost:8080/solicitud' -X POST -H 'Content-Type: application/json'  --data-raw '{"id":1,"nombre":"Antonio","edad":34}'