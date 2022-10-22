import java.io.IOException;
import java.util.Scanner;

public class TestCalc {

        public static void main(String[] args) throws IOException
        {
            Scanner scan = new Scanner(System.in);
            while (true) {
                String primer = scan.nextLine();
                System.out.println(calc(primer));
            }
        }

        public static String calc(String input) throws IOException {

                final String plus = "+";
                final String minus = "-";
                final String division = "/";
                final String multiply = "*";
                int res = 0;
                String result = null;
                String prom1 = null;
                String prom2 = null;
                boolean test1 = false;
                boolean test2 = false;
                int rimToArab1 = 0;
                int rimToArab2 = 0;
                final String I = "I";
                final String II = "II";
                final String III = "III";
                final String IV = "IV";
                final String V = "V";
                final String VI = "VI";
                final String VII = "VII";
                final String VIII = "VIII";
                final String IX = "IX";
                final String X = "X";
                final String[] rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                String[] array = input.split(" ");

                if (array.length > 3) {
                    System.out.println("You can enter only 3 elements. For example: a + b.");
                    throw new IOException();
                }
                for (int i = 0; i < 10; i++) {
                    if (array[0].equals(rim[i])) {
                        test1 = true;
                        prom1 = rim[i];
                        break;
                    }
                }
                for (int i = 0; i < 10; i++) {
                    if (array[2].equals(rim[i])) {
                        test2 = true;
                        prom2 = rim[i];
                        break;
                    }
                }
                if ((test1 == false) && (test2 == false)) { //arab numbers
                    if ((Byte.parseByte(array[0]) <= 10 && Byte.parseByte(array[2]) <= 10) && (Byte.parseByte(array[0]) > 0 && Byte.parseByte(array[2]) > 0)) {

                        switch (array[1]) {
                            case plus:
                                res = Byte.parseByte(array[0]) + Byte.parseByte(array[2]);
                                result = String.valueOf(res);
                                break;
                            case minus:
                                res = Byte.parseByte(array[0]) - Byte.parseByte(array[2]);
                                result = String.valueOf(res);
                                break;
                            case division:
                                res = Byte.parseByte(array[0]) / Byte.parseByte(array[2]);
                                result = String.valueOf(res);
                                break;
                            case multiply:
                                res = Byte.parseByte(array[0]) * Byte.parseByte(array[2]);
                                result = String.valueOf(res);
                                break;
                            default:
                                System.out.println("You can use only these sings \"+\", \"-\", \"/\", \"*\".");
                                throw new IOException();
                        }
                    } else {
                        System.out.println("Your number must be between 1 to 10");
                        throw new IOException();
                    }
                } else if ((test1) && (test2)) { //rim numbers
                    switch (prom1) {
                        case I -> rimToArab1 = 1;
                        case II -> rimToArab1 = 2;
                        case III -> rimToArab1 = 3;
                        case IV -> rimToArab1 = 4;
                        case V -> rimToArab1 = 5;
                        case VI -> rimToArab1 = 6;
                        case VII -> rimToArab1 = 7;
                        case VIII -> rimToArab1 = 8;
                        case IX -> rimToArab1 = 9;
                        case X -> rimToArab1 = 10;
                    }
                    switch (prom2) {
                        case I -> rimToArab2 = 1;
                        case II -> rimToArab2 = 2;
                        case III -> rimToArab2 = 3;
                        case IV -> rimToArab2 = 4;
                        case V -> rimToArab2 = 5;
                        case VI -> rimToArab2 = 6;
                        case VII -> rimToArab2 = 7;
                        case VIII -> rimToArab2 = 8;
                        case IX -> rimToArab2 = 9;
                        case X -> rimToArab2 = 10;
                    }

                    switch (array[1]) {
                        case plus -> {
                            res = rimToArab1 + rimToArab2;
                            result = arabToRim(res);
                        }
                        case minus -> {
                            res = rimToArab1 - rimToArab2;
                            if (res < 1) {
                                throw new IOException();
                            }
                            result = arabToRim(res);
                        }
                        case division -> {
                            res = rimToArab1 / rimToArab2;
                            result = arabToRim(res);
                        }
                        case multiply -> {
                            res = rimToArab1 * rimToArab2;
                            result = arabToRim(res);
                        }
                        default -> {
                            System.out.println("You can use only these sings \"+\", \"-\", \"/\", \"*\".");
                            throw new IOException();
                        }
                    }
                } else {
                    System.out.println("Both numbers must be on the same scale.");
                    throw new IOException();
                }
                return result;
        }

        static String arabToRim (int a){
            String res = null;
            switch (a) {
                case 1 : res = "I";              break;
                case 2 : res = "II";             break;
                case 3 : res = "III";            break;
                case 4 : res = "IV";             break;
                case 5 : res = "V";              break;
                case 6 : res = "VI";             break;
                case 7 : res = "VII";            break;
                case 8 : res = "VIII";           break;
                case 9 : res = "IX";             break;
                case 10 : res = "X";             break;
                case 11 : res = "XI";            break;
                case 12 : res = "XII";           break;
                case 13 : res = "XIII";          break;
                case 14 : res = "XIV";           break;
                case 15 : res = "XV";            break;
                case 16 : res = "XVI";           break;
                case 17 : res = "XVII";          break;
                case 18 : res = "XVIII";         break;
                case 19 : res = "XIX";           break;
                case 20 : res = "XX";            break;
                case 21 : res = "XXI";           break;
                case 22 : res = "XXII";          break;
                case 23 : res = "XXIII";         break;
                case 24 : res = "XXIV";          break;
                case 25 : res = "XXV";           break;
                case 26 : res = "XXVI";          break;
                case 27 : res = "XXVII";         break;
                case 28 : res = "XXVIII";        break;
                case 29 : res = "XXIX";          break;
                case 30 : res = "XXX";           break;
                case 31 : res = "XXXI";          break;
                case 32 : res = "XXXII";         break;
                case 33 : res = "XXXIII";        break;
                case 34 : res = "XXXIV";         break;
                case 35 : res = "XXXV";          break;
                case 36 : res = "XXXVI";         break;
                case 37 : res = "XXXVII";        break;
                case 38 : res = "XXXVIII";       break;
                case 39 : res = "XXXIX";         break;
                case 40 : res = "XL";            break;
                case 41 : res = "XLI";           break;
                case 42 : res = "XLII";          break;
                case 43 : res = "XLIII";         break;
                case 44 : res = "XLIV";          break;
                case 45 : res = "XLV";           break;
                case 46 : res = "XLVI";          break;
                case 47 : res = "XLVII";         break;
                case 48 : res = "XLVIII";        break;
                case 49 : res = "XLIX";          break;
                case 50 : res = "L";             break;
                case 51 : res = "LI";            break;
                case 52 : res = "LII";           break;
                case 53 : res = "LIII";          break;
                case 54 : res = "LIV";           break;
                case 55 : res = "LV";            break;
                case 56 : res = "LVI";           break;
                case 57 : res = "LVII";          break;
                case 58 : res = "LVIII";         break;
                case 59 : res = "LIX";           break;
                case 60 : res = "LX";            break;
                case 61 : res = "LXI";           break;
                case 62 : res = "LXII";          break;
                case 63 : res = "LXIII";         break;
                case 64 : res = "LXIV";          break;
                case 65 : res = "LXV";           break;
                case 66 : res = "LXVI";          break;
                case 67 : res = "LXVII";         break;
                case 68 : res = "LXVIII";        break;
                case 69 : res = "LXIX";          break;
                case 70 : res = "LXX";           break;
                case 71 : res = "LXXI";          break;
                case 72 : res = "LXXII";         break;
                case 73 : res = "LXXIII";        break;
                case 74 : res = "LXXIV";         break;
                case 75 : res = "LXXV";          break;
                case 76	: res = "LXXVI";         break;
                case 77	: res = "LXXVII";        break;
                case 78	: res = "LXXVIII";       break;
                case 79	: res = "LXXIX";         break;
                case 80	: res = "LXXX";          break;
                case 81	: res = "LXXXI";         break;
                case 82	: res = "LXXXII";        break;
                case 83	: res = "LXXXIII";       break;
                case 84	: res = "LXXXIV";        break;
                case 85	: res = "LXXXV";         break;
                case 86	: res = "LXXXVI";        break;
                case 87	: res = "LXXXVII";       break;
                case 88	: res = "LXXXVIII";      break;
                case 89	: res = "LXXXIX";        break;
                case 90	: res = "XC";            break;
                case 91	: res = "XCI";           break;
                case 92	: res = "XCII";          break;
                case 93	: res = "XCIII";         break;
                case 94	: res = "XCIV";          break;
                case 95	: res = "XCV";           break;
                case 96	: res = "XCVI";          break;
                case 97	: res = "XCVII";         break;
                case 98	: res = "XCVIII";        break;
                case 99	: res = "XCIX";          break;
                case 100 : res = "C";            break;
            }
            return res;
        }

    }


