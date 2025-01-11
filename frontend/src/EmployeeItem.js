import {getEmployee} from './Api.js';
import { useParams } from 'react-router-dom';

function EmployeeItem() {
  const { employeeID } = useParams();
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