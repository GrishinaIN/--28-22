import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;



class Student2 {
    private String name;
    private double gpa;

    public Student2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

class SortingStudentsByGPA implements Comparator<Student2> {
    @Override
    public int compare(Student2 student1, Student2 student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void quickSort(List<Student2> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(List<Student2> students, int low, int high) {
        double pivot = students.get(high).getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGpa() >= pivot) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student2> students, int i, int j) {
        Student2 temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }




    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();
        students.add(new Student2("John", 3.8));
        students.add(new Student2("Alice", 3.2));
        students.add(new Student2("Bob", 3.5));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        for (Student2 student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}