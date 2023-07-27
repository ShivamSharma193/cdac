import React, { useState, useEffect } from "react";
import logo from './logo.svg';
import './App.css';
import { v4 as uuid } from "uuid";
import AddTask from "./components/AddTask" ;
import TaskList from "./components/TaskList";
import TempList from "./components/testList"
function App() {
  // Store tasks in local storage
  const LOCAL_STORAGE_KEY ="tasks" ;
  
  // Retreive data from local storage
  const [tasks, setTasks] = useState(
    JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY)) ?? []
  ) ;

  const addTaskHandler =(task)=>{
    setTasks([...tasks,{id: uuid(), ...task }]) ;
  } ;


  const removeTaskHandler = (id) => {
    const newTaskList = tasks.filter((task) => {
      return task.id !== id;
    });
    setTasks(newTaskList);
  };

  // To persist data, should not be lost on refresh
  useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(tasks));
  }, [tasks]);


  return (
    <div className="App">
      <AddTask addTaskHandler={addTaskHandler}/>
      <TaskList tasks={tasks} getTaskId={removeTaskHandler}/> 
    </div>
  );
}

export default App;
