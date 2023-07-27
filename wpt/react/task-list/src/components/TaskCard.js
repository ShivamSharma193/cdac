import React from "react";

const TaskCard = (props) => {
  const { id, task, duration } = props.task;
  return (
    <div className="item">

      <div className="content">
        <div className="header">{task}</div>
        <div>{duration}</div>
      </div>
      <i
        className="trash alternate outline icon"
        style={{ color: "red", marginTop: "7px" }}
        onClick={() => props.clickHander(id)}
      ></i>
    </div>
  );
};

export default TaskCard;