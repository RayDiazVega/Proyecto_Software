# API para notas y horarios de la plataforma BANNER
Para poder replicar el proyecto se deben seguir los siguientes pasos:

1) Descargar e instalar la versión "Java SE Development Kit 8u211" de acuerdo al sistema operativo. Se puede descargar desde la pagina oficial con el siguiente enlace: https://www.oracle.com/technetwork/es/java/javase/downloads/jdk8-downloads-2133151.html

2) Una ves instalado nos dirigimos a la ruta de instalacion, nos movemos a la carpeta bin y agregamos la ruta a las variables de entorno, por ejemplo en windows seria C:\Program Files\Java\jdk1.8.0_201\bin

3) Descargamos la version "3.3.9" de Grails. Se puede descargar desde la pagina ofocial con el siguiente enlace: https://grails.org/

4) En caso de no tenerlo, descargamos e instalamos IntelliJ IDEA, si no tenemos una cuenta podemos usar la version de prueba.

5) Descargamos, extraemos y colocamos la carpeta del proyecto en la ruta donde se encuentran los proyectos de IntelliJ IDEA.

6) Abrimos nuestro proyecto, tomara un momento mientras se sincroniza y se descargan las dependencias.

7) Finalmente ejecutamos nuestro proyecto, cuando termine la compilacion se abrira nuestro navegador con la ruta http://localhost:8080, para visualizar el resultado debemos agregar a la ruta el nombre del proyecto mas "show" y el indicador, por ejemplo en nuestro caso seria http://localhost:8080/asignatura/show/1 y se mostrara {"id":1,"room":"A3-401","startHour":"10","finalHour":"12","ncr":"1253","name":"Liderasgo y emprendimiento"}
