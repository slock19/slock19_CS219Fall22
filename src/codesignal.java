public class codesignal {

    public static int solution(int[] numbers) {
        int count = 0;
        int[] full_square = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                for (int k = 0; k < full_square.length; k++) {
                    if (i + j == full_square[k])
                        return count++;
                }
            }
        }
        return count;
    }

    public static void solution2(int[] a) {
        int x = 0;
        int y = 0;
        int z = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        for (int i = 0; i < a.length; i++) {
            if (i > 9) {
                x = (i / 10) % 10;
                if (x == 0) {
                    zero++;
                }
                if (x == 1) {
                    one++;
                }
                if (x == 2) {
                    two++;
                }
                if (x == 3) {
                    three++;
                }
                if (x == 4) {
                    four++;
                }
                if (x == 5) {
                    five++;
                }
                if (x == 6) {
                    six++;
                }
                if (x == 7) {
                    seven++;
                }
                if (x == 8) {
                    eight++;
                }
                if (x == 9) {
                    nine++;

                }
                y = i % 10;
                if (y == 0) {
                    zero++;
                }
                if (y == 1) {
                    one++;
                }
                if (y == 2) {
                    two++;
                }
                if (y == 3) {
                    three++;
                }
                if (y == 4) {
                    four++;
                }
                if (y == 5) {
                    five++;
                }
                if (y == 6) {
                    six++;
                }
                if (y == 7) {
                    seven++;
                }
                if (y == 8) {
                    eight++;
                }
                if (y == 9) {
                    nine++;

                }
                if (i >= 9) {
                    z = i;
                    if (z == 0) {
                        zero++;
                    }
                    if (z == 1) {
                        one++;
                    }
                    if (z == 2) {
                        two++;
                    }
                    if (z == 3) {
                        three++;
                    }
                    if (z == 4) {
                        four++;
                    }
                    if (z == 5) {
                        five++;
                    }
                    if (z == 6) {
                        six++;
                    }
                    if (z == 7) {
                        seven++;
                    }
                    if (z == 8) {
                        eight++;
                    }
                    if (z == 9) {
                        nine++;

                    }
                    System.out.println(zero);
                    System.out.println(one);
                    System.out.println(two);
                    System.out.println(three);
                    System.out.println(four);
                    System.out.println(five);
                    System.out.println(six);
                    System.out.println(seven);
                    System.out.println(eight);
                    System.out.println(nine);


                }

            }

        }
    }

    public static void main(String[] args) {
        solution2(new int [] {10,20,30,40,50,60,70});
    }
}

