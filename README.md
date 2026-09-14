CollabSpace: B2B Multi-Tenant Project Management

CollabSpace is a production-grade, multi-tenant Software-as-a-Service (SaaS) application designed to simulate the core infrastructure of enterprise platforms like Jira, Asana, or Linear.

System Description

The core engineering purpose of this project is to master Multi-tenancy, Data Isolation in a Shared Database, Shared Schema Architecture.

CollabSpace allows multiple independent companies (Organizations/Tenants) to manage Projects and Tasks within a single shared PostgreSQL database. It guarantees strict tenant isolation using JWT-based authentication and Spring Boot thread-local request interception, ensuring that data from one organization can never bleed into another.

Core Features

Multi-Tenancy: Secure data isolation using account_no (Tenant ID).

Identity & Access Management: Separation of global identity (Users) from tenant-specific authorization (Memberships & Roles).

Core Business Logic: CRUD operations for Projects and Tasks, strictly scoped to the user's active tenant context.

Tech Stack

Frontend: React, TypeScript, Tailwind CSS

Backend: Java 17+, Spring Boot, Spring Security, Hibernate/JPA

Database: PostgreSQL

Security: Stateless JWT (JSON Web Tokens)

Project Structure

This repository is structured as a monorepo containing both the client and server applications.

collabspace/
├── backend/                   # Java Spring Boot API
│   ├── src/main/java/.../
│   │   ├── config/            # Security & Interceptor configs
│   │   ├── controllers/       # REST API Endpoints
│   │   ├── models/            # JPA Entities (User, Organization, Project, Task)
│   │   ├── repositories/      # Database Access Layer
│   │   ├── security/          # JWT Filtering & ThreadLocal Context
│   │   └── services/          # Business Logic
│   └── pom.xml                # Maven Dependencies
│
├── frontend/                  # React Client
│   ├── src/
│   │   ├── components/        # Reusable UI components
│   │   ├── context/           # React Context (Auth & Active Tenant state)
│   │   ├── pages/             # Route-level components (Dashboard, Login)
│   │   └── services/          # Axios HTTP clients & API calls
│   └── package.json           # NPM Dependencies
│
├── db-migrations/             # SQL scripts for database schema
│   ├── V1__Create_Core_Tables.sql
│   └── V2__Create_Project_Task_Tables.sql
│
└── README.md

