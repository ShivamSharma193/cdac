import React from "react";

const BookCard = (props) => {
  const { id, isbn, name, author, price } = props.book;
  return (
    <tr>
    <td>{isbn}</td>
    <td>{name}</td>
    <td>{author}</td>
    <td>{price}</td>
  </tr>
  );
};

export default BookCard;