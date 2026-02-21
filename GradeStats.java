public class GradeStats {
    public static void main(String[] args) {
        
        double[] grades = {85.5, 92.0, 78.5, 99.0, 88.0};
        
        double sum = 0;
        double highest = grades[0];
        for (double grade : grades) {
            sum += grade; 
            
            if (grade > highest) {
                highest = grade; 
            }
        }

        double average = sum / grades.length;
        
        System.out.println("Number of grades: " + grades.length);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
    }
}