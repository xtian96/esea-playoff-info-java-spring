import React, { useState, useEffect } from "react";
import logo from "./logo.svg";
import "./App.css";
import axios from "axios";

const Teams = () => {
  const [teams,setTeams] = useState([]);

  const fetchTeams = () => {
    axios.get("http://localhost:8080/api/v1/team").then(res => {
      console.log(res);
      setTeams(res.data);
  });
};

  useEffect(() => {
    fetchTeams();
  }, []);

  return teams.map((team, index) => {
    return (
      <div key={index}>
        <h1>{team.teamName}</h1>
        <p>wins={team.wins}</p>
      </div>
    );
  });
};

function App() {
  return (
    <div className="App">
      <Teams />
    </div>
  );
}

export default App;
