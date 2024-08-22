import React, { useEffect } from "react";
import { Navigate, NavLink, useLocation, useNavigate } from "react-router-dom";
import checkTokenValidity from "../componemt/CheckTokenValidity";
import Dashboard from "../componemt/dashboard";

const Protected = ({ Component }) => {
    const navigate = useNavigate();
    const isAuthenticated = localStorage.getItem("token");
    useEffect(() => {
        const token = localStorage.getItem("token");
        if (token && !checkTokenValidity()) {
            localStorage.removeItem('token');
            navigate('/login'); 
        }
    }, [navigate]);
    return isAuthenticated ? <Dashboard/> : <Navigate to="/login" />;
   };
export default Protected;


