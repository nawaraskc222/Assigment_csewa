package com.example.Assignment.Assignment.model;
import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String province;
    private String district;
    private String municipality;
    private String ward;
    private String tole;
    private String addressType;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    // Constructors, getters, and setters

    public Address() {
    }

    public Address(String province, String district, String municipality, String ward, String tole, String addressType) {
        this.province = province;
        this.district = district;
        this.municipality = municipality;
        this.ward = ward;
        this.tole = tole;
        this.addressType = addressType;
    }

 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getTole() {
        return tole;
    }

    public void setTole(String tole) {
        this.tole = tole;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}