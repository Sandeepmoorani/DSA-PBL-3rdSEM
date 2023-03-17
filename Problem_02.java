public class Problem_02 {

Pak_Uni_stacks s=new Pak_Uni_stacks();
    
public  void Top_n_UniversityBy(String orderby, int n) {
             
        if (orderby.equals("numberofpublication")) {
           s.  Add_pak_uni_obj_into_stack_by_numberOfPublication();
            for (int i = 0; i < n; i++)
                System.out.println(s.peek() + " " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(s.pop().toString()));
        }

        else if (orderby.equals("WorldRank")) {
             s.Add_uni_obj_into_stack_by_WorldRanked();
            for (int i = 0; i < n; i++)
                System.out.println(s.peek() + " = " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(s.pop()).toString());

        } else if (orderby.equals("AsiaRank")) {
            s.Add_uni_obj_into_stack_by_AsiaRanked();
            for (int i = 0; i < n; i++)
                System.out.println(s.peek() + " = " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(s.pop()).toString());

        } else if (orderby.equals("pakistanRank")) {
            s.Add_uni_obj_into_stack_by_PakRanked();
            for (int i = 0; i < n; i++)
                System.out.println(s.peek() + " = " + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(s.pop()).toString());
        }

    }
 
    
    public void Bottom_n_UniversityBy(String orderby, int n) {
        if (orderby.equals("numberofpublication")) {
            s.Add_pak_uni_obj_into_stack_by_numberOfPublication();
            for (int i = 0; i < n; i++)
                System.out.println(Pak_Uni_stacks.university_stack_publication_array[i][0] + " "
                        + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(Pak_Uni_stacks.university_stack_publication_array[i][0]));
        } else if (orderby.equals("WorldRank")) {
            s.Add_uni_obj_into_stack_by_WorldRanked();
            for (int i = 0; i < n; i++)
                System.out.println(Pak_Uni_stacks.university_stack_WorldRank_array[i][0] + " "
                        + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(Pak_Uni_stacks.university_stack_WorldRank_array[i][0]));

        } else if (orderby.equals("AsiaRank")) {
            s.Add_uni_obj_into_stack_by_AsiaRanked();
            for (int i = 0; i < n; i++)
                System.out.println(Pak_Uni_stacks.university_stack_AsiaRank_array[i][0] + " "
                        + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(Pak_Uni_stacks.university_stack_AsiaRank_array[i][0]));

        } else if (orderby.equals("pakistanRank")) {
            s.Add_uni_obj_into_stack_by_PakRanked();
            for (int i = 0; i < n; i++)
                System.out.println(Pak_Uni_stacks.university_stack_Pakrank_array[i][0] + " "
                        + HashTable_to_ReadCsvFile.pakis_univ_HashTable.get(Pak_Uni_stacks.university_stack_Pakrank_array[i][0]));
        }

    }

}
