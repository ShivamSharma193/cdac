import React, {Component} from "react" ;

class AddTask extends Component {
    // State of the data
    state = {
        task: "" ,
        duration : "" ,
    };

    add = (e) => {
        e.preventDefault() ; // To avoid the page from being refreshed
        if(this.state.task === "" || this.state.duration === ""){
            alert("Please fill all fields") ;
            return ;
        }
        this.props.addTaskHandler(this.state) ;
        this.setState({task: "", duration:""}) ;
    } ;

    render() {
        return (
            <div>
                <form onSubmit={this.add}>
                <div className="form-group">
                    <label htmlFor="task">Task</label>
                    <input type="text" 
                        className="form-control" 
                        name="task"
                        id="task" 
                        placeholder="Task"
                        value={this.state.task}
                        onChange={(e) => this.setState({task: e.target.value})}
                    /> 
                </div>
                <div className="form-group">
                    <label htmlFor="duration">Duration</label>
                    <input type="text" 
                        className="form-control" 
                        name="duration"
                        id="duration" 
                        placeholder="Duration" 
                        value={this.state.duration}
                        onChange={(e) => this.setState({duration: e.target.value})}
                    />
                </div>
        
                <button className="btn btn-primary" >Add</button>
                </form>
            </div>
            
            );
           
    }

}

export default AddTask