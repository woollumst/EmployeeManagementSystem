const API_URL = "http://localhost:8080/Employee";

export const fetchEmployees = async () => {
  const response = await fetch('${API_URL}');
  if (!response.ok) {
    throw new Error('Failed to fetch Employees: ${response.statusText}');
  }
  return response.json();
};