package question_251;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0271_Encode_And_Decode_Strings {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append("#");
            sb.append(s.length());
            sb.append("_");
            sb.append(s);
        }
            System.out.println(sb);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        String[] tokens = s.split("#");
        System.out.println(tokens.length+" "+s);
        List<String> list = new ArrayList<>();
        for(int i =1; i<tokens.length;i++){
            int underline = tokens[i].indexOf("_");
            String st =  tokens[i].substring(underline+1);
            list.add(st);
        }
//        for(String a: list)
//            System.out.println(a);
        return list;
    }

    public static void main(String[] args){

        List<String> test = new ArrayList<>();
        test.add("1A test article is a version of space craft or related vehicle or equipment, built as a platform to perform testing. ");
        test.add("2Test articles are built to the same specifications to replicate conditions and behaviors of flight ready versions. ");
        test.add("3Test article version are also built without the certification and quality control steps taken with the versions intended for flight. ");
        test.add("4Test articles are more complete than a boilerplate.");
        test.add("5Test articles can sometimes be upgraded to flight ready status. Of the 136 Space Shuttle external fuel tanks produced, one was retained as a test article. The contractor producing the tanks commented that that tank could be refurbished for flight use if necessary.");
        test.add("6The static test article for the Dream Chaser lifting-body spaceplane \"will become the atmospheric flight test vehicle in 2012 for drop tests.\"");
        test.add("7Test articles are often displayed in museums because of their accuracy.[3] Museums may refurbish test articles to match more modern configurations. ");
        test.add("8This was completed on the Hubble Space Telescope Structural Dynamic Test Vehicle on display at the National Air and Space Museum where this 1976 version of the vehicle was removed from display and upgraded in 1996 by the Smithsonian, Lockheed, and NASA to incorporate changes made on the on-mission version of the Hubble Space Telescope over several servicing missions.");
        Q0271_Encode_And_Decode_Strings q = new Q0271_Encode_And_Decode_Strings();
        String encoded = q.encode(test);
        q.decode(encoded);

//        String t = ";dsl;fs;n;fsdofhs;dfssiuyqvlabeylta;";
//        String[] arr = t.split(";");
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));

    }
}
/*
* Encode:
* use some random character, # for example, plus 2 digits string length plus string
* if string length more than 999, use -1 to replace length
*
* Decode:
* parse token using matcher/pattern or split
* if(first 2 character is -1) concat current string to previous one
* */