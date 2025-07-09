package Lab1;

import java.util.*;

public class UniData {
    private String rank2024;
    private String rank2023;
    private String institutionName;
    private String location;
    private String classificationLocation;
    private String classificationSize;
    private String classificationFocus;
    private String classificationResearch;
    private String classificationStatus;
    private String academicReputationScore;
    private String academicReputationRank;
    private String employerReputationScore;
    private String employerReputationRank;
    private String facultyStudentScore;
    private String facultyStudentRank;
    private String citationsPerFacultyScore;
    private String citationsPerFacultyRank;
    private String internationalFacultyScore;
    private String internationalFacultyRank;
    private String internationalStudentsScore;
    private String internationalStudentsRank;
    private String internationalResearchNetworkScore;
    private String internationalResearchNetworkRank;
    private String employmentOutcomesScore;
    private String employmentOutcomesRank;
    private String sustainabilityScore;
    private String sustainabilityRank;
    private String overallScore;
    private String overallRank;

    public UniData(Vector<String> fields) {

        this.rank2024 = fields.get(0);
        this.rank2023 = fields.get(1);
        this.institutionName = fields.get(2);
        this.location = fields.get(3);
        this.classificationLocation = fields.get(4);
        this.classificationSize = fields.get(5);
        this.classificationFocus = fields.get(6);
        this.classificationResearch = fields.get(7);
        this.classificationStatus = fields.get(8);
        this.academicReputationScore = fields.get(9);
        this.academicReputationRank = fields.get(10);
        this.employerReputationScore = fields.get(11);
        this.employerReputationRank = fields.get(12);
        this.facultyStudentScore = fields.get(13);
        this.facultyStudentRank = fields.get(14);
        this.citationsPerFacultyScore = fields.get(15);
        this.citationsPerFacultyRank = fields.get(16);
        this.internationalFacultyScore = fields.get(17);
        this.internationalFacultyRank = fields.get(18);
        this.internationalStudentsScore = fields.get(19);
        this.internationalStudentsRank = fields.get(20);
        this.internationalResearchNetworkScore = fields.get(21);
        this.internationalResearchNetworkRank = fields.get(22);
        this.employmentOutcomesScore = fields.get(23);
        this.employmentOutcomesRank = fields.get(24);
        this.sustainabilityScore = fields.get(25);
        this.sustainabilityRank = fields.get(26);
        this.overallScore = fields.get(27);
    }


    public String getInstitutionName() {
        return institutionName;
    }
    @Override
public String toString() {
    return rank2024 + "," +
           rank2023 + "," +
           institutionName + "," +
           location + "," +
           classificationLocation + "," +
           classificationSize + "," +
           classificationFocus + "," +
           classificationResearch + "," +
           classificationStatus + "," +
           academicReputationScore + "," +
           academicReputationRank + "," +
           employerReputationScore + "," +
           employerReputationRank + "," +
           facultyStudentScore + "," +
           facultyStudentRank + "," +
           citationsPerFacultyScore + "," +
           citationsPerFacultyRank + "," +
           internationalFacultyScore + "," +
           internationalFacultyRank + "," +
           internationalStudentsScore + "," +
           internationalStudentsRank + "," +
           internationalResearchNetworkScore + "," +
           internationalResearchNetworkRank + "," +
           employmentOutcomesScore + "," +
           employmentOutcomesRank + "," +
           sustainabilityScore + "," +
           sustainabilityRank + "," +
           overallScore + "," +
           overallRank + "\n";
}


    
    
}