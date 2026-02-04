# 🎓VisaEdu – Educational Programs & Student Applications Platform  
*(JavaEE · Spring Boot Microservices · MongoDB Atlas)*

VisaEdu is a centralized educational platform that connects **students**, **partner universities**, and **administrators** through a complete online application workflow.

The platform allows students to explore international study programs, submit applications digitally, and track their admission progress in real time.

---

## Project Description

VisaEdu acts as an intermediary portal between universities and students by providing:

✅ Public access to academic programs  
✅ Online student application submission  
✅ Administrative dashboards for program and application management  
✅ REST APIs powered by Spring Boot microservices  

The project follows a modern architecture combining **JavaEE Web Development** with **Spring Boot API-based services**.

---
## Project Architecture (MVC Pattern)

VisaEdu is built following the **MVC (Model–View–Controller)** design pattern to ensure a clean separation of concerns:

- **Model**: Data layer using DAO classes and MongoDB Atlas  
- **View**: JSP pages + JSTL + TailwindCSS for UI rendering  
- **Controller**: Java Servlets handling routing, requests, and business logic  

This architecture improves maintainability, scalability, and code organization.
---

## Key Features

---

### Student Dashboard

Students can:

- Browse available educational programs  
- View detailed program information (curriculum, requirements, opportunities)  
- Apply online with documents and motivation letters  
- Track application status:

  - Under Review  
  - Accepted  
  - Rejected  

---

### Admin Dashboard

Admins can manage the full platform:

- Programs management (CRUD operations)  
- University partner management  
- Student accounts monitoring  
- Review submitted applications  
- Statistics & platform performance tracking  

---

### Maps & University Location Integration

VisaEdu includes an interactive **Map Page** using a Maps API (Google Maps) that allows:

- Displaying university locations visually  
- Helping students explore universities geographically  
- Enhancing the overall user experience

---

## Application Workflow System

The platform supports a complete application process:

- Motivation letter submission  
- Upload of supporting documents (CV, IELTS certificate, transcripts…)  
- Timeline-based application tracking stored in **MongoDB Atlas**  

Each student application is recorded with its status history for transparency and monitoring.

---

## Spring Boot REST APIs & Microservices Architecture

VisaEdu provides several independent Spring Boot microservices, ensuring scalability and modular development:

### 🔹 Programs Microservice
Handles all academic program operations:

- List programs  
- Program details  
- Create/update/delete programs  

### 🔹 Universities Microservice
Manages partner universities and their published programs.

### 🔹 Applications Microservice
Processes all student submissions:

- New application requests  
- Status updates (Accepted/Rejected)  
- Document storage references  

---

### API Testing with Postman

All APIs were tested and validated using **Postman**, including:

✅ GET requests for program listings  
✅ POST requests for student applications  
✅ PUT updates for application status  
✅ Full microservice endpoint verification  

---

## Technology Stack

| Layer | Technology |
|------|------------|
| Frontend | JSP + JSTL + TailwindCSS |
| Backend | JavaEE (Servlets, DAO Pattern) |
| Microservices | Spring Boot REST APIs |
| Database | MongoDB Atlas |
| API Testing | Postman |
| Tools | Maven · Git · GitHub |

---


---

## Demo Video

A full demonstration of the platform is available here:

▶️ **VisaEdu Walkthrough Video**  
Click to watch:


---

## Future Improvements

- Authentication with JWT  
- Email notifications for application updates  
- Docker deployment for microservices  
- Advanced admin analytics dashboard  

---
