package model.repository;

import model.bean.Customer;
import model.bean.CustomerType;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerRepository {
    BasaRepository basaRepository = new BasaRepository();
    final String SELECT_ALL = "select*from customer";
    final String INSERT_CUSTOMER = "insert into customer(customer_type_id,customer_name,customer_gender,customer_birthday,customer_id_card,customer_phone,customer_email,customer_address)\n" +
            "values (?,?,?,?,?,?,?,?);";
    final String DELETE_CUSTOMER = "  delete from customer where customer_id=?";
    final String UPDATE_CUSTOMER = "        update customer set customer_type_id=?,customer_name=?,customer_gender=?,customer_birthday=?,customer_id_card=?,customer_phone=?,customer_email=?,customer_address=?\n" +
            "       where customer_id=?";
    final String SELECT_CUSTOMER = "select*from customer where customer_id=? ";

    final String SEARCH_CUSTOMER = "  select * from customer where customer_name like ?";
    final String SELECT_CUSTOMERTYPE="select*from customer_type";

    public  List<CustomerType> selectCustomerTyPe(){
        Connection connection=basaRepository.connectDataBase();
        List<CustomerType> customerTypes=new ArrayList<>();
        PreparedStatement preparedStatement;
        try {
            preparedStatement=connection.prepareStatement(SELECT_CUSTOMERTYPE);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int customerTypeId=resultSet.getInt("customer_type_id");
                String customerTypeName=resultSet.getString("customer_type_name");
                customerTypes.add(new CustomerType(customerTypeId,customerTypeName));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  customerTypes;
    }

    public List<Customer> search(String search) {
        Connection connection = basaRepository.connectDataBase();
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMER);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int idCustomerType = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String gender = resultSet.getString("customer_gender");
                String dateOfBirth = resultSet.getString("customer_birthday");
                String card = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                list.add(new Customer(id, idCustomerType,name,gender,dateOfBirth, card, phone, email, address));

            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public boolean delete(int id) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        boolean rowDeleted = false;
        try {
            preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rowDeleted;
    }

    public List<Customer> listCustomer() {
        List<Customer> list = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int idCustomerType = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String gender = resultSet.getString("customer_gender");
                String dateOfBirth = resultSet.getString("customer_birthday");
                String card = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                list.add(new Customer(id, idCustomerType,name,gender, dateOfBirth, card, phone, email, address));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public void insertCustomer(Customer customer) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setInt(1, customer.getIdCustomerType());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getGender());
            preparedStatement.setString(4, customer.getDateOfBirth());
            preparedStatement.setString(5, customer.getCard());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());


            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public boolean update(Customer customer) {
        boolean rowUpdated = false;
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setInt(1, customer.getIdCustomerType());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setString(3, customer.getGender());
            preparedStatement.setString(4, customer.getDateOfBirth());
            preparedStatement.setString(5, customer.getCard());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setInt(9, customer.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;

    }

    public Customer selectCustomer(int id) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        Customer customer = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_CUSTOMER);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idCustomerType = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String gender = resultSet.getString("customer_gender");
                String dateOfBirth = resultSet.getString("customer_birthday");
                String card = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customer = new Customer(id, idCustomerType, name,gender,dateOfBirth, card, phone, email, address);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

}
