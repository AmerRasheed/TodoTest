package org.example.model;

import java.time.LocalDate;

import java.util.Objects;
import java.util.zip.DataFormatException;

public class todoItem {
    int todoId;
    String todoItemTitle;
    String description;
    LocalDate itemDeadline;
    Boolean isDoneStatus;
    int assigneeId;

    public todoItem(int todoId, String todoItemTitle, String description, LocalDate itemDeadline, Boolean isDoneStatus, int assigneeId) {
        this.todoId = todoId;
        this.todoItemTitle = todoItemTitle;
        this.description = description;
        this.itemDeadline = itemDeadline;
        this.isDoneStatus = isDoneStatus;
        this.assigneeId = assigneeId;
    }

    public todoItem(String todoItemTitle, String description, LocalDate itemDeadline, Boolean isDoneStatus) {
        this(0, todoItemTitle, description, itemDeadline, isDoneStatus, 0);
    }                             // int tod AND int assigneeId in the previous CONSTRUCTOR is set to O since it will not be set in DB


    public int getTodoId() {
        return todoId;
    }

    public String getTodoItemTitle() {
        return todoItemTitle;
    }

    public void setTodoItemTitle(String todoItemTitle) {
        this.todoItemTitle = todoItemTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getItemDeadline() {
        return itemDeadline;
    }

    public void setItemDeadline(LocalDate itemDeadline) {
        this.itemDeadline = itemDeadline;
    }

    public Boolean getDoneStatus() {
        return isDoneStatus;
    }

    public void setDoneStatus(Boolean doneStatus) {
        isDoneStatus = doneStatus;
    }

    public int getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(int assigneeId) {
        this.assigneeId = assigneeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        todoItem todoItem = (todoItem) o;
        return todoId == todoItem.todoId &&
                assigneeId == todoItem.assigneeId &&
                Objects.equals(todoItemTitle, todoItem.todoItemTitle) &&
                Objects.equals(description, todoItem.description) &&
                Objects.equals(itemDeadline, todoItem.itemDeadline) &&
                Objects.equals(isDoneStatus, todoItem.isDoneStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(todoId, todoItemTitle, description, itemDeadline, isDoneStatus, assigneeId);
    }
}