public class TaskManager {
    int size = 0;
    Task[] tasks;

    public TaskManager(int size) {
        this.size = size;
        tasks = new Task[size];
    }

    public class Task {
        String title;
        String desc;
        String status;

        public Task(String title, String desc, String status) {
            this.title = title;
            this.desc = desc;
            this.status = status;
        }
    }

    int counter = 0;

    public void addTask(String title, String desc, String status) {
        Task newTask = new Task(title, desc, status);
        tasks[counter++] = newTask;
        System.out.println("Task added successfully.");
    }

    public void displayTasks() {
        System.out.println("-----------Tasks-------------");
        for (int i = 0; i < counter; i++) {
            System.out.println("Title: " + tasks[i].title);
            System.out.println("desc: " + tasks[i].desc);
            System.out.println("Status: " + tasks[i].status);
            System.out.println("-------------------------");
        }
    }

    public void markDone(String title) {
        for (int i = 0; i < counter; i++) {
            if (tasks[i].title.equals(title)) {
                tasks[i].status = "Done";

                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(String title) {
        for (int i = 0; i < counter; i++) {
            if (tasks[i].title.equals(title)) {
                for (int j = i; j < counter - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                counter--;
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager(5);
        tm.addTask("Create React App", "Protected Routing", "To Do");
        tm.addTask("Fully functional web", "front-end back-end both", "In Progress");

        tm.displayTasks();

        tm.markDone("Create React App");

        tm.deleteTask("Fully functional web");

        tm.displayTasks();
    }
}
