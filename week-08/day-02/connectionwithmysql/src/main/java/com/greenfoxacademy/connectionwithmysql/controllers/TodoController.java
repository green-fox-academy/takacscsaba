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

  @GetMapping(value = "/{id}/delete")
  public String deleteTask(@PathVariable(value = "id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String editTaskPage(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String editTask(@PathVariable(value = "id") long id,
                         @RequestParam(value = "title") String title,
                         @RequestParam(value = "description") String description,
                         @RequestParam(value = "urgent", required = false) boolean urgent,
                         @RequestParam(value = "done", required = false) boolean done) {
    Todo todo = todoRepository.findById(id);
    todo.setTitle(title);
    todo.setDescription(description);
    todo.setUrgent(urgent);
    todo.setDone(done);
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(value = "/{id}/description")
  public String descriptionTask(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id));
    return "description";
  }
}
