package i.love.lance.janice;

public class ILoveLanceJanice {

    public static void main(String[] args) {
        System.out.print(solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    }
    
    public static String solution(String x){
        String output = "";
        char a;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)>96 && x.charAt(i)<123){
                output += (char)(122 + (97 - x.charAt(i)));
            }else{
                output += x.charAt(i);
            }
        }
        return output;
    }
}
