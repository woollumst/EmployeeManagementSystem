const API_URL = "http://localhost:8080/Employee";

export const fetchEmployees = async () => {
  const response = await fetch('${API_URL}');
  if (!response.ok) {
    throw new Error('Failed to fetch Employees: ${response.statusText}');
  }
  return response.json();
};

// Add a new employee
export const addEmployee = async (employee) => {
  const response = await fetch(`${API_URL}`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(employee),
  });
  if (!response.ok) {
    throw new Error(`Failed to add employee: ${response.statusText}`);
  }
  return response.json();
};

// Delete an employee by ID
export const deleteEmployee = async (id) => {
  const response = await fetch(`${API_URL}/${id}`, {
    method: "DELETE",
  });
  if (!response.ok) {
    throw new Error(`Failed to delete employee: ${response.statusText}`);
  }
};

// Get an employee by ID ?do i need this?
export const getEmployee = async (id) => {
  const response = await fetch('${API_URL}/${id}');
  if (!response.ok) {
    throw new Error(`Failed to get employee: ${response.statusText}`);
  }
  return response.json();
}

// Update an employee by ID
export const updateEmployee = async (id, employee) => {
  const response = await fetch(`${API_URL}/${id}`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(employee),
  });
  if (!response.ok) {
    throw new Error(`Failed to update employee: ${response.statusText}`);
  }
  return response.json();
};