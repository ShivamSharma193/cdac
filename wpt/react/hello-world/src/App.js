import logo from './logo.svg';
import './App.css';
// When Greet is default export
//import Greet from "./components/Greet" ;

// When Greet is a named export
import {Greet} from "./components/Greet" ;
import Welcome from "./components/Welcome" ;
import GreetName from './components/GreetName';




function App() {
  return (
    <div className="App">
        <Greet> 
          <p> This is a child prop</p>
        </Greet>
        <Welcome />
        <GreetName name="Bruce" heroName="Batman">
          <button> Action</button>
         </GreetName>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
    </div>
  );
}

export default App;
