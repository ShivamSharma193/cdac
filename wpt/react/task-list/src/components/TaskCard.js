import React from "react";

const TaskCard = (props) => {
  
  const { id, task, duration} = props.task;
  
  return (
    <tr>
      <th scope="row">1</th>
      <td>{task}</td>
      <td>{duration}</td>
      <td>
          <i
            className="trash alternate outline icon"
            style={{ color: "red", marginTop: "7px" }}
            onClick={() => props.clickHander(id)}
          ></i>
      </td>
    </tr>
  );
};

export default TaskCard;