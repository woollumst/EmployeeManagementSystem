import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import {fetchEmployees } from './Api.js';

function EmployeeList() {
  const [employees, setEmployees] = useState([]);

  // Fetch employees when the component loads
  useEffect(() => {
    fetchEmployees()
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
    //want to add link to employee items. potential solution?
    // <li key={emp.id}><Link to="/Employee/{emp.id}">{emp.name}</Link></li>
  );
}

export default EmployeeList;