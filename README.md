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
