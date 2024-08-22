import React ,{useState} from "react";
import { useNavigate } from "react-router-dom";
import APISERVICE from "../Services/Helper";
import "./Style.css"
const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setpassword] = useState('');
    const [error, setError] = useState('');
    const navigate = useNavigate();
    const handleSubmit = async (e) => {
        e.preventDefault();
        if(!email || !password){
            setError('Please fill in all fields.');
            setTimeout(() => setError(''), 5000);
            return;
        }
        try{
            const response = await APISERVICE.loginUser({email, password});
            if(response.token){
                localStorage.setItem('token', response.token);
                navigate("/dashboard")
            }else{
                console.error("Invalid credentials " ,response.error);
            }
           
            
        }catch(error){
            if (error.response && error.response.status === 403) {
                alert("Check Your Credentials and Permissions")
                console.error("403 Forbidden - Check your credentials or permissions.");
            } else {
                console.error("Unable to connect with backend!", error.message); 
                console.error("Error details:", error.response || error);
            }   
            throw error;
        }
    }
    return(
        <div className="loginInner"  style={{
            backgroundColor: '#2148C5',
            backgroundImage: 'url(/Image/BG.png)', 
            backgroundSize: 'cover',
            backgroundRepeat: 'no-repeat',
        }}
        >
        <form onSubmit={handleSubmit}>
         <div className="inputWrapper">
             <div className="inputInner">
             <div className="userIcon">
             <img src="./image/user.svg"/>
             </div>
             <input type="text" value={email} placeholder="USERNAME" onChange={(e) => setEmail(e.target.value)}/>
             </div>
         </div>
         <div className="inputWrapper">
         <div className="inputInner">
             <div className="userIcon">
             <img src="./image/lock.svg"/>
             </div>
             <input type="password" value={password} placeholder="PASSWORD" onChange={(e) => setpassword(e.target.value)}/>
             </div>
         </div>
         <div className="inputWrapper">
             <button>Login</button>
         </div> 
         <div className="forgotPassword">
             <p>Forget Password?</p>
         </div>
        </form>
        </div>
    )
}

export default Login;