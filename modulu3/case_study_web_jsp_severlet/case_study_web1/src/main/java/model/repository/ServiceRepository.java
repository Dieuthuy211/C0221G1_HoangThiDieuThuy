package model.repository;

import model.bean.Service;
import model.bean.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ServiceRepository {
    BasaRepository basaRepository = new BasaRepository();
    final String INSERT_CUSTOMER = "insert into service(service_name,service_area,service_cost,service_max_people,rent_type_id,service_type_id,standrad_room,description_other_convenience,pool_area,number_of_floors)\n" +
            "values (?,?,?,?,?,?,?,?,?,?);";
    final  String SELECT_SERVIECTYPE="select *from service_type";
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
            preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
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
