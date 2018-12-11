
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb=new StringBuilder();
        sb.append("{ \n ");
        for(int n:t){
            sb.append(n);
            if(n!=t[t.length-1]){
                sb.append(", ");
            }
            if(n%4==0 && n!=t[t.length-1]){ 
                sb.append("\n ");
            }
        }
        return sb.toString() + "\n}";
    }
}
