import React from "react";
import './Navbar.css';
// import { useDispatch, useSelector } from "react-redux";
// import { logout, selectUser } from "../Features/userSlice";
// import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
import{CgProfile} from "react-icons/cg";
import {IoMdNotificationsOutline} from "react-icons/io";

function Navbar(){
  
  return(

    <nav className="navbar">
    <ul className="navbar__list">
    <div id="nav">
       <div id="title">
        <a id="logo">FITNESS</a>
    </div>
     </div>
     <div id="item">
      {/* <Link to="/login" style={{textDecoration:"none"}}> */}
      <Link to="/client">
      <li className="navbar__item">
              
      Home
      </li></Link>
      {/* </Link> */}
      <Link to="/profile">
      <li className="navbar__item">
      Profile
      </li>
      </Link>
      <Link to="/About">
      <li className="navbar__item">
      About Us
      </li>
      </Link>
        <Link to="/product">
      <li className="navbar__item">
      Products
      </li>
      </Link>
      <Link to="/feedback">
      <li className="navbar__item">
      Feedback
      </li>
      </Link>
      {/* <Link to="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIfmGpSbKdc9ksZXnB1WLRqA1YJ9yIw00IvIJkxgriqwX7dUcjlfU3l47t4MCZ8WIcdzg&usqp=CAU" style={{textDecoration:"none"}}>
      <li className="navbar__item">
      Diet Plans
      </li>
      </Link> */}
      </div>
      <div id="last">
      <Link to="/notifications" style={{textDecoration:"none"}}>
      <li className="navbar__item">
    
      </li>
      </Link>
      <li className="navbar__item" id="profile">
        
      </li>
      {/* <li className="navbar__item">
      {name}
      </li> */}
      </div>
    </ul>
      <div className="pic"></div>
  </nav>

    
  )
}
export default Navbar;