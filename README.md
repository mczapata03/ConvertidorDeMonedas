Conversión entre:
*Dólar (USD) ↔ Peso Colombiano (COP)
*Dólar (USD) ↔ Peso Argentino (ARS)
*Dólar (USD) ↔ Real Brasileño (BRL)

*HttpClient** y **HttpRequest** para peticiones HTTP
**Gson** para parseo de JSON
**java.time.LocalDateTime** para fecha y hora de conversiones
**Scanner**

API:
https://v6.exchangerate-api.com/v6/ac0ccff70243f88de58ebcff/latest/USD

Historial de conversiones:
*Fecha y hora
*Cantidad original y convertida
*Moneda de origen y destino

ConvertidorDeMoneda/
└── src/
├── Principal.java
├── modelos/
│ ├── HistorialDeConversion.java
│ └── RespuestaApi.java
├── servicios/
│ ├── ConvertidorDeMoneda.java
│ └── TipoDeCambio.java

