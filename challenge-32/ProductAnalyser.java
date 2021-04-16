import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductAnalyser {
     int fileLineCount(String fileName)
    {
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine();
            while(br.readLine()!=null)
            {
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
        return count;
    } 
    public  Product[] readFromFile(String fileName){
        int noOflines = fileLineCount(fileName);
        Product[] p = new Product[noOflines];
        System.out.println(noOflines);  
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName))){
            br1.readLine();
             String line;
              int i = 0;
              while((line=br1.readLine())!=null)
              {
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
               try{
                 Product product = new Product();
                 product.setPid(data[0]);
                 product.setProduct_name(data[1]);
                 product.setBrand(data[2]);
                 product.setProduct_url(data[3]);
                 product.setRetail_price(Double.parseDouble(data[4]));
                 product.setDiscounted_price(Double.parseDouble(data[5]));
                 product.setProduct_rating(data[6]);
                 p[i]=product;
                 i++;
               }catch(NumberFormatException e){
                e.printStackTrace();
            }
       
                }
             
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }catch(NullPointerException e){
             e.printStackTrace();
         }
        return p;
    }
   
    public void DisplayFile(Product[] p){
        System.out.format("%s %20s %20s %20s %20s %20s %20s","pid","product_name","brand","product_url",
        "retailprice","discounted_price","product_rating");
        System.out.println();
        SortByPrice(p);
        for(Product product : p)
        {
            System.out.println(product.getPid()+" :: "+product.getProduct_name()+" :: "+product.getBrand()
            +" :: "+product.getProduct_url()+" :: "+product.getRetail_price()+" :: "
            +product.getDiscounted_price()+" :: "+product.getProduct_rating());
        }
       
    }
    public void SortByPrice(Product[] p){
        String temppid;
        String temppname;
        String tempbrand;
        String temppurl;
        double tempretailprice;
        double tempdiscount;
        String temprating;
        System.out.format("%s %20s","Pid","Price");
        System.out.println();
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length-i-1;j++){
                if(p[j].getRetail_price()>p[j+1].getRetail_price()){
                    temppid= p[j].getPid();
                    p[j].setPid(p[j+1].getPid());
                    p[j+1].setPid(temppid);

                    temppname= p[j].getProduct_name();
                    p[j].setProduct_name(p[j+1].getProduct_name());
                    p[j+1].setProduct_name(temppname);

                    tempbrand= p[j].getBrand();
                    p[j].setBrand(p[j+1].getBrand());
                    p[j+1].setBrand(tempbrand);

                    temppurl= p[j].getProduct_url();
                    p[j].setProduct_url(p[j+1].getProduct_url());
                    p[j+1].setProduct_url(temppurl);

                    tempretailprice= p[j].getRetail_price();
                    p[j].setRetail_price(p[j+1].getRetail_price());
                    p[j+1].setRetail_price(tempretailprice);

                    tempdiscount= p[j].getDiscounted_price();
                    p[j].setDiscounted_price(p[j+1].getDiscounted_price());
                    p[j+1].setDiscounted_price(tempdiscount);

                    temprating= p[j].getProduct_rating();
                    p[j].setProduct_rating(p[j+1].getProduct_rating());
                    p[j+1].setProduct_rating(temprating);
                }
                
            }
        }
    }
    
}
