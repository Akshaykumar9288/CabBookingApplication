import React from "react";
import { jwtDecode } from "jwt-decode";


const checkTokenValidity = () =>{
    const token = localStorage.getItem('token');
    if(!token){
        return false;
    }

    try{
        const decodeToken = jwtDecode(token);
        const currentTime = Date.now()/1000;
        if(decodeToken.exp < currentTime){
            return false;
        }
        return true;
    }catch(error){
        return error;
    }
}

export default checkTokenValidity;