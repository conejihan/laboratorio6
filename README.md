# Laboratorio 5

## PARTE I. - JUGANDO A SER UN CLIENTE HTTP

Al realizar la conexion sincronica TCP/IP a través de Telnet al servidor www.escuelaing.edu.co con el puerto 80 y versionde HTTP 1.0 y solicitar sssss/abc.html nos arrojo un error ya que el servidor no admitia la version del HTTP, como se muestra a continuacion.

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/1.png)



Luego se ingreso al servidor www.httpbin.org, con puertos 80 y version de HTTP 1.1 y solicitar /html nos aparecio el siguiente resultado.

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/2.png)



Para contar el numero de caracteres de este se uso wc -c por medio del git bash

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/3.png)



Despues se utilizo curl para hacer las peticiones, dandonos los siguientes resultados

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/4.png)



Luego de utilizar curl se hizo lo mismo pero añadiendo en una primera instancia el parametro -i y segunda instacia -v

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/6.png)
![](https://github.com/conejihan/laboratorio5/blob/main/capturas/7.png)



## PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.

Despues de agregar las clases, compilo y ejecuto la plicacion para ver su funcionamiento

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/8.png)
![](https://github.com/conejihan/laboratorio5/blob/main/capturas/9.png)


Al ingresar a la URL localhost:8080 aparecio un saludo

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/10.png)



Luego al ingresar a localhost:8080/helloServlet con el parametro ?name=Juan, se modifico el saludo en vez de world salia el nombre de Juan

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/10.png)


Despues se ingreso a la URL https://jsonplaceholder.typicode.com/todos/1. donde se le cambio los numeros al final del Patch para ver que ocurria, este hacia cambiar la id y el title que aparecian en la pagina

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/12.png)
![](https://github.com/conejihan/laboratorio5/blob/main/capturas/13.png)


## PARTE III.

Al hacer la configuracion correspondiente para la creacion de la tabla con los datos de la URL anterior, se presento el siguiente resultado

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/14.png)


## PARTE IV. - FRAMEWORKS WEB MVC – JAVA SERVER FACES / PRIME FACES

Al abrir la URL  http://localhost:8080/faces/calculadora.xhtml y despues de configurar todo, se busco el html que se genero, del cual se encontro el siguiente

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/html.JPG)

Despues se busco el elemento que estaba oculto en el codigo.

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/numeroInvi.JPG)

Luego en la seccion de estilos se desabilito el estilo que lo ocultaba, lo que resulto fue que aparecio el numero arriba de todo lo que se habia puesto

![](https://github.com/conejihan/laboratorio5/blob/main/capturas/visible.JPG)

Se jugo despues con los estilos de distintos elementos dando como resultado lo siguiente

