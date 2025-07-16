
---

# Profile Service

## **Overview**

A **Spring Boot** microservice for profile management that requires **User Service** to be running first. This service:

- Depends on User Service's SOAP endpoint
- Requires valid user records before creating profiles
- expose a **REST API** (documented via Swagger UI)


---

## **Prerequisites**
Ensure these are installed before proceeding:

| Requirement | Purpose                                                                 |  
|----------|-------------------------------------------------------------------------|  
| **Maven** | Builds the project and manages dependencies                            |  
| **Docker** | Runs the PostgreSQL database container                                  |  
| **JDK/JRE 17** | Required to compile and run the application                            |  
| **Git**  | For cloning the repository         |  

---

## **Steps to Run the Project**

### **1. Set Up PostgreSQL Container**
Pull the PostgreSQL Alpine image (lightweight)

```
docker pull postgres:17-alpine
```
Run the container
```
docker run --name postgres_profile_service \
  -e POSTGRES_PASSWORD=123456 \
  -e POSTGRES_USER=postgres \
  -e POSTGRES_DB=profile_service \
  -p 5434:5432 \
  -d postgres:17-alpine
```

### **2. Clone the project from github**
```
git clone git@github.com:ashouriali/profile-service.git
```

### **3. Build the Project**
navigate to project directory
```
cd profile-service
```
build using Maven Wrapper (recommended)
```
./mvnw clean -DskipTests -B package
```

**💡 Why `mvnw`?**  
The Maven Wrapper ensures version compatibility—no need to install Maven separately!

### **4. Run the Application**
```
java -jar ./target/profileService-0.0.1-SNAPSHOT.jar \
  --spring.config.location=./src/main/resources/application.properties
```

---

## **Access Endpoints**
| Service               | URL                                         |  
|-----------------------|---------------------------------------------|  
| **REST API (Swagger)** | http://localhost:8081/swagger-ui/index.html |

---
