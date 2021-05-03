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
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileServices, true);
            for (Villa villa : listVilla) {
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getServiceName());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getAreaUsed());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getRentalCosts());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getMaximumPeople());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getRentalType());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getStandardRoom());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getOtherFacilitie());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getPoolArea());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(villa.getNumberFloor());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (Exception e) {
            System.out.println("không tìm thấy tên file");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("chưa đống luồng");
            }
        }
    }

    public static void writeFileHouse(ArrayList<House> listHouse) {
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(fileServices, true);
            for (House house : listHouse) {
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getServiceName());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getAreaUsed());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getRentalCosts());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getMaximumPeople());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getRentalType());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getStandardRoom());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getOtherFacilitie());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(house.getNumberFloor());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println("file không tồn tại");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("chưa đống luồng,và xóa bộ nhớ đệm");
            }
        }
    }

    public static void writeFileRoom(ArrayList<Room> listRoom) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileServices, true);

            for (Room room : listRoom) {
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(room.getServiceName());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(room.getAreaUsed());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(room.getRentalCosts());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(room.getRentalType());
                fileWriter.append(COMMA_DELITER);
                fileWriter.append(room.getFreeService());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch (Exception e) {
            System.out.println("file không tồn tại");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();

            } catch (Exception e) {
                System.out.println("chưa đóng luồng");
            }
        }

    }
}
