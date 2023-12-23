public class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(123, "Alice");
        students[1] = new Student(456, "Bob");
        students[2] = new Student(234, "Charlie");
        students[3] = new Student(789, "David");
        students[4] = new Student(567, "Eve");

        System.out.println("Unsorted array:");
        for (Student student : students) {
            System.out.println(student.getiDNumber() + " - " + student.getName());
        }

        insertionSort(students);

        System.out.println("\nSorted array:");
        for (Student student : students) {
            System.out.println(student.getiDNumber() + " - " + student.getName());
        }
    }
}