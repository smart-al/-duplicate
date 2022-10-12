 public static main void(String [] args) {
        int [] dup = new int (2, 3, 4, 5, 7, 3, 5, 9);
            for (int i = 0, i < dup.length, i++) {
                for (int j = i + 1, j < dup.length, j++) {
                    if (dup[i] == dup[j])
                    System.out.println(dup[j]);
                }
        }
    }
}
