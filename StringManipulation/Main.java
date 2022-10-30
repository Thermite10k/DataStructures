package StringManipulation;
public class Main {

    public static void main(String[] args){
        Manipulator smp = new Manipulator();
        String sampleStr = "The mIssile knows where it is at all the times";

        System.out.println(smp.numOfVowels(sampleStr));
        System.out.println(smp.reverseStr(sampleStr));
        System.out.println(smp.reverseStr2(sampleStr));
        System.out.println(smp.reverseStr3(sampleStr));
        System.out.println(smp.reverseCharacters(sampleStr));

        
        
    }
    
}
