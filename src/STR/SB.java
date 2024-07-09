package STR;

public class SB {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        String str = sb.toString();
        sb.insert(0,"insert");
        System.out.println(sb);
        sb.delete(0,6);
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.setCharAt(1,']');
        System.out.println(sb);
        sb.reverse();
    }
}
