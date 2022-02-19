# Gilded Rose Kata 

Práctica de refactorizacion en java de Gilded Rose, pero incluyendo docker para la asignatura Sistemas informáticos.

---

## Funcionamiento y Diagrama UML

### Diagrama UML de la aplicación

![img.png](images/asas.png)

### Casos test

![](images/test.png)


### El resultado de la aplicación

![](images/img.png)

---

## Docker

Nos encargamos de tener listo un *Dockerfile* y arrancamos, en este caso, una *Git Bash* desde ese directorio.

Ejecutamos:

``docker build -t gildedrose .``

![img_1.png](images/img_1.png)

![](images/Screenshot_1.png)

En caso de que nos de error con la imagen, los siguientes comandos:

```export DOCKER_BUILDKIT=0```

```export COMPOSE_DOCKER_CLI_BUILD=0```

![](images/Screenshot_2.png)

Para comprobar nuestros contenedores:

![](images/Screenshot_3.png)

Ejecutamos 

``docker run -it --name katagildedrose gildedrose:latest``

![](images/Screenshot_4.png)

![](images/Screenshot_5.png)

En caso de instalar Maven

![img.png](images/mvn.png)


### Bibliografía:

Se ha usado *https://github.com/dfleta/docker-multistage-maven-java* como guía y recurso para el trabajo.