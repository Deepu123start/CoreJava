package com.company.assignment8;

/**
 * Created by deept on 2/4/2017.
 */
import java.util.*;

public class HospitalDoctorAddress {

    public static void main(String[] args) {

        inputsmtd();

    }

    public static Hospital inputs(int docid, String docname,
                                  String specialization, String address1, String address2,
                                  String state, String street, int zipcode, String hospitalName) {
        Doctor d = new Doctor();
        d.setDocid(docid);
        d.setDocname(docname);
        d.setSpecialization(specialization);
        Address a = new Address();
        a.setAddress1(address1);
        a.setAddress2(address2);
        a.setState(state);
        a.setStreet(street);
        a.setZipcode(zipcode);

        Hospital h = new Hospital();
        h.setHospitalName(hospitalName);
        h.setHospitalAddress(a);
        h.setDoc(d);

        return h;

    }

    public static Hospital[] inputsmtd() {
        Hospital h = new Hospital();
        Doctor d = new Doctor();
        Address a = new Address();

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of hospitals");
        int n = scan.nextInt();
        Hospital[] h1 = new Hospital[n];
        String[] hosArray = new String[n];
        String[] streetnameArray = new String[n];
        String[] speciArray = new String[n];
        int[] adsArray = new int[n];
        ArrayList<String> a1 = new ArrayList<>();
        HashSet<Hospital> hs = new HashSet();
        HashSet<Hospital> hs1 = new HashSet();
        HashSet<Hospital> hs2 = new HashSet();
        HashSet<Hospital> hs3 = new HashSet();
        HashMap<Integer, Hospital> hm = new HashMap<>();
        //HashMap<String, Hospital> hm1 = new HashMap<>();

        System.out.println("enter the illness ");
        String y = scan.next();
        System.out.println("enter the specialization u need to list out hospitals ");
        String f = scan.next();
        System.out.println("enter the hospital name for which u need list of doctors");
        String e = scan.next();

        for (int i = 0; i < n; i++) {
            String hos = "";
            String streetname = "";
            int ads;

            System.out.println("enter the name of the hospital");
            String HospitalName = scan.next();
            h.setHospitalName(HospitalName);
            hos = HospitalName;
            hosArray[i] = hos;

            System.out.println("Enter Doctor id: ");
            int Docid = scan.nextInt();

            System.out.println("Enter the name of the doctor");
            String DocName = scan.next();

            System.out.println("Enter the specialization of the doctor");
            String specialization = scan.next();
            d.setSpecialization(specialization);

            System.out.println("Enter the address1 of the Street: ");
            String address1 = scan.next();

            System.out.println("Enter the address2 of the Street");
            String address2 = scan.next();

            System.out.println("Enter the street of the hospital");
            String street = scan.next();
            a.setStreet(street);
            streetname = street;
            streetnameArray[i] = streetname;

            System.out.println("Enter the state of the hospital");
            String state = scan.next();


            System.out.println("Enter the zipcode");
            int zipcode = scan.nextInt();
            a.setZipcode(zipcode);
            ads = zipcode;
            adsArray[i] = ads;

            Hospital h3 = inputs(Docid, DocName, specialization, address1,
                    address2, state, street, zipcode, HospitalName);
            h1[i] = h3;
            System.out.println(h3);

            if (y.equals(specialization)) {
                hs1.add(h1[i]);

            }
            if (e.equals(HospitalName)) {
                hs2.add(h1[i]);
            }
            if (f.equals(specialization)) {
                hs3.add(h1[i]);
            }
        }

        System.out.println("List of hospital details ");

        Hospital h2 = new Hospital();

        for (int i = 0; i < n; i++) {

            h2 = h1[i];
            hs.add(h1[i]);
            System.out.println(h2);

        }

        for (int l = 0; l < n; l++) {
            System.out.println(hosArray[l]);
            System.out.println(streetnameArray[l]);

            a1.add(hosArray[l]);
            a1.add(streetnameArray[l]);

            // hs.add(hosArray[l]); /*this can be used when u want to print only
            // hospital name*/

        }
        System.out.println("enter ur zipcode");
        int x = scan.nextInt();
        int diff;
        int[] diffArray = new int[n];
        System.out.println("*****Differences between the zipcodes******");
        for (int m = 0; m < n; m++) {
            diff = x - adsArray[m];
            System.out.println(diff);
            diffArray[m] = diff;
        }
        Arrays.sort(diffArray);
        System.out.println("*******Difference array*********");
        for (int p = 0; p < n; p++) {
            System.out.println(diffArray[p]);
            hm.put(diffArray[0], h1[p]);
        }

        // String Specialization="";

        // Declaring Arraylist
        System.out.println("*****printing original hospital name and address******");
        for (String z : a1) {

            System.out.println(z);
        }

        // Declaring Hashset
        System.out.println("******After removing duplicates******");
        for (Hospital name : hs) {
            System.out.println(name);
        }

        // Declaring HashMap
        Set<Integer> set = hm.keySet();
        System.out.println("*****nearest hospital*******");
        for (Integer s : set) {

            System.out.println(s + " value " + hm.get(s));
        }
        System.out.println("*******list of hospitals for ur illness********");
        for (Hospital name : hs1) {
            System.out.println(name);
        }
        System.out.println("***list of doctors in given hospital name*****");
        for (Hospital doc : hs2) {
            System.out.println(doc);
        }
        System.out.println("******list of hospital for ur specialization*****");
        for (Hospital spe : hs3) {
            System.out.println(spe);
        }

        return h1;
    }
}

class Hospital {

    String HospitalName;
    Doctor doc;
    Address hospitalAddress;

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Address getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(Address hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((HospitalName == null) ? 0 : HospitalName.hashCode());
        result = prime * result + ((doc == null) ? 0 : doc.hashCode());
        result = prime * result
                + ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hospital other = (Hospital) obj;
        if (HospitalName == null) {
            if (other.HospitalName != null)
                return false;
        } else if (!HospitalName.equals(other.HospitalName))
            return false;
        if (doc == null) {
            if (other.doc != null)
                return false;
        } else if (!doc.equals(other.doc))
            return false;
        if (hospitalAddress == null) {
            if (other.hospitalAddress != null)
                return false;
        } else if (!hospitalAddress.equals(other.hospitalAddress))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Hospital [HospitalName=" + HospitalName + ", doc=" + doc
                + ", hospitalAddress=" + hospitalAddress + "]";
    }

}

class Doctor {
    int docid;
    String docname;
    String specialization;

    public int getDocid() {
        return docid;
    }

    public void setDocid(int docid) {
        this.docid = docid;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + docid;
        result = prime * result + ((docname == null) ? 0 : docname.hashCode());
        result = prime * result
                + ((specialization == null) ? 0 : specialization.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Doctor other = (Doctor) obj;
        if (docid != other.docid)
            return false;
        if (docname == null) {
            if (other.docname != null)
                return false;
        } else if (!docname.equals(other.docname))
            return false;
        if (specialization == null) {
            if (other.specialization != null)
                return false;
        } else if (!specialization.equals(other.specialization))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Doctor [docid=" + docid + ", docname=" + docname
                + ", specialization=" + specialization + "]";
    }

}

class Address {

    String address1;
    String address2;
    String street;
    String state;
    int zipcode;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((address1 == null) ? 0 : address1.hashCode());
        result = prime * result
                + ((address2 == null) ? 0 : address2.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + zipcode;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (address1 == null) {
            if (other.address1 != null)
                return false;
        } else if (!address1.equals(other.address1))
            return false;
        if (address2 == null) {
            if (other.address2 != null)
                return false;
        } else if (!address2.equals(other.address2))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (zipcode != other.zipcode)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [address1=" + address1 + ", address2=" + address2
                + ", street=" + street + ", state=" + state + ", zipcode="
                + zipcode + "]";
    }

}
