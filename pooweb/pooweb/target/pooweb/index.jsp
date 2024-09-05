<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Figuras</title>
    <link rel="stylesheet" href="css.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Mali:wght@200&display=swap" rel="stylesheet">
</head>
<body>
<div id="title">
<h1>★·.·★ 🎀 Selecciona Una Figura 🎀★·.·★</h1>
</div>

<div id="figuras">
    <div>
        <img src="img/triangulo.png" alt="triangulo"> 
        <a href="servlet?action=triangulo">★Triangulo </a>
    </div>
    <div>
        <img src="img/cono.png" alt="cono"> 
        <a href="servlet?action=cono">★Cono</a>
    </div>    
    <div> 
        <img src="img/circle.png" alt="circulo"> 
        <a href="servlet?action=circulo">★Circulo</a>
    </div>   
    <div> 
        <img src="img/cilindro.png" alt="cilindro">  
        <a href="servlet?action=cilindro">★Cilindro</a>
    </div>   
</div>    
</body>
</html>