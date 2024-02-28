package week2;

class Hospital {
    // Instance variables
    String patientName;
    int patientid;
    // Static (class) variable
    static String DocName = "Dr. Murthy";

    void setHospital(String pN, int pId) {
        patientName = pN;
        patientid = pId;
    }

    String getPatientName() {
        return patientName;
    }

    int getPatientId() {
        return patientid;
    }
}

class DemoScopeofVariables {
    public static void main(String[] args) {
        // Local variable
        String hospitalName = "Apollo Hospital";
        Hospital patient1 = new Hospital();
        patient1.setHospital("Anita Joseph", 101);
        System.out.println("The patient " + patient1.getPatientName() + " with the Id " + patient1.getPatientId() +
                " is treated by " + Hospital.DocName + " at " + hospitalName + ".");
    }
}
