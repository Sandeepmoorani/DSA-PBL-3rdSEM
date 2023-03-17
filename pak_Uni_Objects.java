
public class pak_Uni_Objects {

  protected  String Uni_Name,city,province;
   protected int world_rank;
    int asia_rank, pakistan_rank,Nubr_publication;
   private static boolean b = true;

    pak_Uni_Objects(String uni_name, int world_rank, int asia_rank, int pakistan_rank, String city,
            String province, int Nubr_publication) {
        this.Uni_Name = uni_name;
        this.world_rank = world_rank;
        this.asia_rank = asia_rank;
        this.pakistan_rank = pakistan_rank;
        this.city = city;
        this.province = province;
        this.Nubr_publication = Nubr_publication;
    }

    public String toString() {
        if(b){
System.out.println("\n--------------------------------------------------------------------------------------------------------------");
System.out.println("     UniversitesNames     \t\tWorldRank   AsiaRank   PakRank   city  province  numberOfPublication ");
System.out.println("---------------------------------------------------------------------------------------------------------------\n");
        }
      b=false;
        return " [ " + this.Uni_Name + "] [" + this.world_rank + "] [" + this.asia_rank
                +"]  ["+ this.pakistan_rank + "] [" + this.city
                +"] ["+ this.province + "] [" + this.Nubr_publication + "]";
    }

    }


