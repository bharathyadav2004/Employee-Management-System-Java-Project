# Employee Management System

## Overview

This Java program is a Employee Management System that retrieves and displays employee information based on their employee number (empNo). The program calculates the employee's salary by considering various components such as basic pay, HRA (House Rent Allowance), and deductions (IT).

## Features

- Retrieve employee details using their employee number.
- Calculate total salary based on:
  - Basic Pay
  - House Rent Allowance (HRA)
  - Dearness Allowance (DA)
  - Income Tax (IT)
- Display employee information, including:
  - Employee Number
  - Employee Name
  - Department
  - Designation
  - Salary

## Data Structure

The program uses the following static arrays to store employee data:

- `empNo`: Employee numbers
- `empName`: Employee names
- `joinDate`: Joining dates
- `designationCode`: Codes for designations
- `department`: Departments
- `basic`: Basic salaries
- `hra`: House Rent Allowances
- `it`: Income Taxes

The designation table is as follows:

- `desigCode`: Designation codes
- `desigName`: Designation names
- `da`: Dearness Allowances

## Methods

- `getDesignation(String code)`: Returns the designation name based on the designation code.
- `getDA(String code)`: Returns the DA based on the designation code.
- `calculateSalary(double basic, double hra, double it, String desigCode)`: Calculates the total salary based on the inputs.

## Usage

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Compilation

To compile the program, open a terminal and navigate to the directory containing the `project.java` file. Run the following command:

```bash
javac project.java
