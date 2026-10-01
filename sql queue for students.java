-- Create Students table
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    roll_no INT,
    name VARCHAR(50) NOT NULL,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(200)
);

-- Insert three records
INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(1, 101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore');

INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(2, 102, 'Priya', 21, '2005-08-20', 'priya@gmail.com', '9876543211', 'Chennai');

INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(3, 103, 'Arun', 19, '2007-01-10', 'arun@gmail.com', '9876543212', 'Hyderabad');

-- Display the records
SELECT * FROM students;

Table structure
Column	Data type	Constraint
student_id	INT	Primary Key
roll_no	INT	—
name	VARCHAR(50)	NOT NULL
age	INT	—
date_of_birth	DATE	—
email_id	VARCHAR(100)	NOT NULL, UNIQUE
phone_number	VARCHAR(15)	NOT NULL
address	VARCHAR(200)	—

The key constraints are:

student_id INT PRIMARY KEY
name VARCHAR(50) NOT NULL
email_id VARCHAR(100) NOT NULL UNIQUE
phone_number VARCHAR(15) NOT NULL


If your question specifically requires all four fields (student_id, name, email_id, phone_number) to form a composite primary key, that can be written differently using PRIMARY KEY (student_id, name, email_id, phone_number).
