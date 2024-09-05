<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>

<div id="title">
    <h1>¿Cual desea calcular del cono?</h1>
</div>
<div id="datos">
    <button onclick="location.href='servlet?action=area2'">Calcular área</button>
    <button onclick="location.href='servlet?action=perimetro2'">Calcular Perímetro</button>
    <button onclick="location.href='index.jsp'">Volver al inicio</button>
</div>
    
</body>
</html>