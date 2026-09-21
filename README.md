# travel-trip

Family road trip planning microservice skeleton. This project contains no business domain, API, or database schema yet.

## Prerequisites

- Java 21
- Maven 3.9+
- MySQL 8+
- Nacos 2+
- `zy-starter-parent:1.0.0-SNAPSHOT` and its common modules installed in the local Maven repository

## Nacos Configuration

1. Create the MySQL database `travel-trip-dev` for development and `travel-trip` for production.
2. In Nacos, create YAML configurations with Data IDs `travel-trip-dev.yaml` and `travel-trip-prod.yaml` in group `DEFAULT_GROUP`.
3. Copy the respective file from the `nacos` directory into the matching Nacos configuration.
4. The development configuration connects to `jdbc:mysql://pi.home:3306/travel-trip-dev`; the production configuration removes the `-dev` suffix.

Nacos is fixed to `pi.home:8848`, namespace `dev`, group `DEFAULT_GROUP`, with `nacos` credentials.

## Run

```bash
mvn spring-boot:run
```

Use `TRAVEL_PROFILES_ACTIVE` to select another profile. Each profile requires a Nacos Data ID following `travel-trip-{profile}.yaml`.

## Endpoints

- Health: `/actuator/health`
- API documentation: `/swagger-ui/index.html`
- OpenAPI specification: `/v3/api-docs`
