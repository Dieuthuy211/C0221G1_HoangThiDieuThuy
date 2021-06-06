package model.repository;

import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository {
    BasaRepository basaRepository=new BasaRepository();
    final String INSERT_CONTRACTDETAIL="insert into contract_detail(contract_id,attach_service_id,quantity)\n" +
            " values (?,?,?)";
    final String SELECT_ATTACHSERVICE="select* from attach_service";
    final String SELECT_CONTRACTDETAIL="select* from contract_detail";

    public List<ContractDetail> listContractDetail() {
        List<ContractDetail> contractDetails = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CONTRACTDETAIL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractDetailId = resultSet.getInt("contract_detail_id");
                int contractId = resultSet.getInt("contract_id");
                int attachServiceId = resultSet.getInt("attach_service_id");
                int quantity = resultSet.getInt("quantity");


                contractDetails.add(new ContractDetail(contractDetailId,contractId,attachServiceId,quantity));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contractDetails;
    }

    public void insertContract(ContractDetail contractDetail) {

        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_CONTRACTDETAIL);
            preparedStatement.setInt(1,contractDetail.getContractId());
            preparedStatement.setInt(2,contractDetail.getAttachServiceId());
            preparedStatement.setInt(3,contractDetail.getQuantity());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<AttachService> listAttachService() {
        List<AttachService> attachServices = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ATTACHSERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int attachServiceId = resultSet.getInt("attach_service_id");
                String attachServiceName = resultSet.getString("attach_service_name");
                int attachServicePrice = resultSet.getInt("attach_service_cost");
                int attachServiceUntil = resultSet.getInt("attach_service_until");
                String attachServiceStatus = resultSet.getString("attach_service_status");

                attachServices.add(new AttachService(attachServiceId,attachServiceName,attachServicePrice,attachServiceUntil,attachServiceStatus));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return attachServices;
    }
}
