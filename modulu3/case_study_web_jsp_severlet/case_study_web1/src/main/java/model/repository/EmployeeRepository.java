package model.repository;

import model.bean.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BasaRepository basaRepository=new BasaRepository();
    final  String SELECT_EMPLOYEE="select* from employee";
    final String INSERT_EMPLOYEE="insert into employee(  employee_name,position_id,education_degree_id,division_id,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username)\n" +
            "values (?,?,?,?,?,?,?,?,?,?,null)";
    final  String SELECT_ONE_EMPLOYEE="select* from employee where employee_id=?";
    final String UPDATE_EMPLOYEE="update employee set employee_name=?,position_id=?,education_degree_id=?,division_id=?,employee_birthday=?,employee_id_card=?,employee_salary=?,employee_phone=?,employee_email=?,employee_address=?,username=null\n" +
            "where employee_id=?";
    final String DELETE_EMPLOYEE="delete from employee where employee_id=?";
    final String SEARCH_EMPLOYEE="select* from employee where employee_name like ?";
    final  String SELECT_DIVISION="select* from division";
    final  String SELECT_POSITION="select* from position";
    final  String SELECT_EDUCATION="select* from education_degree";

public List<Division> selectDivision(){
    Connection connection=basaRepository.connectDataBase();
    List<Division> divisions=new ArrayList<>();
    PreparedStatement preparedStatement;
    try {
        preparedStatement=connection.prepareStatement(SELECT_DIVISION);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            int divisionId=resultSet.getInt("division_id");
            String divisionName=resultSet.getString("division_name");
            divisions.add(new Division(divisionId,divisionName));
        }
        preparedStatement.close();
        connection.close();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return divisions;
}
    public List<Position> selectPosition(){
        Connection connection=basaRepository.connectDataBase();
        List<Position> positions=new ArrayList<>();
        PreparedStatement preparedStatement;
        try {
            preparedStatement=connection.prepareStatement(SELECT_POSITION);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int positionId=resultSet.getInt("position_id");
                String positionName=resultSet.getString("position_name");
                positions.add(new Position(positionId,positionName));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return positions;
    }

    public List<EducationDegree> selectEducationDegree(){
        Connection connection=basaRepository.connectDataBase();
        List<EducationDegree> educationDegrees=new ArrayList<>();
        PreparedStatement preparedStatement;
        try {
            preparedStatement=connection.prepareStatement(SELECT_EDUCATION);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                int educationDegreeId=resultSet.getInt("education_degree_id");
                String educationDegreeName=resultSet.getString("education_degree_name");
                educationDegrees.add(new EducationDegree(educationDegreeId,educationDegreeName));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educationDegrees;
    }


    public List<Employee> search(String search) {
        Connection connection = basaRepository.connectDataBase();
        List<Employee> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_EMPLOYEE);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                String username = resultSet.getString("username");
                list.add(new Employee(employeeId,employeeName,positionId,educationDegreeId,divisionId,employeeBirthday,employeeIdCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,username));
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
            preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
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

    public  boolean updateEmployess(Employee employee){
        boolean rowUpdated = false;
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement=connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setInt(2, employee.getPositionId());
            preparedStatement.setInt(3, employee.getEducationDegreeId());
            preparedStatement.setInt(4, employee.getDivisionId());
            preparedStatement.setString(5, employee.getEmployeeBirthday());
            preparedStatement.setString(6, employee.getEmployeeIdCard());
            preparedStatement.setDouble(7, employee.getEmployeeSalary());
            preparedStatement.setString(8, employee.getEmployeePhone());
            preparedStatement.setString(9, employee.getEmployeeEmail());
            preparedStatement.setString(10, employee.getEmployeeAddress());
            preparedStatement.setInt(11, employee.getEmployeeId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;
    }
    public  Employee selectOneEmployee(int id){
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        Employee employee = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ONE_EMPLOYEE);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                String employeeName = resultSet.getString("employee_name");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                String username = resultSet.getString("username");
//                (int employeeId, String employeeName, int positionId, int educationDegreeId, int divisionId, String employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, String username)
               employee= new Employee(id,employeeName,positionId,educationDegreeId,divisionId,employeeBirthday,employeeIdCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,username);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }
    public void insertCustomer(Employee employee) {
        Connection connection = basaRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setInt(2, employee.getPositionId());
            preparedStatement.setInt(3, employee.getEducationDegreeId());
            preparedStatement.setInt(4, employee.getDivisionId());
            preparedStatement.setString(5, employee.getEmployeeBirthday());
            preparedStatement.setString(6, employee.getEmployeeIdCard());
            preparedStatement.setDouble(7, employee.getEmployeeSalary());
            preparedStatement.setString(8, employee.getEmployeePhone());
            preparedStatement.setString(9, employee.getEmployeeEmail());
            preparedStatement.setString(10, employee.getEmployeeAddress());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public List<Employee> employeeList(){
        List<Employee> list=new ArrayList<>();
        Connection connection=basaRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String employeeName = resultSet.getString("employee_name");
                int positionId = resultSet.getInt("position_id");
                int educationDegreeId = resultSet.getInt("education_degree_id");
                int divisionId = resultSet.getInt("division_id");
                String employeeBirthday = resultSet.getString("employee_birthday");
                String employeeIdCard = resultSet.getString("employee_id_card");
                double employeeSalary = resultSet.getDouble("employee_salary");
                String employeePhone = resultSet.getString("employee_phone");
                String employeeEmail = resultSet.getString("employee_email");
                String employeeAddress = resultSet.getString("employee_address");
                String username = resultSet.getString("username");
//                (int employeeId, String employeeName, int positionId, int educationDegreeId, int divisionId, String employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, String username)
                list.add(new Employee(employeeId,employeeName,positionId,educationDegreeId,divisionId,employeeBirthday,employeeIdCard,employeeSalary,employeePhone,employeeEmail,employeeAddress,username));
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

}
