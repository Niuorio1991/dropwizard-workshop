# Workshop

Objetivo
---

Durante el desarrollo del Workshop se mostrara como construir una API Rest
 utilizando el framework de Java Dropwizard y sus diferentes Bundles. 

Consignas
---
1. Modelar el recurso elegido siguiendo lineamientos de OOP.
1. Exponer la administracion del recurso mediante una interfaz RESTful utilizando Jersey.
1. Persistir el recurso en una DB MySQL mediante JPA/Hibernate.
1. Manejar la estructura de datos mediante Liquibase
1. Securizar los endpoints con JWT
1. Tener una cobertura de test de al menos 70%


Como levantar la aplicacion de ejemplo
---

1. Ejecutar `git clone https://github.com/Niuorio1991/dropwizard-workshop` para clonar el repositorio
1. `cd dropwizard-workshop && mvn clean install` para buildear la aplicacion
1. Levantar la aplicacion con `java -jar target/dropwizard-workshop-1.0-SNAPSHOT.jar server config.yml`
1. Para comprobar que haya levantado correctamente, ingresar a la url `http://localhost:8080`


Autor
------------

* Nicolas Iuorio [@Niuorio1991]