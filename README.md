# Práctica: Comunicación en Tiempo Real con Spring y WebSocket

## Descripción
Pequeña aplicación usando **Spring Boot** y **WebSocket** para enviar y recibir mensajes en tiempo real.

## Pasos

- Crear un proyecto Spring Boot con dependencias:
  - `spring-boot-starter-web`
  - `spring-boot-starter-websocket`

- Configurar WebSocket:
  - Registrar endpoint `/ws`.
  - Habilitar broker simple en `/topic`.

- Crear un controlador:
  - Usar `@MessageMapping` para recibir mensajes.
  - Usar `@SendTo` para enviar mensajes a los suscriptores.

- Implementar cliente frontend:
  - Conectar usando **SockJS** y **STOMP**.
  - Mostrar mensajes recibidos en la UI.

## Requisitos

- Java 17+
- Maven
- Spring Boot 3.x
- SockJS + Stomp.js en el frontend

## Resultado Esperado

Una página donde los usuarios envíen mensajes y se reciban actualizaciones en tiempo real usando WebSocket.
