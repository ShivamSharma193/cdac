import React, { useState, useEffect } from "react";
import { v4 as uuid } from "uuid";
import "./App.css";
import Header from "./components/Header";
import AddBook from "./components/AddBooks";
import BookList from "./components/BookList";

function App() {
  const LOCAL_STORAGE_KEY = "books";
  // State to store contacts
  const [books, setBooks] = useState(
    JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY)) ?? []
  );

  const addBookHandler = (book) => {
    console.log(book);
    setBooks([...books, { id: uuid(), ...book }]);
  };


  // To persist data, should not be lost on refresh
  useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(books));
  }, [books]);

  return (
    <div className="ui container">
      
      <Header />
      <AddBook addBookHandler={addBookHandler} />
      <br></br>
      <BookList books={books} />
    </div>
  );
}

export default App;