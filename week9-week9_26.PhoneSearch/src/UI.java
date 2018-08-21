import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UI {

    private Scanner scanner;
    private Phonebook phonebook;

    public UI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start(){
        this.phonebook = new Phonebook();

        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println("5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        while(true) {
            System.out.println("command:");
            String command = scanner.nextLine();

            // Massive if statement cause Java 1.6 doesnt support case select statements \_o_/
            if(command.equals( "1") ) {

                System.out.println("whose number");
                String addName = scanner.nextLine();
                System.out.println("number: ");
                String addNumber = scanner.nextLine();

                phonebook.addNumber(addName, addNumber);

            }else if(command.equals( "2")) {
                System.out.println("whose number");

                List<String> searchName = phonebook.getNumbers(scanner.nextLine());
                if (searchName != null) {
                    for(String s : searchName){
                        System.out.println(s);
                    }
                } else {
                    System.out.println("not found");
                }

            }else if(command.equals( "3")) {

                System.out.println("number: ");
                String searchNumber = scanner.nextLine();

                if(phonebook.getName(searchNumber)!=null){
                    System.out.println(phonebook.getName(searchNumber));
                }else {
                    System.out.println("not found");
                }

            }else if(command.equals( "4")) {

                System.out.println("whose address: ");
                String addAddressName = scanner.nextLine();

                System.out.println("street: ");
                String addStreet = scanner.nextLine();

                System.out.println("city: ");
                String addCity = scanner.nextLine();

                phonebook.addAddress(addAddressName, addStreet, addCity);

            }else if(command.equals( "5")) {

                System.out.println("whose information: ");
                String findInformationName = scanner.nextLine();

                List<String> results;

                results = phonebook.getAddress(findInformationName);
                if (results != null) {
                    if (results.size() != 0) {
                        System.out.println("street: " + results.get(0));
                        System.out.println("city: " + results.get(1));
                    } else {
                        System.out.println("address unknown");
                    }

                    if (phonebook.getNumbers(findInformationName).size() != 0) {
                        System.out.println("phone numbers: ");
                        for (String s : phonebook.getNumbers(findInformationName)) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("phone number not found");
                    }
                } else {
                    System.out.println("not found");
                }

            }else if(command.equals( "6")) {

                System.out.println("whose information: ");
                String removeName = scanner.nextLine();

                phonebook.remove(removeName);

            }else if(command.equals( "7")) {

                System.out.println("keyword (if empty, all listed): ");
                String criteria = scanner.nextLine();
                List<String> filteredResults = phonebook.filteredSearch(criteria);

                if(filteredResults.size() != 0) {
                    for (String s : filteredResults) {
                        System.out.println(s);
                        if(phonebook.getAddress(s).size() != 0){
                            System.out.println("address: " + phonebook.getAddress(s).get(0) + " " + phonebook.getAddress(s).get(1));
                        } else {
                            System.out.println("address unknown");
                        }

                        if (phonebook.getNumbers(s).size() != 0) {
                            System.out.println("phone numbers:");
                            for (String number : phonebook.getNumbers(s)) {
                                System.out.println(number);
                            }
                        } else {
                            System.out.println("phone number not found");
                        }

                    }
                } else {
                    System.out.println("keyword not found");
                }
            } else if(command.equals( "x")) {
                    break;
            }
        }

    }

}
