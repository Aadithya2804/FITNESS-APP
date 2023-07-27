// import { useState } from 'react';
// import Login from './login';
 import './form.css';
// export default function Form() {
 
    
//     const [name, setName] = useState('');
//     const [email, setEmail] = useState('');
//     const [password, setPassword] = useState('');
 
    
//     const [submitted, setSubmitted] = useState(false);
//     const [error, setError] = useState(false);
 
   
//     const handleName = (e) => {
//         setName(e.target.value);
//         setSubmitted(false);
//     };
 
    
//     const handleEmail = (e) => {
//         setEmail(e.target.value);
//         setSubmitted(false);
//     };
 
   
//     const handlePassword = (e) => {
//         setPassword(e.target.value);
//         setSubmitted(false);
//     };
 
   
//     const handleSubmit = (e) => {
//         e.preventDefault();
//         if (name === '' || email === '' || password === '') {
//             setError(true);
//         } else {
//             setSubmitted(true);
//             setError(false);
//         }
//     };
 
    
//     const successMessage = () => {
//         return (
//             <div
//                 className="success"
//                 style={{
//                     display: submitted ? '' : 'none',
//                 }}>
//                 <h1>User {name} successfully registered!!</h1>
//             </div>
//         );
//     };
 
  
//     const errorMessage = () => {
//         return (
//             <div
//                 className="error"
//                 style={{
//                     display: error ? '' : 'none',
//                 }}>
//                 <h1>Please enter all the fields</h1>
//             </div>
//         );
//     };
 
//     return (
//         <div className="form">
//             <div>
//                 <h1>User Registration</h1>
//             </div>
 
           
//             <div className="messages">
//                 {errorMessage()}
//                 {successMessage()}
//             </div>
 
//             <form>
//                 <div className="divcl1">
//                 <label className="label">Name</label>
//                 <input onChange={handleName} className="input"
//                     value={name} type="text" />
//  <br></br><br></br>
//                 <label className="label">Email</label>
//                 <input onChange={handleEmail} className="input"
//                     value={email} type="email" />
//  <br></br><br></br>
//                 <label className="label">Password</label>
//                 <input onChange={handlePassword} className="input"
//                     value={password} type="password" />
//  <br></br><br></br>
//                 <button onClick={handleSubmit} className="btn"
//                         type="submit">
//                     Submit
//                 </button>
//                 </div>
//             </form>
//         </div>
//     );
// }
import React, { useState } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
const Register = () => {
  const navigate=new useNavigate();
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    email: '',
    password: '',
    contactNo: '',
    address: '',
  });
  function saveUser()
    {
        axios.post("http://localhost:8080/api/v1/auth/register",
        {
            "name":formData.firstName,
            "email":formData.email,
            "password":formData.password
        }).then((response)=>
        {
          navigate("/login");
          console.log("Successful");
        })
    }
  const [errors, setErrors] = useState({});
    var cons=0;
  const validateForm = () => {
    let isValid = true;
    const newErrors = {};

    // First Name validation
    if (formData.firstName.trim() === '') {
      newErrors.firstName = 'First Name is required';
      isValid = false;
      cons=cons+1;
    }

    // Last Name validation
    if (formData.lastName.trim() === '') {
      newErrors.lastName = 'Last Name is required';
      isValid = false;
      cons=cons+1;
    }

    // Email validation
    const emailPattern = /^\w+([.-]?\w+)@\w+([.-]?\w+)(\.\w{2,3})+$/;
    if (!formData.email.match(emailPattern)) {
      newErrors.email = 'Invalid email address';
      isValid = false;
      cons=cons+1;
    }

    // Password validation
    if (formData.password.length < 6) {
      newErrors.password = 'Password should be at least 6 characters long';
      isValid = false;
      cons=cons+1;
    }

    // Contact No validation
    if (formData.contactNo.trim() === '' ) {
      newErrors.contactNo = 'Invalid Contact Number';
      isValid = false;
      cons=cons+1;
    }

    // Address validation
    if (formData.address.trim() === '') {
      newErrors.address = 'Address is required';
      isValid = false;
      cons=cons+1;
    }

    setErrors(newErrors);
    if(cons==0)
    {
      saveUser();
    }
    return isValid;
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (validateForm()) {
      // Perform registration logic or API call
      console.log('Form submitted successfully!');
    } else {
      console.log('Form validation failed');
    }
  };

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <div className="mainr">
            
    
      <div className="register">
    <form onSubmit={(e) => {handleSubmit(e)}}>

      <h2>Registration </h2>
      <div className="form-row">
        <div className="form-group">
        
        <input
          type="text"
          name="firstName"
          placeholder='First Name'
          value={formData.firstName}
          onChange={handleChange}
        />
        {errors.firstName && <div style={{color:"red" , fontSize:"13px"}}>{errors.firstName}</div>}
      </div>
      <br></br>

      <div className="form-group">
        
        <input
          type="text"
          name="lastName"
          placeholder='Last Name'
          value={formData.lastName}
          onChange={handleChange}
        />
        {errors.lastName && <div style={{color:"red" , fontSize:"13px"}}>{errors.lastName}</div>}
      </div>
      <br></br>
    </div>
      <div className="form-row">
        <div className="form-group">
       
        <input
          type="email"
          name="email"
          placeholder='Email'
          value={formData.email}
          onChange={handleChange}
        />
        {errors.email && <div style={{color:"red" , fontSize:"13px"}}>{errors.email}</div>}
      </div>
      <br></br>

      <div className="form-group">
        
        <input
          type="password"
          name="password"
          placeholder='Password'
          value={formData.password}
          onChange={handleChange}
        />
        {errors.password && <div style={{color:"red" , fontSize:"13px"}}>{errors.password}</div>}
      </div>
      <br></br>
    </div>
      <div className="form-row">
        <div className="form-group">
        
        <input
          type="text"
          name="contactNo"
          placeholder='Mobile No'
          value={formData.contactNo}
          onChange={handleChange}
        />
        {errors.contactNo && <div style={{color:"red" , fontSize:"13px"}}>{errors.contactNo}</div>}
      </div>
      <br></br>
      <div className="form-group">
      
        <input
          type="text"
          name="address"
          placeholder='Address'
          value={formData.address}
          onChange={handleChange}
        />
        {errors.address && <div style={{color:"red" , fontSize:"13px"}}>{errors.address}</div>}
      </div>
      <br></br>
    </div>
      <button onclick= {validateForm}>Register</button>
    </form>
    {/* <p style={{marginLeft:"320px"}}>Don't you have an account? </p> */}
  </div><br></br>
      </div>
  );
};

export default Register;