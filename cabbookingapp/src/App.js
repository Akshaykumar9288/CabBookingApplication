import './App.css';
import Home from './componemt/Home';
import Login from './componemt/Login';
import NavBar from './componemt/Nav';
import Register from './componemt/register';
import Dashboard from './componemt/dashboard';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Protected from './Services/Protected';
import { useEffect, useState } from 'react';
import BookCab from './componemt/BookCab';

function App() {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('token');
    setIsAuthenticated(!!token);
  }, []);
  return (
    <Router>
            { !isAuthenticated && <NavBar />}
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/login" element={<Login />} />
                <Route path="/register" element={<Register/>}/>
                <Route path="/BookCab" element={<BookCab/>}/>
                <Route path="/dashboard" element={<Protected Component={Dashboard}/>}/>
            </Routes>
        </Router>
  );
}
export default App;
