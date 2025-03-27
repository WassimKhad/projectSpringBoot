# Project Spring Boot - API REST

Ce projet est une application Spring Boot qui fournit une API REST simple pour la gestion des utilisateurs.

## Fonctionnalités

- Endpoint "Hello World" de test (/say-hello)
- API REST pour la gestion des utilisateurs (/api/users)

## Technologies utilisées

- Java 17
- Spring Boot 3.4.3
- Maven

## Prérequis

- Java 17 ou supérieur
- Maven (ou utiliser le wrapper Maven inclus ./mvnw)

## Installation et démarrage

1. Cloner le repository
```bash
git clone https://github.com/WassimKhad/projectSpringBoot.git
```

2. Se déplacer dans le répertoire du projet
```bash
cd projectSpringBoot
```

3. Lancer l'application
```bash
./mvnw spring-boot:run
```

L'application sera accessible à l'adresse : http://localhost:8080

## Endpoints disponibles

- GET /say-hello : Affiche un message de bienvenue
- GET /api/users : Récupère la liste des utilisateurs

## Structure du projet

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── Initialized/
│   │               ├── InitializedApplication.java
│   │               ├── SayHelloController.java
│   │               ├── User.java
│   │               └── UserController.java
│   └── resources/
│       └── application.properties
```