import React from "react";

class AddBook extends React.Component {
    state = {
      isbn:"",
      name: "",
      author: "",
      price: "",
  };

  add = (e) => {
    e.preventDefault(); 
    if (this.state.isbn === "" || this.state.name === "" || this.state.author === "" || this.state.price === "") {
      alert("All the fields are mandatory!");
      return;
    }
    this.props.addBookHandler(this.state);
    this.setState({ isbn: "", name: "", author: "", price: "" });
  };
  render() {
    return (
      <div className="ui main">
        <h2>Add Book</h2>
        <form className="ui form" onSubmit={this.add}>
        <div className="field">
            <label>ISBN</label>
            <input
              type="text"
              name="isbn"
              placeholder="ISBN"
              value={this.state.isbn}
              onChange={(e) => this.setState({ isbn: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Name</label>
            <input
              type="text"
              name="name"
              placeholder="Name"
              value={this.state.name}
              onChange={(e) => this.setState({ name: e.target.value })}
            />
          </div>
          <div className="field">
            <label>Author</label>
            <input
              type="text"
              name="author"
              placeholder="Author"
              value={this.state.author}
              onChange={(e) => this.setState({ author: e.target.value })}
            />
                      <div className="field">
            <label>Price</label>
            <input
              type="text"
              name="price"
              placeholder="price"
              value={this.state.price}
              onChange={(e) => this.setState({ price: e.target.value })}
            />
          </div>
          </div>
          <button className="ui button blue">Add</button>
        </form>
      </div>
    );
  }
}

export default AddBook;