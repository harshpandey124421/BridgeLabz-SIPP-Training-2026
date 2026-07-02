-- Subtopic: DDL - Create COVID Database Schema
CREATE DATABASE covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population BIGINT
);

CREATE TABLE covid_deaths (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100),
    Date DATE,
    Total_Deaths INT
);

CREATE TABLE covid_vaccines (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Country VARCHAR(100),
    Date DATE,
    Total_Vaccinated INT
);
