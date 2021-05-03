package data;

import model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteReadCustomer {
    private static final String COMMA_DELITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_CUSTONER = "case_study/data/Customer.csv";
    public static void writeCusroner(ArrayList<Customer> listCustomer){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(FILE_CUSTONER);
            for(Customer customer:listCustomer){
                fileWriter.append(customer.getId());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getFullName());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getDateOfBirth());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getIdentityCard());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getPhone());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        }catch (Exception e){
            System.out.println("không tìm thấy file");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception e){
                System.out.println("chưa đống luồng");
            }
        }
    }
    public static ArrayList<Customer> readCustomer(){
        ArrayList<Customer> listCustomer=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(FILE_CUSTONER);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String [] arrCustome=line.split(",");
                Customer customer=new Customer();
                customer.setId(arrCustome[0]);
                customer.setFullName(arrCustome[1]);
                customer.setDateOfBirth(arrCustome[2]);
                customer.setGender(arrCustome[3]);
                customer.setIdentityCard(arrCustome[4]);
                customer.setPhone(arrCustome[5]);
                customer.setEmail(arrCustome[6]);
                customer.setTypeCustomer(arrCustome[7]);
                customer.setAddress(arrCustome[8]);
                listCustomer.add(customer);

            }
            fileReader.close();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("không tìm thấy file");
        }
        return listCustomer;
    }

}
