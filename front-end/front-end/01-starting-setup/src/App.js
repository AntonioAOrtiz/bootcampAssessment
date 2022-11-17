import Email from "./components/email";
import FirstName from "./components/firstName";
import Information from "./components/information";
import LastName from "./components/lastName";
import PhoneNumber from "./components/phoneNumber";
import React, { useEffect, useState } from "react";
import axios from 'axios';
import "./components/information.css"



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

    const data = { firstName: enteredFirstName, lastName: enteredLastName, phoneNumber: enteredPhoneNumber, email: enteredEmail};

    console.log(data);

axios
.post("http://localhost:8080/customs", data)

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
      <label>ID: provided by backend</label>
      <FirstName value = {enteredFirstName} onChange = {firstNameChangeHandler}> </FirstName>
      <LastName value = {enteredLastName} onChange = {lastNameChangeHandler}></LastName>
      <PhoneNumber value = {enteredPhoneNumber} onChange = {phoneNumberChangeHandler}></PhoneNumber>
      <Email value = {enteredEmail} onChange = {emailChangeHandler}></Email>
      <button className="information_button" onClick={clickHandlerSaveData}> Save </button>
    </div>
  );
}

export default App;
