import React, { useEffect, useState } from "react";
import axios from "axios";
import "./components/information.css";

function App() {
  const [enteredFirstName, setEnteredFirstName] = useState("");
  const [enteredLastName, setEnteredLastName] = useState("");
  const [enteredPhoneNumber, setEnteredPhoneNumber] = useState("");
  const [enteredEmail, setEnteredEmail] = useState("");

  const firstNameChangeHandler = (event) => {
    setEnteredFirstName(event.target.value);
  };

  const lastNameChangeHandler = (event) => {
    setEnteredLastName(event.target.value);
  };
  const phoneNumberChangeHandler = (event) => {
    setEnteredPhoneNumber(event.target.value);
  };
  const emailChangeHandler = (event) => {
    setEnteredEmail(event.target.value);
  };

  const clickHandlerSaveData = (event) => {
    event.preventDefault();

    const data = {
      firstName: enteredFirstName,
      lastName: enteredLastName,
      phoneNumber: enteredPhoneNumber,
      email: enteredEmail,
    };

    console.log(data);

    axios
      .post("http://localhost:8080/custom", data)

      .then(function (response) {
        console.log(response.data);
      })

      .catch(function (error) {
        console.log(error);
      });
  };

  return (
    <div>
      <h2>Please type in your data</h2>
      
      <div className="information">
        <label className="information__description">Enter First Name</label>
        <input
          type="text"
          value={enteredFirstName}
          onChange={firstNameChangeHandler}
        />
      </div>

      <div className="information">
        <label className="information__description">Enter Last Name</label>
        <input
          type="text"
          value={enteredLastName}
          onChange={lastNameChangeHandler}
        />
      </div>
      <div className="information">
        <label className="information__description">Enter Phone Number</label>
        <input
          type="text"
          value={enteredPhoneNumber}
          onChange={phoneNumberChangeHandler}
        />
      </div>
      <div className="information">
        <label className="information__description"> e-mail</label>
        <input type="text" value={enteredEmail} onChange={emailChangeHandler} />
      </div>

      <button className="information_button" onClick={clickHandlerSaveData}>
        {" "}
        Save{" "}
      </button>
    </div>
  );
}

export default App;
