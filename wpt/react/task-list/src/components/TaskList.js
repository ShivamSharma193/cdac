import React from "react" ;
import TaskCard from "./TaskCard";

const TaskList = (props)=>{
    console.log(props)

    const deleteTaskHandler = (id) => {
        props.getTaskId(id);
    };

    const renderTaskList = props.tasks.map((task) => {
        return (
            <TaskCard 
                task = {task} 
                clickHandler={deleteTaskHandler}
                key={task.id}
            />
        );      
    });


    return  (
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Task</th>
                    <th scope="col">Duration</th>
                    <th scope="col">Delete</th>
                </tr>
            </thead>
            <tbody>
                {renderTaskList}
            </tbody>
        </table>
    );
};

export default TaskList ;