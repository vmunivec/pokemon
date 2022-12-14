# Pokemon Soap Service

pokemon services provides some of the services exposed in pokemon https://pokeapi.co/api/v2/ as Soap Enpoint
## Installation
To consume the services it is necessary to build the project and raise it
build project
```bash
./gradlew build 
./gradlew bootRun
```

## Usage

To consume the service is necesary the use WSDL generated in the next url:

```python
http://localhost:8080/ws/pokemon.wsdl
```
Pokemon services use a H2 DataBase, to view the log service is necesary to acces to H2 console

```python
http://localhost:8080/h2-console/
user: sa
password: password
```
