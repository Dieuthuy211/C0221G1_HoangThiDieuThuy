package model.repository;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ServiceRepository {
    BasaRepository basaRepository = new BasaRepository();
    final String INSERT_SERVICE = "insert into service(service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standrad_room,description_other_convenience,pool_area,number_of_floors)\n" +
            "values (?,?,?,?,?,?,?,?,?,?);";
    final  String SELECT_SERVIECTYPE="select *from service_type";
    final  String SELECT_RENTTYPE="select *from rent_type";
    final  String SELECT_SERVICE="select* from service";


    public List<Service> listService() {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int serviceId = resultSet.getInt("service_id");
                String serviceName = resultSet.getString("service_name");
                int serviceArea = resultSet.getInt("service_area");
                String servicePrice = resultSet.getString("service_cost");
                int serviceMaxPeople = resultSet.getInt("service_max_people");
                int rentTypeId = resultSet.getInt("rent_type_id");
                int serviceTypeId = resultSet.getInt("service_type_id");
                String standradRoom = resultSet.getString("standard_room");
                String status = resultSet.getString("description_other_convenience");
                int poolArea = resultSet.getInt("pool_area");
                int numberOfFloors = resultSet.getInt("number_of_floors");

                serviceList.add(new Service(serviceId,serviceName,serviceArea,servicePrice,serviceMaxPeople,rentTypeId,serviceTypeId,standradRoom,status,poolArea,numberOfFloors));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceList;
    }
    public  List<RentType> selectRentType(){
        Connection connection=basaRepository.connectDataBase();
        List<RentType> rentTypes=new ArrayList<>();
        PreparedStatement preparedStatement;
        try {
            preparedStatement=connection.prepareStatement(SELECT_RENTTYPE);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                int rentTypeId=resultSet.getInt("rent_type_id");
                String rentTypeName=resultSet.getString("rent_type_name");
                String rentTypePrice=resultSet.getString("rent_type_cost");
                rentTypes.add(new RentType(rentTypeId,rentTypeName,rentTypePrice));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rentTypes;
    }

    public  List<ServiceType> selectServiceType(){
        Connection connection=basaRepository.connectDataBase();
        List<ServiceType> serviceTypes=new ArrayList<>();
     PreparedStatement preparedStatement;
        try {
            preparedStatement=connection.prepareStatement(SELECT_SERVIECTYPE);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                int id=resultSet.getInt("service_type_id");
                String name=resultSet.getString("service_type_name");
                serviceTypes.add(new ServiceType(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceTypes;
    }

    public void insertService(Service service) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_SERVICE);
            preparedStatement.setString(1,service.getServiceName() );
            preparedStatement.setInt(2,service.getServiceArea());
            preparedStatement.setString(3, service.getServicePrice());
            preparedStatement.setInt(4, service.getServiceMaxPeople());
            preparedStatement.setInt(5, service.getRentTypeId());
            preparedStatement.setInt(6, service.getServiceTypeId());
            preparedStatement.setString(7, service.getStandradRoom());
            preparedStatement.setString(8, service.getStatus());
            preparedStatement.setInt(9, service.getPoolArea());
            preparedStatement.setInt(10, service.getNumberOfFloors());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
