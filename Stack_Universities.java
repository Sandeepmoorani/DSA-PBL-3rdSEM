import java.util.Arrays;
import java.util.Comparator;

class Pak_Uni_stacks {
    Pak_Uni_stacks() {
        HashTable_to_ReadCsvFile.ReadCvs_File();
    }

    static String[][] university_stack_publication_array = new String[100][2];
    static String[][] university_stack_WorldRank_array = new String[100][2];
    static String[][] university_stack_AsiaRank_array = new String[100][2];
    static String[][] university_stack_Pakrank_array = new String[100][2];
    static Pak_Uni_stacks sindh_Stack = new Pak_Uni_stacks();
    static Pak_Uni_stacks punjab_Stack = new Pak_Uni_stacks();
    static Pak_Uni_stacks Balochistan_Stack = new Pak_Uni_stacks();
    static Pak_Uni_stacks KPK_Stack = new Pak_Uni_stacks();
    static Pak_Uni_stacks AJK_Stack = new Pak_Uni_stacks();
    static Pak_Uni_stacks GilgitB_Stack = new Pak_Uni_stacks();

    private static Node top;
    private static int size;

    static class Node {
        Object data;
        Node next;

        Node(Object obj, Node next) {
            this.data = obj;
            this.next = next;
        }
    }

    public int size() {
        return size;
    }

    public void push(Object obj) {
        top = new Node(obj, top);
        size++;
    }

    public Object pop() {
        if (size == 0)
            return "null";
        Object olObject = top.data;
        top = top.next;
        size--;
        return olObject;
    }

    public Object peek() {
        if (size == 0)
            return "null";
        return top.data;
    }
    

    public  void Add_pak_uni_obj_into_stack_by_numberOfPublication() {
        Arrays.sort(university_stack_publication_array,
                Comparator.comparingInt((String[] q) -> Integer.parseInt(q[1])));
        for (int j = 0; j < university_stack_publication_array.length; j++) {
            this.push(university_stack_publication_array[j][0]);

        }
    }

    public void Add_uni_obj_into_stack_by_WorldRanked() {
        Arrays.sort(university_stack_WorldRank_array,
                Comparator.comparingInt((String[] q) -> Integer.parseInt(q[1])).reversed());
        for (int j = 0; j < 100; j++) {
            this.push(university_stack_WorldRank_array[j][0]);
            // System.out.print(university_stack_WorldRank_array[j][0] + " = ");
            // System.out.println(university_stack_WorldRank_array[j][1]);
        }
    }

    public void Add_uni_obj_into_stack_by_AsiaRanked() {
        Arrays.sort(university_stack_AsiaRank_array,
                Comparator.comparingInt((String[] q) -> Integer.parseInt(q[1])).reversed());
        for (int j = 0; j < 100; j++) {
            this.push(university_stack_AsiaRank_array[j][0]);
        }
    }

    public void Add_uni_obj_into_stack_by_PakRanked() {
        Arrays.sort(university_stack_Pakrank_array,
                Comparator.comparingInt((String[] q) -> Integer.parseInt(q[1])).reversed());
        for (int j = 0; j < 100; j++) {
            this.push(university_stack_Pakrank_array[j][0]);
        }
    }

    public static void Add_keys_by_province(String provience) {
        Pak_Uni_Main Pak_Uni_Main = new Pak_Uni_Main();
        Arrays.sort(university_stack_publication_array,
                Comparator.comparingInt((String[] q) -> Integer.parseInt(q[1])));
        if (provience.equals("punjab")) {
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.Punjab.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.Punjab.get(i)))
                        punjab_Stack.push(university_stack_publication_array[j][0]);
                }

            }
        } else if (provience.equals("KPK")) {
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.KPK.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.KPK.get(i)))
                        KPK_Stack.push(university_stack_publication_array[j][0]);
                }

            }
        } else if (provience.equals("sindh")) {
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.Sindh.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.Sindh.get(i)))
                        sindh_Stack.push(university_stack_publication_array[j][0]);
                }

            }
        }

        else if (provience.equals("Balochistan")) {
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.Balochistan.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.Balochistan.get(i)))
                        Balochistan_Stack.push(university_stack_publication_array[j][0]);
                }

            }
        }
        else if(provience.equals("AJK")){
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.AJK.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.AJK.get(i)))
                        AJK_Stack.push(university_stack_publication_array[j][0]);
                }

            }
        }

        else{
            for (int j = 0; j < university_stack_publication_array.length; j++) {
                for (int i = 0; i < Pak_Uni_Main.Gilgit.size(); i++) {
                    if (university_stack_publication_array[j][0].equalsIgnoreCase(Pak_Uni_Main.Gilgit.get(i)))
                        GilgitB_Stack.push(university_stack_publication_array[j][0]);
                }

            } 
        }


        }
    

    public static void Top_n_Sindh_Universities(String province, int n) {
        Add_keys_by_province(province);
        // add_sindh();
        if (n > sindh_Stack.size()) {
            System.out.println("sorry we have only " + sindh_Stack.size() + "records");
            n = sindh_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(
                    sindh_Stack.peek() + "  " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(sindh_Stack.pop()).toString());
        }

    }

    public static void Top_n_Punjab_Universities(String province, int n) {
        Add_keys_by_province(province);
        if (n > punjab_Stack.size()) {
            System.out.println("sorry we have only " + punjab_Stack.size() + "records");
            n = punjab_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(
                    punjab_Stack.peek() + "  " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(punjab_Stack.pop()).toString());
        }
    }

    public static void Top_n_Balochistan_Universities(String province, int n) {
        Add_keys_by_province(province);
        if (n > Balochistan_Stack.size()) {
            System.out.println("sorry we have only " + Balochistan_Stack.size() + "records");
            n = Balochistan_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Balochistan_Stack.peek() + "  "
                    + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(Balochistan_Stack.pop()).toString());
        }
    }

    public static void Top_n_KPK_Universities(String province, int n) {
        Add_keys_by_province(province);
        if (n > KPK_Stack.size()) {
            System.out.println("sorry we have only " + KPK_Stack.size() + "records");
            n = KPK_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(
                    KPK_Stack.peek() + "  " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(KPK_Stack.pop()).toString());
        }
    }
    public static void Top_n_AJK_Universities(String province, int n) {
        Add_keys_by_province(province);
        if (n > AJK_Stack.size()) {
            System.out.println("sorry we have only " + AJK_Stack.size() + " records");
            n = AJK_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(
                    AJK_Stack.peek() + "  " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(AJK_Stack.pop()).toString());
        }
    }
    public static void Top_n_Gilgit_Universities(String province, int n) {
        Add_keys_by_province(province);
        if (n > GilgitB_Stack.size()) {
            System.out.println("sorry we have only " + GilgitB_Stack.size() + " records");
            n = GilgitB_Stack.size();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(
                    GilgitB_Stack.peek() + "  " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(GilgitB_Stack.pop()).toString());
        }
    }
// this method is used for percentile of uiversity
    public  void Percentile_50th_University(){
        Pak_Uni_stacks s=new Pak_Uni_stacks();
     s.Add_pak_uni_obj_into_stack_by_numberOfPublication();
     int fifth_percentile=s.size()/2;
     while(s.size()!=fifth_percentile){
s.pop();
     }
     System.out.println(s.peek()+" " +HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(s.peek()).toString());
    }
}
