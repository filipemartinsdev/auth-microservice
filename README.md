# Authentication Microservice

## Stack
- Java 21
- Spring Framework
    - Spring Boot
    - Spring Security
- OAuth2 + JWT
- RSA Keys / JWT Encryption
- OpenAPI (Swagger)

## Features
- Standard Response (JSend)
- Authentication with JWT
    - Access Token
    - Refresh Token

## Architecture
Asymmetric encryption with RSA keys (RS256 algorithm), using public and private keys issued via OpenSSL.
This model improves security in distributed systems.

## How to execute
You can issue new keys and move them to `src/main/resources/` (`app.key` for private and `app.pub` for public), or use the defaults for tests.



## Backlog
- [x] Auth endpoints
- [ ] Docs (OpenAPI)
- [ ] Global Exception Handler middleware
