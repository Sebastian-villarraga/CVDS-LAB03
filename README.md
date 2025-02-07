# CVDS-LAB03

### CREAR PROYECTO CON MAVEN

Deben crear un proyecto maven con los siguientes parámetros:

Grupo: edu.eci.cvds 
Artefacto: Library 
Paquete: edu.eci.cvds.tdd 
archetypeArtifactId: maven-archetype-quickstart 

![image](https://github.com/user-attachments/assets/064ffd93-4819-4d57-bc5a-b854a5b3b5af)

### AGREGAR DEPENDENCIA JUNIT5

- Buscar en maven central la dependencia de JUnit5 en su versión más reciente.
- Edite el archivo pom.xml del proyecto para agregar la dependencia.
- Verifique que la versión de java sea la 17
```xml
<properties>
  <maven.compiler.target>1.17</maven.compiler.target>
  <maven.compiler.source>1.17</maven.compiler.source>
</properties>
```
- Compile el proyecto para validar que todo este bien.

### AGREGAR ESQUELETO DEL PROYECTO

Cree los siguientes paquetes dentro deedu.eci.cvds.tdd
- biblioteca
  - libro
  - préstamo
  - usuario
  
![image](https://github.com/user-attachments/assets/2169c6fb-888a-45f7-9e01-8fe4360ae02c)

Estos paquetes también se deben crear en la carpeta de test.

### AGREGAR CLASES

En el paquete edu.eci.cvds.tdd.library.book cree la siguiente clase:

![image](https://github.com/user-attachments/assets/8256bde4-cc58-47ba-ab93-4df315e6b83f)

Para validar que la estructura del proyecto está bien se debe compilar usando el comando package.

![image](https://github.com/user-attachments/assets/0fc3f8f6-8e46-4211-a4d2-51a26bf7005b)
![image](https://github.com/user-attachments/assets/586dee0e-18b4-4187-8344-9e3a428e20c3)

## PRUEBAS UNITARIAS Y TDD

Para poder implementar los métodos addBook, loanABook y returnLoan de la clase Library vamos a aplicar la técnica de TDD, por cada caso de prueba se debe hacer un commit, cada commit debe tener la prueba nueva y la implementación para que la prueba del commit funcione. Las pruebas anteriormente implementadas deben continuar funcionando. Como están trabajando en parejas es necesario trabajar en ramas independientes y utilizar Pull Request para mezclar los cambios.

### CREAR CLASE DE PRUEBA

Es necesario crear la clase de prueba para edu.eci.cvds.tdd.Library, la clase debe seguir los estándares de nombres estudiados en clase.

Para pensar en los casos de pruebas lean detenidamente el javadoc de los métodos para reconocer las clases de equivalencia, basados en las clases de equivalencia se debe crear una prueba la cual debe fallar y posteriormente implementar el código necesario para que funcione, este proceso se debe repetir hasta cumplir con la especificación definida en el javadoc.

![image](https://github.com/user-attachments/assets/7274d3cc-b86d-4cfd-9ad0-c13efc72a1fd)

### COBETURA

Para usar Jacoco es necesario agregar la siguiente sección en el pom.xml
Ahora al compilar el proyecto en la carpeta target se debe crear una carpeta con el nombre site la cual tiene un index.html, al abrir dicho archivo se debe ver la cobertura total y de cada una de las clases, el objetivo es tener la cobertura superior al 80%.

![image](https://github.com/user-attachments/assets/b8fec3f2-805d-43cf-be7e-6a614c8d41f6)

### SONARQUBE 

Ahora es necesario hacer el análisis estático del código usando SonarQube, para lo cual necesitamos tener Docker.

- Para lo cual se debe descargar la imagen de docker con el siguiente comando docker pull sonarqube

![image](https://github.com/user-attachments/assets/3967eb55-1284-45f9-95fa-2b6b68a609be)

- Ahora se debe arrancar el servicio de SonarQube con el siguiente comando docker run -d --name sonarqube -e - - - -------SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest
- Validar funcionamiento docker ps -a

![image](https://github.com/user-attachments/assets/d56f9085-352e-4526-b226-57432afaadc6)
  
- Iniciar sesión en sonar localhost:9000 cambiar la clave por defecto usuario y contraseña es admin.

Ingresamos al link 'http://localhost:9000' aca digitamos el usuario y contraseña 'admin', cambiamos la nueva contraseña y nos lleva a:
![image](https://github.com/user-attachments/assets/6ece7830-fef3-4016-acdd-909db35d4189)

  
- Entrar a las opciones de la cuenta.
  - Account -> settings -> generate token.

![image](https://github.com/user-attachments/assets/833ee373-04f9-4ebe-917c-85cb1089581c)
![image](https://github.com/user-attachments/assets/5f840a7d-eaa6-4b04-938c-b59a1539abdb)
![image](https://github.com/user-attachments/assets/0521027d-0a6a-47d4-8312-d92dfa731505)

Este es el codigo arrojado por SonarCloud al generar el token:
squ_9dcafe9b620c51a7eb40c145efdf1787c76291f9
  
- Una vez sonar este corriendo deben generar un token
- Instale sonarLint en el IDE que este manejando.

entramos a intelliJ y nos dirigimos a File > Settings > Plugins:
![image](https://github.com/user-attachments/assets/c0fd5ded-22cb-45c2-a25b-8e178c1657cd)

  
- Añada el plugin de Sonar en el archivo pom del proyecto.








