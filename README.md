# Conversor de Moneda

![image](https://github.com/user-attachments/assets/b116bab8-40f9-4498-b965-6efca15db84c)



## Descripción

Este proyecto es un **Conversor de Moneda** desarrollado en Java que permite realizar conversiones entre distintas monedas utilizando la API de **ExchangeRate-API**. El sistema está diseñado para manejar conversiones donde el dólar estadounidense (USD) sea la moneda de origen o destino.

## Características

- Conversión entre USD y las siguientes monedas:
  - Peso argentino (ARS)
  - Real brasileño (BRL)
  - Peso colombiano (COP)
  - etc
- Integración con **ExchangeRate-API** para obtener tasas de conversión actualizadas.

## Requisitos

1. Java Development Kit (JDK) 8 o superior.
2. Biblioteca **Gson** para el manejo de JSON.
3. Biblioteca **Dotenv** para gestionar claves de API de manera segura.

## Instalación

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/usuario/conversor-moneda.git
   cd conversor-moneda
   ```

2. **Configura tu clave de API:**
   - Crea un archivo `.env` en la raíz del proyecto.
   - Agrega la siguiente línea, reemplazando `YOUR_API_KEY` por tu clave de la API:
     ```env
     API_KEY=YOUR_API_KEY
     ```

3. **Compila el proyecto:**
   ```bash
   javac -cp .:gson.jar:dotenv-java.jar com/challeng/demo/*.java
   ```

4. **Ejecuta el programa:**
   ```bash
   java -cp .:gson.jar:dotenv-java.jar com.challeng.demo.principal
   ```

## Uso

1. Al iniciar el programa, verás un menú con las siguientes opciones:
   ```
   1) Dolar --> Peso argentino
   2) Peso argentino --> Dolar
   3) Dolar --> Real brasileño
   4) Real brasileño --> Dolar
   5) Dolar --> Peso colombiano
   6) Peso colombiano --> Dolar
   7) Dolar --> Sol peruano
   8) Sol peruano --> Dolar
   9) Salir
   ```
2. Selecciona una opción ingresando el número correspondiente.
3. Ingresa la cantidad a convertir cuando se te solicite.
4. Recibirás el resultado de la conversión directamente en la consola.

## Arquitectura del Proyecto

El proyecto está organizado de la siguiente manera:

```
com.challeng.demo
|
|-- principal.java          # Clase principal con la interfaz del usuario
|-- consultaApi.java        # Clase para manejar las consultas a la API
|-- conversorMoneda.java    # Clase que implementa la lógica de conversión
```

## Tecnologías Utilizadas

- Lenguaje: Java
- API de terceros: [ExchangeRate-API](https://www.exchangerate-api.com/)
- Librerías:
  - [Gson](https://github.com/google/gson) para procesar JSON.
  - [Dotenv-Java](https://github.com/cdimascio/dotenv-java) para manejar claves de configuración.

## Capturas de Pantalla

### Ejecución del Programa
  
![image](https://github.com/user-attachments/assets/372ea16b-6ce4-4a29-bac5-223d0aaa8f1d)
  
![image](https://github.com/user-attachments/assets/bd8c3782-5f8c-48db-9841-9ee2800c4565)





¡Gracias por utilizar este Conversor de Moneda! 🚀

