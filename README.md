# 🚀 Práctica: Comunicación en Tiempo Real con Spring y WebSocket

## 📋 Descripción
Aplicación sencilla usando **Spring Boot** y **WebSocket** para enviar y recibir mensajes en tiempo real entre clientes y servidor.

## 🎯 Objetivo
- Comprender la configuración básica de WebSocket en Spring Boot.
- Implementar una comunicación bidireccional eficiente y en tiempo real.
- Conocer las ventajas de usar WebSocket:
  - 📡 Comunicación persistente sin necesidad de reabrir conexiones.
  - ⚡️ Menor latencia en la transmisión de datos.
  - 🔄 Flujo de mensajes en tiempo real entre múltiples clientes.

## 🛠️ Pasos

- Crear un proyecto Spring Boot con dependencias:
  - `spring-boot-starter-web`
  - `spring-boot-starter-websocket`

- Configurar WebSocket:
  - Registrar endpoint `/ws`.
  - Habilitar broker simple en `/topic`.

- Crear un controlador:
  - Usar `@MessageMapping` para recibir mensajes.
  - Usar `@SendTo` para distribuir los mensajes.

- Implementar cliente frontend:
  - Conectar usando **SockJS** y **STOMP**.
  - Mostrar mensajes en tiempo real en la interfaz.

## ⚙️ Requisitos

- Java 17+
- Maven
- Spring Boot 3.x
- SockJS + Stomp.js en el frontend

## ✅ Resultado Esperado

Una página web donde varios usuarios puedan enviar mensajes y recibir actualizaciones en tiempo real usando WebSocket de manera eficiente.
