import React from 'react';
import { useState, useRef } from 'react';
import TodoList from './TodoList';
//import { v4 as uuidv4} from "uuid";

function App() {

    const [todos, setTodos] = useState([
      {id: 1, name: "Todo1", completed: false},

    ]);
    const TodoNameRef = useRef();
    const handleaddTodo = () => {
      //タスクを追加
      //console.log(TodoNameRef.current.value);
      const name =TodoNameRef.current.value;
      setTodos((prevTodos) =>{
        return[...prevTodos, {id:1, name: name, completed: false}]
      })
      TodoNameRef.current.value = null;
    };
  return (
    <>
    <TodoList todos={todos}/>
    <input type="Text" ref={TodoNameRef}/>
    <button onClick={handleaddTodo}>タスク追加</button>
    <button>完了したタスクの削除</button>
    <div>残りのタスク:0</div>
    </>
  );
}

export default App;
