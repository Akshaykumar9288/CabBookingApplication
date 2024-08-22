import React, { useState } from "react";
import { Nav,NavItem,Dropdown,DropdownItem,DropdownToggle,DropdownMenu,NavLink } from "reactstrap";
import "./Nav.css";
import { Link, useNavigate } from "react-router-dom";
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Protected from "../Services/Protected";
import "./DashBoard.css";
import { hover } from "@testing-library/user-event/dist/hover";

const Dashboard = () =>{
  console.log("dashBoard")
  const [logout, setLogout] = useState('');
  const navigate = useNavigate();

  const handleLogout = () =>{
    localStorage.removeItem('token');
    setLogout(true);
    navigate('/login')
  }

  const handleBookCab = () =>{
    navigate('/bookcab')
  }

    return(
      <nav>
      <div className="side-nav-bar">
        <div className="title">BOOK YOUR CAB</div>
          <div className="LOGO">
            <div className="image"></div>
            <div className="Group1"> Akshay</div>
            <div className="menu-dots">⋮</div>
          </div>
         <div className="BOOKCAB" onClick={handleBookCab}>BOOK CAB</div> 
         <div className=""></div>
         <div className="LOGOUT" onClick={handleLogout}>LOGOUT</div>
         <div className="Footer">
          <footer className="footers">
            <p>&copy;</p>
             <p>2024 Akshay Kumar.</p>
             <p> All rights reseverd</p>
            <p>Need Help? Contect us</p>
          </footer>
         </div>
      </div>
      </nav>
     
      )
}
export default Dashboard;