import React from 'react';
import './Navbar.css';
import { Link } from "react-router-dom";



export default function 
() {
  return (
    <div>
        <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
  <div className="container-fluid">
    <Link className="navbar-brand" to="/">
   
      Student Management System</Link>
    
  </div>
</nav>
    </div>
  )
}

