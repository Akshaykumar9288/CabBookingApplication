import React from "react";
import "./Nav.css"


const Home = () => {
    console.log("Home is here")
    return(
        <div className="home">
           <img src={require("./taxi-pictures.jpg")} alt="Car_image" className="full-screen"></img>
        </div>
    )
}

export default Home;