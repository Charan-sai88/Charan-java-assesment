CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) UNIQUE,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(200)
);

INSERT INTO students
(student_id, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore');

INSERT INTO students
(student_id, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(102, 'Priya', 21, '2005-08-20', 'priya@gmail.com', '9876543211', 'Chennai');

INSERT INTO students
(student_id, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(103, 'Arjun', 19, '2007-02-10', 'arjun@gmail.com', '9876543212', 'Hyderabad');
