package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class Program {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();  
        
        System.out.println("Enter File Path:");
        String sourceFilesStr = sc.nextLine();
        
        File sourceFile = new File (sourceFilesStr);
        
        String sourceFolderStr = sourceFile.getParent();
        
        boolean sucess = new File(sourceFolderStr + "/out").mkdir();
                
        String targetFilesStr = sourceFolderStr + "/out/summary.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFilesStr))){
            
            String itemCsv = br.readLine();
            while (itemCsv != null){
                
                String[] fields = itemCsv.split(",");
                String name = fields[0]; 
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                
                list.add(new Product(name, price, quantity));
                itemCsv = br.readLine();
            }
            
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilesStr))){
                for(Product item: list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                
                System.out.println(targetFilesStr + "CREATED");
                
            }catch(IOException e){
                System.out.println("Error writting file: " + e.getMessage());
            }
            
        }catch(IOException e){
            System.out.println("Error writting file: " + e.getMessage());
        }
        
        sc.close();
    }
}
