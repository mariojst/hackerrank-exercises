package exercises.java.data.structures.priority.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();

        for (String event : events) {
            String[] eventParams = event.split(" ");

            if (eventParams[0].equals("ENTER")) {
                int id = Integer.parseInt(eventParams[3]);
                String name = eventParams[1];
                double cgpa = Double.parseDouble(eventParams[2]);
                Student currentStudent = new Student(id, name, cgpa);

                queue.add(currentStudent);

            } else if (eventParams[0].equals("SERVED")) {
                queue.poll();
            } else {
                throw new RuntimeException("Event must be one of ENTER or SERVED");
            }
        }
        return emptyPriorityQueue(queue);
    }

    private List<Student> emptyPriorityQueue(PriorityQueue<Student> priorityQueue){
        List<Student> students = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            students.add(priorityQueue.poll());
        }
        return students;
    }
}
