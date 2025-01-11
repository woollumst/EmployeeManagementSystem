import React, { useEffect, useState } from 'react';

function EmployeeList() {
  const [employees, setEmployees] = useState([]);

  // Fetch employees when the component loads
  useEffect(() => {
    fetch('localhost:8080/employee') // Java Spring API URL??
      .then((response) => response.json())
      .then((data) => setEmployees(data))
      .catch((error) => console.error('Error fetching employees:', error));
  }, []); // Empty dependency array = runs only once

  return (
    <div>
      <h2>Employee List</h2>
      <ul>
        {employees.map(emp => (
          <li key={emp.id}>{emp.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default EmployeeList;