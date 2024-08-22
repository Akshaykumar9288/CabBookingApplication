import React, { useState, useEffect } from "react";
import Dashboard from "./dashboard";
import "./Booking.css"

const BookCab = () => {
    const [currentTime, setCurrentTime] = useState('');

    useEffect(() => {
        const updateClock = () => {
            const now = new Date();
            const hours = String(now.getHours()).padStart(2, '0');
            const minutes = String(now.getMinutes()).padStart(2, '0');
            const seconds = String(now.getSeconds()).padStart(2, '0');
            const formattedTime = `${hours}:${minutes}:${seconds}`;
            setCurrentTime(formattedTime);
        };
        const intervalId = setInterval(updateClock, 1000);
        updateClock()
        return () => clearInterval(intervalId);
    }, []);
    const [currentdate, setCurrentdate] = useState('');

    useEffect(() => {
        const updatedate = () => {
            const now = new Date();
            const date = String(now.getDate()).padStart(2, '0');
            const month = String(now.getMonth()+1).padStart(2, '0');
            const year = String(now.getFullYear()).padStart(2, '0');
            const formattedDate = `${date}:${month}:${year}`;
            setCurrentdate(formattedDate);
        };
        const intervalId = setInterval(updatedate, 1000);
        updatedate()
        return () => clearInterval(intervalId);
    }, []);
    

    return (
        <div className="containe">
        <Dashboard/>
            <div className="main-content">
            <div className="navbar">
                <h1>Book Your Cab</h1>
                <div className="time"><h6>{currentdate} : {currentTime}</h6></div>
                </div>
                <div className="image">
                    <img src="/Image/Book-taxi-in-Bhopal.jpeg"/>
                    <div className="PickUpLocation">
                        <input type="text" placeholder="PickUpLOcation"/>
                    </div>
                    <div className="DropLOcation">
                        <input type="text" placeholder="DropLOcation"/>
                    </div>
                </div>
               </div>
        </div>
    );
};

export default BookCab;