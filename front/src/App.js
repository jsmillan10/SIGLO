import React from 'react';
import logo from './logo.svg';
import './App.css';
import Ejemplo from './components/Ejemplo'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          SIGLO en construcción.
        </p>
        <a
          className="Link Eurolabs"
          href="http://www.ealaboratorios.com/"
        >
          Visitanos mientras tanto.
        </a>
      </header>
      <br/><br/><br/>
      <Ejemplo />
    </div>
  );
}

export default App;
