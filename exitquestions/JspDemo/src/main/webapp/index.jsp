<!DOCTYPE html>
<html>
<head>
    <title>Create Task</title>
    <style>
        body {
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            background-color: #eef2f3;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h1 {
            color: #444;
            text-align: center;
            font-size: 24px;
            margin-bottom: 20px;
        }

        form {
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 350px;
            box-sizing: border-box;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
            font-size: 14px;
        }

        input[type="text"],
        input[type="date"],
        select,
        textarea {
            width: 100%;
            padding: 12px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-sizing: border-box;
            font-size: 14px;
            background-color: #f9f9f9;
        }

        textarea {
            height: 120px;
            resize: vertical;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #28a745;
            border: none;
            border-radius: 8px;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <form action="CreateTask" method="post">
        <h1>Create Task</h1>
        
        <label for="title">Task Title</label>
        <input type="text" id="title" name="title">

        <label for="description">Task Description</label>
        <textarea id="description" name="description"></textarea>

        <label for="dueDate">Due Date</label>
        <input type="date" id="dueDate" name="dueDate">

        <label for="priority">Priority</label>
        <select id="priority" name="priority">
            <option value="High">High</option>
            <option value="Medium">Medium</option>
            <option value="Low">Low</option>
        </select>

        <input type="submit" value="Create Task" id="createTask">
    </form>
</body>
</html>