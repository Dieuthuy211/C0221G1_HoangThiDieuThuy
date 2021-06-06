package model.repository;

import model.bean.ConTract;
import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository {
    BasaRepository basaRepository = new BasaRepository();
    final String SELECT_CONTRACT="select* from contract";
    final String INSERT_CONTRACT="insert into contract (employee_id,customer_id,service_id,contract_start_date,contract_end_date,contract_deposit,contract_total)\n" +
            "values  (?,?,?,?,?,?,?)";

    public void insertContract(ConTract conTract) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_CONTRACT);
            preparedStatement.setInt(1,conTract.getEmployeeId());
            preparedStatement.setInt(2,conTract.getCustomerId());
            preparedStatement.setInt(3,conTract.getServiceId());
            preparedStatement.setString(4, conTract.getContractStartDate());
            preparedStatement.setString(5, conTract.getContractEndDate());
            preparedStatement.setInt(6, conTract.getDeposit());
            preparedStatement.setInt(7, conTract.getTotal());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<ConTract> listContract() {
        List<ConTract> conTractList = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CONTRACT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int employeeId = resultSet.getInt("employee_id");
                int customerId = resultSet.getInt("customer_id");
                int serviceId = resultSet.getInt("service_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                int deposit = resultSet.getInt("contract_deposit");
                int total = resultSet.getInt("contract_total");

                conTractList.add(new ConTract(contractId,employeeId,customerId,serviceId,contractStartDate,contractEndDate,deposit,total));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conTractList;
    }



}
