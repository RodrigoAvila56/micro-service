🖥️ Proyecto de Microservicios con Spring Boot
Descripción
Este proyecto implementa una arquitectura basada en microservicios utilizando Spring Boot. La aplicación consta de varios servicios distribuidos, cada uno con una función específica, y están integrados a través de un API Gateway. Además, se incluye un Config Server para la gestión centralizada de configuraciones y un Eureka Server para la gestión de descubrimiento de servicios.

Arquitectura de la Aplicación
API Gateway: Punto de entrada principal que enruta las solicitudes a los microservicios correspondientes.
Microservicio de Estudiantes: Gestiona la información de los estudiantes, interactuando con una base de datos MySQL.
Microservicio de Cursos: Maneja la información de los cursos, utilizando una base de datos PostgreSQL.
Config Server: Centraliza las configuraciones de todos los microservicios.
Eureka Server: Se utiliza para el descubrimiento de servicios y balanceo de carga entre los microservicios.
Tecnologías Utilizadas
Lenguaje: Java
Frameworks: Spring Boot, Spring Cloud (Eureka, Config Server)
Base de Datos:
Microservicio de Estudiantes: MySQL
Microservicio de Cursos: PostgreSQL
Otros: API Gateway, Eureka Server, Config Server, Docker
