create table employee (
      employeeId integer not null AUTO_INCREMENT,
      employeeName varchar(255) not null,
      employeeDepartment varchar(255) not null,
      employeeDesignation varchar(255) not null,
      employeeSalary integer not null,
      primary key(employeeId)
);

INSERT INTO EMPLOYEE( employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary) VALUES(1, 'john', 'cs', 'hod',100000);
INSERT INTO EMPLOYEE( employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary) VALUES(2, 'sarah','cs', 'ahod',80000);
INSERT INTO EMPLOYEE( employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary) VALUES(3, 'jane', 'ec', 'hod',100000);
INSERT INTO EMPLOYEE( employeeId, employeeName, employeeDepartment, employeeDesignation, employeeSalary) VALUES(4, 'raj', 'cs', 'tutor',50000);