class Patient {
    private static int idCounter = 1;
    private int patientID;
    private String name;
    private String conditionDescription;
    private int severity;

    public Patient(String name, String conditionDescription, int severity) {
        this.patientID = idCounter++;
        this.name = name;
        this.conditionDescription = conditionDescription;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }
}

class PriorityQueue {
    private Patient[] patients;
    private int size;

    public PriorityQueue(int capacity) {
        patients = new Patient[capacity];
        size = 0;
    }

    public void admitPatient(Patient patient) {
        if (size == patients.length) {
            System.out.println("Queue is full. Cannot admit more patients.");
            return;
        }

        patients[size] = patient;
        size++;
    }

    public Patient treatNextPatient() {
        if (size == 0) {
            System.out.println("No patients in the queue.");
            return null;
        }

        int minSeverity = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            if (patients[i].getSeverity() < minSeverity) {
                minSeverity = patients[i].getSeverity();
                minIndex = i;
            }
        }

        Patient nextPatient = patients[minIndex];

        for (int i = minIndex; i < size - 1; i++) {
            patients[i] = patients[i + 1];
        }
        size--;

        return nextPatient;
    }

    public Patient nextInLine() {
        if (size == 0) {
            System.out.println("No patients in the queue.");
            return null;
        }

        int minSeverity = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < size; i++) {
            if (patients[i].getSeverity() < minSeverity) {
                minSeverity = patients[i].getSeverity();
                minIndex = i;
            }
        }

        return patients[minIndex];
    }
}

public class Task5 {
    public static void main(String[] args) {
        PriorityQueue emergencyQueue = new PriorityQueue(10);

        Patient patient1 = new Patient("Jameel", "Fever", 3);
        Patient patient2 = new Patient("Kareem", "Injury", 2);
        Patient patient3 = new Patient("prem", "Malaria", 1);

        emergencyQueue.admitPatient(patient1);
        emergencyQueue.admitPatient(patient2);
        emergencyQueue.admitPatient(patient3);

        Patient nextPatient = emergencyQueue.treatNextPatient();
        if (nextPatient != null) {
            System.out.println("Treating patient: " + nextPatient.getName());
        }

        Patient nextInLine = emergencyQueue.nextInLine();
        if (nextInLine != null) {
            System.out.println("Next patient in line: " + nextInLine.getName());
        }
    }
}
