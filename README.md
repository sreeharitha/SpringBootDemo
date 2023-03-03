# SpringBootDemo
Spring boot demo project summary/key points:-
1) Create a Spring boot project by Spring initalizer or STS
2) Add dependencies springboot dev tools,Spring boot actuator,spring data jpa,spring web,mysql driver
3) Create Controller, Service and Model classes and Repository Interface
4) Write the model class 
Add @Entity,@Table,@Id and @Column annotations respectively to map with the database columns.
5) Write the Repository interface 
declare Repository annotation
Extend JPA repository

6) Write Service Class
Create a repo class object and autowire it.
Fetching the records ---> findAll()
Fetching the record by ID ---> findById(id)
add a record ---> save(s)
update a record ---> save(s)
delete a record using ID ---> delete(id)

7) Write Controller class
declare RestController annotation
declare Service class object and autowire it
declare @RequestMapping annotation
For findAll method annotate with @GetMapping returns list of Student class Object
For findbyId method annotate with @GetMapping("/std/{id}") returns Student class Object
For insert method annotate with @PostMapping
For update method annotate with @PutMapping
For delete method annotate with @DeleteMapping returns void

include @RequestBody if Class object as input.
include @PathVariable if Id as input.

8)Configure Application.properties for database connection
spring.datasource.url=jdbc:mysql://localhost:3306/studentDB?allowPublicKeyRetrieval=true&useSSL=false
spring.datasource.username=root
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update

9)Checking in Postman
localhost:8080/api/std
localhost:8080/api/std/1

#Uploading project in Git hub
Step 1: Create a repository in Git hub and copy the git url
Step 2: In STS search for Git repositories 
Step 3: Give a right click on bottom left corner and click on paste url option.
Step 4: Myproject -> Team -> ShareProject/Commit -> Git staging (move your unstaged files to staging region)-> Commit and push 
Step 5: In case of login failure Generate a token in github (developer settings) and paste token as password.

