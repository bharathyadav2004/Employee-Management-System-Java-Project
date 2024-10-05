public class project{

    static int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
    static String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
    static String[] joinDate = {"01/04/2009", "23/08/2021", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
    static String[] designationCode = {"e", "c", "k", "r", "m", "e", "c"};
    static String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
    static double[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
    static double[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
    static double[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
    
    // Designation table 
    static String[] desigCode = {"e", "c", "k", "r", "m"};
    static String[] desigName = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
    static double[] da = {20000, 32000, 12000, 15000, 40000};  // Fixed DA for simplicity
    
    // Method to get designation name based on code
    static String getDesignation(String code) {
        for (int i = 0; i < desigCode.length; i++) {
            if (desigCode[i].equals(code)) {
                return desigName[i];
            }
        }
        return "Unknown";
    }
    
    // Method to get DA based on the designation code
    static double getDA(String code) {
        for (int i = 0; i < desigCode.length; i++) {
            if (desigCode[i].equals(code)) {
                return da[i];
            }
        }
        return 0.0;
    }
    
    // Method to calculate salary
    static double calculateSalary(double basic, double hra, double it, String desigCode) {
        double da = getDA(desigCode);
        return basic + hra + da - it;
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Project1 <EmpNo>");
            return;
        }
        
        int empId = Integer.parseInt(args[0]);
        boolean found = false;
        
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                found = true;
                System.out.println("EmpNo: " + empNo[i]);
                System.out.println("EmpName: " + empName[i]);
                System.out.println("Department: " + department[i]);
                System.out.println("Designation: " + getDesignation(designationCode[i]));
                System.out.println("Salary: " + calculateSalary(basic[i], hra[i], it[i], designationCode[i]));
                break;
            }
        }
        
        if (!found) {
            System.out.println("There is no employee with empId: " + empId);
        }
    }
}
