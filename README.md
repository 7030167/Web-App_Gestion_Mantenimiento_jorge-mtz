# 🛠️ Web App de Gestión de Mantenimiento

Este proyecto es una aplicación web desarrollada en Java (Servlets y JSP) con el objetivo de **gestionar tareas de mantenimiento en una línea de producción**, permitiendo registrar anomalías, programar mantenimientos, y asignar tareas al personal técnico.

## 📌 Tabla de Contenidos

- [📚 Descripción](#-descripción)
- [⚙️ Tecnologías Usadas](#-tecnologías-usadas)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🧩 Funcionalidades Principales](#-funcionalidades-principales)
- [📦 Instalación y Ejecución](#-instalación-y-ejecución)
- [📋 Historias de Usuario](#-historias-de-usuario)
- [🧑‍💻 Equipo de Desarrollo](#-equipo-de-desarrollo)

---

## 📚 Descripción

Actualmente, el área de mantenimiento enfrenta problemas para organizar y ejecutar tareas de mantenimiento oportunamente. Esta web app facilita:

- El **registro de anomalías** detectadas por operadores y supervisores.
- La **programación de tareas** para técnicos de mantenimiento.
- La **visualización y seguimiento** de tareas programadas.
- La **generación de reportes** históricos de mantenimiento.

---

## ⚙️ Tecnologías Usadas

- **Lenguaje:** Java 17
- **Framework Web:** Servlets + JSP
- **Base de Datos:** MySQL
- **IDE:** Apache NetBeans 24
- **Servidor:** GlassFish 6.2
- **Frontend:** HTML, CSS (Bootstrap opcional)
- **Control de versiones:** Git + GitHub

---

## 📁 Estructura del Proyecto




---

## 🧩 Funcionalidades Principales

| Funcionalidad                         | Descripción                                                   |
|--------------------------------------|---------------------------------------------------------------|
| Registro de Anomalías                | Operadores y supervisores reportan fallas en la línea         |
| Programación de Mantenimiento        | Técnicos visualizan anomalías y programan tareas              |
| Seguimiento de tareas                | Consultar tareas activas, finalizadas y en progreso           |
| Autenticación de Usuarios            | Acceso controlado por roles: operador, supervisor, técnico    |
| Historial de Mantenimiento           | Visualización de tareas completadas y detalles                |

---

## 📦 Instalación y Ejecución

### 🔧 Requisitos Previos

- Apache NetBeans 24
- JDK 17 o superior
- GlassFish 6.2
- MySQL Server
- Git instalado

### 🛠️ Pasos para correr el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://https://github.com/7030167/Web-App_Gestion_Mantenimiento_jorge-mtz.git

2. Abre el proyecto en NetBeans y configura GlassFish como servidor.
3. Crea la base de datos con el siguiente script:

 CREATE DATABASE gestion_mantenimiento;
USE gestion_mantenimiento;

### - Usuarios

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    nombre VARCHAR(100), 
    rol ENUM('operador', 'supervisor', 'tecnico'),
    correo VARCHAR(100),
    contraseña VARCHAR(100)
    );

### - Anomalías

CREATE TABLE anomalias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    descripcion TEXT,
    fecha DATE,
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
    );

### - Tareas

CREATE TABLE tareas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    descripcion TEXT,
    estado VARCHAR(50),
    fecha_programada DATE,
    id_anomalia INT,
    FOREIGN KEY (id_anomalia) REFERENCES anomalias(id)
    );

  
4. Actualiza la clase Conexion.java con los datos correctos de tu base de datos.
6. Ejecuta el proyecto y accede a http://localhost:8080/gestion-mantenimiento.  



### 📋 Historias de Usuario

HU-01: Como operador, quiero registrar anomalías para que el mantenimiento pueda atenderlas.

HU-02: Como técnico, quiero visualizar las tareas programadas para organizar mi trabajo.

HU-03: Como supervisor, quiero consultar el historial para evaluar incidencias recurrentes.

HU-04: Como sistema, quiero autenticar usuarios y filtrar accesos según su rol.




## 🧑‍💻 Equipo de Desarrollo
Nombre: Jorge Armando Martínez Ponce

Rol: Desarrollador Full Stack / Scrum Master

Proyecto Escolar: Desarrollo Web con Java - 2025
