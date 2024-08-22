import axios from "axios";

export default class APISERVICE{
    static  BASE_URL = 'http://localhost:8080';

    static getHeader(){
        const token = localStorage.getItem("token");
        return{
            Authorization: `Bearer ${token}`,
            "Content-Type": "application/json"
        }
    }

    static async registerUser(registeration){
        const response = await axios.post(`${this.BASE_URL}/user/registration`,registeration);
        return response.data
    }

    static async loginUser(loginDetails){
        try{
        console.log("Unable to connect with server 1")
        const response =  await axios.post(`${this.BASE_URL}/user/login`,loginDetails);
        console.log("Unable to connect with server 2")
        return response.data;
        }catch(error){
            console.error(error);
        }
    }

    static async dashBoard(Dashboard){
        
        const response = await axios.post(`${this.BASE_URL}/user/DashBoard`,Dashboard);
        return response.data;
        
        }

    static isAuthenticated(){
        const token = localStorage.getItem('token')
        return !!token;
    }

}

// export const BASE_URL = 'http://localhost:8080';


// export const myAxios = axios.create({baseURL:BASE_URL});

// myAxios.interceptors.request.use((config)=>{
//     const token = localStorage.getItem('token');
//     if(token){
//         config.headers['Authorization'] = `Bearer ${token}`
//     }
//     return config;
// },(error)=>{
//     return Promise.reject("Error is ", error);
// })

