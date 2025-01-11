import {getEmployee} from './Api.js';

function EmployeeItem({employeeID}) {
  return (
    {id, name, phone, salary, address} = getEmployee({employeeID});
    <div>
      <h2>Name: {name}</h2>
      <p>ID: {id}</p>
      <p>Phone: {phone}</p>
      <p>Salary: {salary}</p>
      <p>Address: {address}</p>
      <button>Delete Employee(TODO)</button>
    </div>
  );
}

export default EmployeeItem;