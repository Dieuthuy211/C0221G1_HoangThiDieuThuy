package data;

import model.House;
import model.Room;
import model.Villa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteFileServices {
    private static final String COMMA_DELITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileServices = "case_study/data/Services.csv";

    public static void wriveFileVila(ArrayList<Villa> listVilla) {
        try {
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(fileServices,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : listVilla) {
                bufferedWriter.append(villa.getId());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getServiceName());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getAreaUsed());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getRentalCosts());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getMaximumPeople());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getRentalType());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getStandardRoom());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getOtherFacilitie());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getPoolArea());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(villa.getNumberFloor());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (Exception e) {
            System.out.println("không tìm thấy tên file");
        }
    }

    public static void writeFileHouse(ArrayList<House> listHouse) {
        try {
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(fileServices,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : listHouse) {
                bufferedWriter.append(house.getId());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getServiceName());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getAreaUsed());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getRentalCosts());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getMaximumPeople());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getRentalType());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getStandardRoom());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getOtherFacilitie());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(house.getNumberFloor());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("file không tồn tại");
        }
    }

    public static void writeFileRoom(ArrayList<Room> listRoom) {
        try {
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(fileServices,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : listRoom) {
                bufferedWriter.append(room.getId());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getServiceName());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getAreaUsed());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getRentalCosts());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getMaximumPeople());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getRentalType());
                bufferedWriter.append(COMMA_DELITER);
                bufferedWriter.append(room.getFreeService());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("file không tồn tại");
        }

    }
}
