
import java.util.ArrayList;
import java.util.Scanner;

public class Pak_Uni_Main {
    Pak_Uni_Main() { HashTable_to_ReadCsvFile.add_Keys_by_province();}

    static ArrayList<String> Sindh = new ArrayList<>();
    static ArrayList<String> Punjab = new ArrayList<>();
    static ArrayList<String> Balochistan = new ArrayList<>();
    static ArrayList<String> KPK = new ArrayList<>();
    static ArrayList<String> AJK = new ArrayList<>();
    static ArrayList<String> Gilgit = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("\n\n\n == >  Enter your choice <== ");
        System.out.println(
                " 1. Search A university by providing (key) \n 2. Top n universties with orderby \n 3. Bottom n University with orderBy   \n 4. 50th percentile \n 5. Best And Worst Performance \n 6. See provincial ranking of the universities \n 7. Exit ");
        int input = sc.nextInt();

        switch (input) {
            case 1: {
                new Pak_Uni_stacks();
                System.out.println("Enter the KEY of university you searched for :");
                String str = sc.nextLine();
                str = sc.nextLine();
                System.out.println(
                        HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(str).toString());
                break;
            }

            case 2: {
                Problem_02 prblm2=new Problem_02();
                while(true){
                System.out.println("Enter (n)  HowMany TOP  University data You Searched :");
                int i = sc.nextInt();
                System.out.println("Enter on what basis : your choice");
                System.out.println(" 1. numberofpublication \n 2. pakistan Rank \n 3. World rank \n 4. Asia Rank \n 5.Exit ");
                int orderby = sc.nextInt();

                switch (orderby) {
                    case 1: {
                        prblm2.Top_n_UniversityBy("numberofpublication", i);
                        break;
                    }
                    case 2: {
                        prblm2.Top_n_UniversityBy("pakistanRank", i);
                        break;
                    }
                    case 3: {
                        prblm2.Top_n_UniversityBy("WorldRank", i);
                        break;
                    }
                    case 4: {
                        prblm2.Top_n_UniversityBy("AsiaRank", i);
                        break;
                    }
                    case 5:{
                        System.exit(0);
                    }
                    default: {
                        System.out.println("wrong input ");
                        break;
                    }
                }
                break;
                }

            }
break;
            case 3: {
                Problem_02 prblm2=new Problem_02();
                while(true){
                System.out.println("Enter (n)  HowMany Bottom  University data You Searched :");
                int i = sc.nextInt();
                System.out.println("Enter on what basis : your choice");
                System.out.println(" 1. numberofpublication \n 2. pakistan Rank \n 3. Word rank \n 4. Asia Rank \n 5. Exit");
                int orderby = sc.nextInt();

                switch (orderby) {
                    case 1: {
                        prblm2.Bottom_n_UniversityBy("numberofpublication", i);
                        break;
                    }
                    case 2: {
                        prblm2.Bottom_n_UniversityBy("pakistanRank", i);
                        break;
                    }
                    case 3: {
                        prblm2.Bottom_n_UniversityBy("WorldRank", i);
                        break;
                    }
                    case 4: {
                        prblm2.Bottom_n_UniversityBy("AsiaRank", i);
                        break;
                    }
                    case 5:{System.exit(0);}
                    default: {
                        System.out.println("wrong input ");
                        break;
                    }
                }
                break;
            }
            }
            break;
            case 4: {
                Pak_Uni_stacks s1=new Pak_Uni_stacks();
                s1.Percentile_50th_University();
                break;
            }
            case 5: {
                System.out.println("\n"+Problem_03. performance());
                break;
            }
            case 6:{
                System.out.println("Enter (n)  HowMany Top  University data You Searched by provinced wise :");
                int i = sc.nextInt();
                System.out.println("Enter on what province basis : your choice");
                System.out.println(
                        " 1. Sindh \n 2. Punjab \n 3. Balochistan \n 4. KPK \n 5. AJK  \n 6. Gilgit Biltistan");
                int orderby = sc.nextInt();

                switch (orderby) {
                    case 1: {
                        Pak_Uni_stacks.Top_n_Sindh_Universities("sindh", i);
                        System.exit(0);
           
                        break;
                    }
                    case 2: {
                        Pak_Uni_stacks.Top_n_Punjab_Universities("punjab", i);
                        System.exit(0);
                  
                        break;
                    }
                    case 3: {
                        Pak_Uni_stacks.Top_n_Balochistan_Universities("Balochistan", i);
                        System.exit(0);
                
                        break;
                    }
                    case 4: {
                        Pak_Uni_stacks.Top_n_KPK_Universities("KPK", i);
                        System.exit(0);
                        break;
                    }
                    case 5: {
                        Pak_Uni_stacks.Top_n_AJK_Universities("AJK", i);
                        System.exit(0);
                        break;
                    }
                    case 6: {
                        Pak_Uni_stacks.Top_n_Gilgit_Universities("Gilgit Biltistan", i);
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("wrong input ");
                        break;
                    }
                }

                break;
            }
            case 7:{
                System.exit(0);
            }
            default: {
                System.out.println("not exist");
                break;
            }
        }
    }
    }
}
