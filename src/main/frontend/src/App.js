import React, { useState, useEffect } from 'react';
import './App.css';
import axios from 'axios';

const UserProfiles = () => {
  const fetchUserProfiles = () => {
    axios.get("http://localhost:1111/api/v1/user-profile").then(res => {
      console.log(res);
    });
  }
  useEffect(() => {
    fetchUserProfiles();
  }, []);
  return <h1>Jade</h1>
}

function App() {
  return (
    <div className="App">
      <UserProfiles/>
    </div>
  );
}

export default App;
