package model.repository;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.customer.CustomerUseService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerUseServiceRepository {
    BasaRepository basaRepository = new BasaRepository();
    final String SELECT_ALL = "select*from view_customer";
    final String SELECT_AMOUNT="select* from view_contract_detail";
    final String SEARCH_CUSTOMEUSESERVICE="select* from view_customer\n" +
            "where customer_name like ?";
    final String DELETE_CONTRACT="delete from contract where contract_id=?";

    public List<AmountOfServicesIncluded> listAmount() {
        List<AmountOfServicesIncluded> amountOfServicesIncludeds = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_AMOUNT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                String attachServiceName = resultSet.getString("attach_service_name");
                amountOfServicesIncludeds.add(new AmountOfServicesIncluded(contractId,attachServiceName));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return amountOfServicesIncludeds;
    }



    public List<CustomerUseService> listCustomerUseService() {
        List<CustomerUseService> customerUseServices = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String serviceName = resultSet.getString("service_name");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                customerUseServices.add(new CustomerUseService(contractId,customerId,customerName,serviceName,contractStartDate,contractEndDate));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerUseServices;
    }


    public List<CustomerUseService> search(String search) {
        Connection connection = basaRepository.connectDataBase();
        List<CustomerUseService> customerUseServices = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMEUSESERVICE);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String serviceName = resultSet.getString("service_name");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                customerUseServices.add(new CustomerUseService(contractId,customerId,customerName,serviceName,contractStartDate,contractEndDate));


            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerUseServices;
    }

    public boolean delete(int id) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        boolean rowDeleted = false;
        try {
            preparedStatement = connection.prepareStatement(DELETE_CONTRACT);
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement.toString());
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



}
