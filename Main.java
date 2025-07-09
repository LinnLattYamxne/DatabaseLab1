package Lab1;

import java.util.*;
import java.io.*;



public class Main{
    static Vector<UniData> university = new Vector<>();

    public static void main(String[] args) throws FileNotFoundException{

        File f = new File("C:\\Users\\Equitech\\OneDrive - Chiang Mai University\\Documents\\Database\\Lab1\\2024 QS World University Rankings 1.2 (For qs.com).csv");
        Scanner in = new Scanner(f);

        while(in.hasNextLine()){
            String dataLine = in.nextLine();
            StringTokenizer uni = new StringTokenizer(dataLine.trim(), ",");

            Vector<String> temp = new Vector<>();

            // for(int i = 0; i<28;i++){
            //     temp.add(uni.nextToken().trim());
            // }
            for (int i = 0; i < 28; i++) {
                if (uni.hasMoreTokens()) {
                    temp.add(uni.nextToken().trim());
                } else {
                    temp.add(""); 
                }
            }
            
            
            university.addElement(new UniData(temp));
            System.out.println(dataLine);
}

        in.close();     
        Print("Chiang Mai University");
    }

    public static void Print(String UniversityName) throws FileNotFoundException{
        java.io.File file = new java.io.File("QS_World University Ranking 2024.csv");
        boolean found = false;

        for(UniData u: university){
            if(u.getInstitutionName().equalsIgnoreCase(UniversityName)){
                java.io.PrintWriter output = new java.io.PrintWriter(file);
                output.print(u);
                found = true;
                output.close();
                break;
            }
        }
        if(found == false){
            System.out.println("University not found");
        }
    
    }

}