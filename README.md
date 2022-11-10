# Microservicios Spring Cloud Eureka & Angular Full-stack

## Sección 3: Backend: Eureka Server Registrando microservicios
19. Creando y configurando servidor Zuul Gateway

## Importante para Zuul Server
- Como estamos usando Zuul Server, es necesario que el proyecto de spring boot sea igual o inferior a la versión 2.3.12.RELEASE
ya que para versiones posteriores no funciona.  
Para versiones posteriores o actuales de Spring Boot se usa Spring Cloud Gateway (usa programación reactiva, etc..).  

- Además, cada versión de Spring Boot tiene que ir acompañado de su versión de Spring Cloud, es por eso que se realizan los
  siguientes dos cambios.

- Cambios a realizar para trabajar con Zuul

```
<version>2.3.12.RELEASE</version>
```

```
<spring-cloud.version>Hoxton.SR12</spring-cloud.version>
```
