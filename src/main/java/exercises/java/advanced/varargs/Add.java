package exercises.java.advanced.varargs;

public class Add {
    public void add(Integer... numArgs){
        int sum = 0;
        String separator = "";
        for (int i : numArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}
