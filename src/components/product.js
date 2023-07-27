import './product.css';




function Product(){
    return(
        <div className="entire">
         <div className="productcontainer">
              <div className='prod1'>
                <div id="prod1img">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKG-lkfw9Gr3slWW2XOPdVC5zKsoANQPFhjg&usqp=CAU" height="200" width="250"></img>
                </div>
                <div id="prod1content">
                        <br></br>
                        Twins Blue Heavy Bearing Skipping Rope
                        <br></br>PRICE ₹350
                        <button id="btn1">GETSTARTED</button> 
                        </div>
                {/* <button>GETSTART</button>         */}

              </div>
              <div className='prod2'>
                <div id="prod2img">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbFL1RFu9DwfT9jMy0mVsfNgroWgsWsYUQAg&usqp=CAU" height="200" width="250"></img>
                </div>
                <div id="prod2content">
                        <br></br>
                        Bodyfit Home Gym Set (8kg -60kg) Exercise Weight Plates +1 Connector Rod, 2 x Dumbbell Rods,
                         for Home Workouts
                        <br></br>
                    <br></br>PRICE ₹790
                    <button id="btn2">GET STARTED</button>
                        </div>
              </div>
              <div className='prod3'>
                <div id="prod3img">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2K6Lcf8AtaHZK8osfzl8CP1f60Rrv-EnQhA&usqp=CAU" height="200" width="250"></img>
                </div>
                <div id="prod3content">
                        <br></br>
                        Reach your fitness goals in the comfort of your home. Get the benefit of medical and commercial 
                        grade product design, built for home use
                        <br></br>PRICE ₹ 12999
                        <button id="btn3"> GET STARTED</button>
                        
                        </div>
              </div>
         </div>
        </div>
    )
}

export default Product;
