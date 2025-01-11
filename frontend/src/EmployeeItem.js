function EmployeeItem({ employee, onDelete }) {
  return (
    <li> //Unfinished
      {employee.name} <button onClick={() => onDelete(employee.id)}>Delete</button>
    </li>
  );
}

export default EmployeeItem;