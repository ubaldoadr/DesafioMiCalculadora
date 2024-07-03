<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta charset="UTF-8">
 <title>Calculadora</title>
 <link rel="stylesheet"
href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
 </head>
 <body>
 <main class="container">
 <h1>Calculadora</h1>
 <div class="grid">
 <form name="formulario" action="/DesafioMiCalculadora/Servlet" method="post" >
 <div class="field">
 <label for="Numero 1">Numero 1</label>
 <input type="int" name="numero1">
 </div>
 <div class="field">
 <label for="Numero 2">Numero 2</label>
 <input type="int" name="numero2">
 </div>
 <select class="form-select" aria-label="Default select example p-3 " name="operacion">
  <option selected>Seleccione operacion a realizar</option>
  <option value="suma">Suma</option>
  <option value="resta">Resta</option>
  <option value="multiplicacion">Multiplicacion</option>
  <option value="division">Division</option>
  <option value="ordenarNumero">Ordenar el numero</option>
  <option value="parOImpar">Cual es par e impar</option>
</select>
 <div class="actions">
 <input type="submit" value="Calcular">
 </div>
 </form>
 </div>
 </main>
 </body>
</html>