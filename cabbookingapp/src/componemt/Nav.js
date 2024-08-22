import React , {useState} from "react";
import { Nav,NavItem,Dropdown,DropdownItem,DropdownToggle,DropdownMenu,NavLink } from "reactstrap";
import "./Nav.css";
import { Link } from "react-router-dom";

const NavBar = () => {
    return(
        <Nav className="Nav">
  <NavItem>
    <NavLink>
        Book Your Cab
     </NavLink>
  </NavItem>
  <NavItem >
    <Link to="/" className="nav-link">HOME</Link>
  </NavItem>
  <NavItem>
    {/* <NavLink href="./Login.js">
      LOGIN
    </NavLink> */}
     <Link to="/login" className="nav-link">LOGIN</Link>
  </NavItem>
  <NavItem>
    {/* <NavLink href="#">
      REGISTER
    </NavLink> */}
    <Link to="/register" className="nav-link">REGISTER</Link>
  </NavItem>
</Nav>
    )
}

export default NavBar;