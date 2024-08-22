import React ,{useState} from "react";
import { Form,Fade,FormFeedback,FormGroup,FormText,Input,Label,Button, Container, Row, Col, Card, CardBody, CardTitle } from "reactstrap";
import APISERVICE from "../Services/Helper";
import "./Style.css"
const Register = () =>{
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
        if(!name || !email || !password){
          alert("Please fill all the fields");
          return;
        }
        try {
            const response = await APISERVICE.registerUser({ name, email, password });
            alert("Registration Succesfull",response)
        } catch (error) {
            alert("Registration Fail",error)
        }
    };
    return(
      <div className="loginInner"  style={{
        backgroundColor: '#2148C5',
        backgroundImage: 'url(/Image/BG.png)',  // Accessing the image from the public directory
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat',
    }}>
      <form onSubmit={handleSubmit}>
       <div className="inputWrapper">
           <div className="inputInner">
           <div className="userIcon">
           </div>
           <input type="text" value={name} placeholder="USERNAME" onChange={(e) => setName(e.target.value)}/>
           </div>
       </div>
       <div className="inputWrapper">
           <div className="inputInner">
           <div className="userIcon">
           </div>
           <input type="text" value={email} placeholder="EMAIL" onChange={(e) => setEmail(e.target.value)}/>
           </div>
       </div>
       <div className="inputWrapper">
       <div className="inputInner">
           <div className="userIcon">
           </div>
           <input type="password" value={password} placeholder="PASSWORD" onChange={(e) => setPassword(e.target.value)}/>
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
    );
}

export default Register;