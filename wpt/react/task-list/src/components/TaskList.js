import React from "react" ;
import TaskCard from "./TaskCard";

const TaskList = (props)=>{
    console.log(props)
    const deleteTaskHandler = (id) => {
        props.getTaskId(id);
      };
    const renderTaskList = props.tasks.map((task) => {
        return (
            // <TaskCard 
            //     task = {task} 
            //     clickHandler={deleteTaskHandler}
            //     key={task.id}
            // />
            <div>
                {task.task}
                {task.duration}
            </div>
        );      
    });
    return <div>{renderTaskList}</div>;
};

export default TaskList ;