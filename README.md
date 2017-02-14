# Spring-REST-demo

Projekt jest w Spring Boot

mapping:
localhost/8080/
getLoan- wymaga parametru "id" oraz jesli chcemy format xml headera : Accept=application/xml 
createLoan -wymaga ciala w formacie xml z headerem Content-Type=application/xml lub w formacie json z headerem Content-Type=application/json (w obu przypadkach ze wzgledu na autoincrement bez pola id)
editLoan- -wymaga parametru "id" oraz ciala -w zaleznosci od formatu - Content-Type=application/xml lub Content-Type=application/json wymagane cialo w postaci json lub xml rowniez  bez id 
deleteLoan- wymaga parametru "id"

passy do bazy danych
spring.datasource.url = jdbc:h2:mem:demodb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.username = sa
spring.datasource.password =

aplikacje odpala sie przez klase DemoApplication