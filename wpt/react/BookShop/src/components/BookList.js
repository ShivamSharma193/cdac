import React from "react";
import BookCard from "./BookCard";

const BookList = (props) => {

  const renderBookList = props.books.map((book) => {
    return (
              <BookCard
            book={book}
            key={book.id}
          />      
    );
  });
  return (
    <div>
      <table class="table">
        <thead class="thead-dark">
          <tr>
            <th scope="col">ISBN</th>
            <th scope="col">Name</th>
            <th scope="col">Author</th>
            <th scope="col">Price </th>
          </tr>
        </thead>
        <tbody>
          {renderBookList}
        </tbody>  
      </table>
    </div>
  )
};

export default BookList;