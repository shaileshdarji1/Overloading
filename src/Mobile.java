import java.util.ArrayList;

public class Mobile {

    public void getMobile(ArrayList<Model> mobiles,String company){

        int size = mobiles.size();
        for(int i=0;i<size;i++)
        {
            if(mobiles.get(i).getCompany().equals(company)){
                System.out.println(mobiles.get(i));
            }
        }

    }
    public void getMobile(ArrayList<Model> mobiles,int ram){

        int size = mobiles.size();
        for(int i=0;i<size;i++)
        {
            if(mobiles.get(i).getRam()==ram){
                System.out.println(mobiles.get(i));
            }
        }

    }
    public void getMobile(ArrayList<Model> mobiles,String company,int ram){

        int size = mobiles.size();
        for(int i=0;i<size;i++)
        {
            if((mobiles.get(i).getCompany().equals(company)) && (mobiles.get(i).getRam()==ram)){
                System.out.println(mobiles.get(i));
            }
        }

    }


}
