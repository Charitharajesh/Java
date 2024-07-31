class Student {
    String name; int regNo; int[] marks; int total = 0; double avg;

    public Student(String name, int regNo, int[] marks) {
        this.name = name; this.regNo = regNo; this.marks = marks;
        for (int mark : marks) total += mark;
        avg = total / 5.0;
    }

    public void display() {
        System.out.println("Name: " + name + ", RegNo: " + regNo);
        System.out.print("Marks: ");
        for (int mark : marks) System.out.print(mark + " ");
        System.out.println("\nTotal: " + total + ", Avg: " + avg);
    }

    public static void main(String[] args) {
        new Student("John", 123, new int[]{85, 90, 78, 88, 76}).display();
    }
}
