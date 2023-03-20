import React from 'react';
import './Navbar.css';
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <Link className="navbar-brand mx-auto" to="/">
          
           <p> Student Management System</p>
           <p>General Sir John Kotelawala Defence University</p>
          </Link>
        
        </div>
      </nav>
    </div>
  );
}






