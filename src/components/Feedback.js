import React, { useState } from 'react';
import axios from 'axios';
import './Feedback.css';

const FeedbackForm = () => {
  const [email, setEmail] = useState('');
  const [feedback, setFeedback] = useState('');
  const [feedbck, setFeedbck] = useState([]);

  
  const isValid = true;
    // Replace 'YOUR_API_ENDPOINT' with the actual endpoint of your API
    const handleSubmit = (e) => {
        // e.preventDefault();
        // validate();
        
          axios
            .post("http://192.168.130.165:8082/api/v1/feed/addFeedback", {
              email: email,
              feedback: feedback,
            })
            .then((response) => {
              console.log("feedback add response");
              console.log(response.data);
              // Update the feedback list with the new feedback
              setFeedbck([...feedback, { email: email, feedback: feedback }]);
            })
            .catch((error) => {
              console.log("error: ", error);
            });
          // handleClear();
        };

  return (
    <form onSubmit={handleSubmit} className='feedback'>
      <div>
        <label>Email:</label>
        <input
          type="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />
      </div>
      <div>
        <label>Feedback:</label>
        <textarea
          value={feedback}
          onChange={(e) => setFeedback(e.target.value)}
          required
        />
      </div>
      <button type="submit">Submit</button>
    </form>
  );
};

export default FeedbackForm;
