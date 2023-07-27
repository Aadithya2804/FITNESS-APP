import './profile.css';
import { Link } from 'react-router-dom';
import { useState } from 'react';
import { useSelector } from 'react-redux';

function Profile()
{
    const user=useSelector((state) => state.user);
    const[name,setName]=useState("AADITHYA J");
const[email,setEmail]=useState("aadthiya2003@gmail.com");
const[contact,setContact]=useState("9876543219");
const[address,setAddress]=useState("ABC COLONY");

    return(
        <div className="wholeprofile">
                    <div id="profpic">
                        <div id="temppic">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRS-bz3w3YbiCPW23zQNWR0sjH7WNZFmCV_6Q&usqp=CAU" height="300px" width="300px"></img>
                    </div></div>
            <div className="profbox">
                <div className="profcontent">
                    <div id="profname">
                        <h4>Name: {name}</h4>
                    </div>
                    <div id="profcontact">
                        <h4>Contact : {contact}</h4>
                    </div>
                    <div id="profemail">
                        <h4>Email: {user.email}</h4>
                    </div>
                    <div id="profaddress">
                        <h4>Address: {address}</h4>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Profile;