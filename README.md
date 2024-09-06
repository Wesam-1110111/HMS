# House Management System (HMS)

Welcome to the House Management System! This project is designed to manage house-related activities such as tenant management, rent tracking, and maintenance scheduling. It is built using Java and follows a modular design for easy scalability.

### Features
- Tenant Management **(Soon)**: Add, edit, and remove tenant details.
- Rent Tracking **(Soon)**: Keep track of rent payments and generate reports.
- Maintenance Scheduling **(Soon)**: Schedule and manage house maintenance tasks.
- User Authentication **(Soon)**: Secure login system for users (e.g., admin, tenants).
- Database Integration **(Soon)**: Store data using a SQL-based database (e.g., MySQL, SQLite).

### Technologies Used
- Java: Core programming language.
- OOP: For objects.
- JDBC: For database connectivity.
- Swing/JavaFX: For building the GUI (mention which one you used).
- MySQL/SQLite: For database management (replace with the actual DB you used).

## Setup and Installation
To run the House Management System locally, follow these steps:

1. Clone the repository:
```bash
git clone git@github.com:Wesam-1110111/HMS.git
```
2. Navigate to the project directory:
```bash
cd HMS
```
3. Install dependencies: Make sure you have Java installed. You can download it [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
4. Set up the database:

Ensure your database (e.g., MySQL or SQLite) is installed.  
Run the SQL scripts provided in the ``database`` folder to create the necessary tables.
5. Compile and run the project: **(Under update...)**

```bash
javac -cp . src/com/hms/Main.java
java -cp . com.hms.Main
```
## Usage
1. Login: Enter the username and password to access the system.
2. Dashboard: Once logged in, you can navigate through different sections:
   - Tenants: Manage tenant information.
   - Rent: View and manage rent payments.
   - Maintenance: Schedule and track house maintenance tasks.
3. Logout: Securely log out after using the system.
