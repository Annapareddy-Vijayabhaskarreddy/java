public class ProductImpl {
    public static void main(String[] args) {
        ProductAnalyser product = new ProductAnalyser();
        Product p[] = product.readFromFile("E:\\challenges\\challenge-32\\data\\flipkart_product_sample.csv");
       // product.fileLineCount("flipkart_product_sample.csv");
        
     //  product.SortByPrice(p);
       product.DisplayFile(p);
    }
    
}
