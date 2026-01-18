# Talent Pipeline

Talent Pipeline is a **full-stack Applicant Tracking System (ATS)** built to explore
how hiring platforms can be designed with **clear workflows, transparency, and clean system boundaries**.

This repository contains:
- A **microservices-based backend**
- A **React frontend UI**
- A **relational database schema**

The focus is on **system design and structure**, not just feature completeness.

---

## What This Project Covers

- Backend-first design with independent services
- Clear separation of concerns between frontend and backend

---


## Backend Overview

The backend is designed as **independent microservices**, each owning its data and logic.

Key principles:
- Each service owns its database
- No shared persistence or foreign keys
- Services communicate using IDs only
- Controllers are thin, services hold business logic
- DTOs at all boundaries
- Centralized exception handling

### Services
- **Auth Service** – Authentication and identity (JWT)
- **Candidate Profile Service** – Candidate data management
- **Recruiter Profile Service** – Recruiter and company data
- **Job Service** – Job postings and lifecycle
- **Application Service** – Immutable job application records
- **Pipeline Service** – Application stage transitions with full audit history

---

## Frontend Overview

The frontend is built using **React** and focuses on:
- Clean layout and component structure
- Recruiter and candidate-facing workflows
- Product-style landing and dashboard UI

Status:
- UI implemented
- Backend integration in progress

Frontend source code lives in `/frontend`.

---

## Tech Stack

**Frontend**
- React
- HTML, CSS, JavaScript, Tailwind

**Backend**
- Java (Spring Boot)

**Database**
- MySQL

**Version Control**
- Git & GitHub

---

## Project Status

Work in progress.

Each backend service is implemented independently.
Frontend–backend integration is ongoing.

---
