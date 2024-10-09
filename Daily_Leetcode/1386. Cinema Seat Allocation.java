class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> seatRows = new HashMap<>();

        for (int[] rowAndSeat : reservedSeats) {
            int row = rowAndSeat[0];
            int bookedSeat = rowAndSeat[1];

            seatRows.put(row, seatRows.getOrDefault(row, 0) | 1 << (bookedSeat - 1));
        }

        int count = 0;

        for (int seats : seatRows.values()) {
            if ((seats & 0b0p10) == 0) {
                count += 2;
            } else {
                if (((seats & 0b0111100000) == 0) || ((seats & 0b0001111000) == 0) || ((seats & 0b0000011110) == 0)) {
                    count++;
                }
            }
        }

        count = count + ((n - seatRows.size()) * 2);
       
        return count;

    }
}
