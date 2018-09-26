package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean done, Model model) {
    if (done != null && done == true) {
      model.addAttribute("todoList", todoRepository.findAllByDoneIsTrue());
      return "todoslist";
    }
    model.addAttribute("todoList", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("/add")
  public String addTaskPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
  public String addTask(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }
}
