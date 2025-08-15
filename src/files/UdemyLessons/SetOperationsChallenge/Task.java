package files.UdemyLessons.SetOperationsChallenge;


public class Task implements Comparable<Task> {

    private String project;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;

    public Task(String project, String description, Priority priority, String assignee, Status status) {
        this.assignee = assignee;
        this.description = description;
        this.priority = priority;
        this.project = project;
        this.status = status;
    }

    public Task(String project, String description, Priority priority, String assignee) {
        this(assignee, description, priority, project,
                assignee == null ? Status.IN_QUEUE : Status.ASSIGNED);
    }

    public Task(String description, Priority priority, String project) {
        this(null, description, priority, project);
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(project, description, priority,
                assignee, status);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return project.equals(task.project) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        int result = project.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public int compareTo(Task o) {
        int result = this.project.compareTo(o.project);
        if (result == 0) result = this.description.compareTo(o.description);
        return result;
    }
}
