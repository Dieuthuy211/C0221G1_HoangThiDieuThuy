package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        int[] arr = new int[100000];
        System.out.println(stopWatch.start());
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        Arrays.sort(arr);
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
        for (int j=0;j<10;j++){
            System.out.println(arr[j]);
        }
    }

    public static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {

        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {

            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public long start() {
            setStartTime(System.currentTimeMillis());
            return startTime;
        }

        public long stop() {
            setEndTime(System.currentTimeMillis());
            return endTime;
        }

        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }
}