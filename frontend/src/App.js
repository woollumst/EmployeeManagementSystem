//import logo from './logo.svg';
//import './App.css';
import EmployeeList from './EmployeeList.js';
import EmployeeItem from './EmployeeItem.js';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

function Home() { 
    return (
        <h1>Employee Management System</h1>
    );
}

function Dashboard() {
    return ( 
        <div>
          <h2>Dashboard</h2>
          <nav>
            <Link to="/Employee">Employee List</Link>
            <Link to="/">Home</Link>
          </nav>
          <Switch>
            <Route path="/Employee" component={EmployeeList} />
            <Route path="/" exact component={Home} />
            <Route path="/Employee/:id" component={EmployeeItem} />
          </Switch>
        </div>
    );
}

function App() {
  return (
    <Router>
        <Route path="/dashboard" component={Dashboard} />
    </Router>
    /*<div className="App">
      <h1>Employee Management System</h1>
      //components?
      <EmployeeList />
    </div>*/
  );
}

export default App;
