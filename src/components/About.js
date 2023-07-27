import React from "react";
import './about.css';
function About(){
    return(
            <div className="element">
             <div className="productco">
                  <div className='ele1'>
                    <div id="ele1img">
                        <p> <br></br>CLIENTS </p>
                        {/* <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKG-lkfw9Gr3slWW2XOPdVC5zKsoANQPFhjg&usqp=CAU" height="200" width="250"></img> */}
                    </div>
                    <div id="ele1content">
                            <br></br>
                            Physique Clients<br></br><br></br>
                            Performance Clients<br></br><br></br>
                            Fat Loss Clients
                            {/* <button id="btn1">GETSTARTED</button>  */}
                            </div>
            
             </div>
             <div className='prod2'>
                <div id="prod2img">
                    <p>TRAINERS</p>
                    {/* <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbFL1RFu9DwfT9jMy0mVsfNgroWgsWsYUQAg&usqp=CAU" height="200" width="250"></img> */}
                </div>
                <div id="prod2content">
                        <br></br>
                        Athletic Trainer<br></br><br></br>
                        Fitness Competition Trainer<br></br><br></br>
                        Personal Trainer

                        

                    {/* <button id="btn2">GET STARTED</button> */}
                        </div>
                        </div>
            </div> 
            </div>
    )

}
export default About;