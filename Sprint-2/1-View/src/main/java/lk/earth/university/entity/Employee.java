package lk.earth.university.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "number")
    private String number;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "callingname")
    private String callingname;
    @Basic
    @Column(name = "photo")
    private byte[] photo;
    @Basic
    @Column(name = "dobirth")
    private Date dobirth;
    @Basic
    @Column(name = "nic")
    private String nic;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "mobile")
    private String mobile;
    @Basic
    @Column(name = "land")
    private String land;
    @Basic
    @Column(name = "doassignment")
    private Date doassignment;
    @Basic
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "gender_id", referencedColumnName = "id", nullable = false)
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "designation_id", referencedColumnName = "id", nullable = false)
    private Designation designation;
    @ManyToOne
    @JoinColumn(name = "employeestatus_id", referencedColumnName = "id", nullable = false)
    private Employeestatus employeestatus;
    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private Collection<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCallingname() {
        return callingname;
    }

    public void setCallingname(String callingname) {
        this.callingname = callingname;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Date getDobirth() {
        return dobirth;
    }

    public void setDobirth(Date dobirth) {
        this.dobirth = dobirth;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public Date getDoassignment() {
        return doassignment;
    }

    public void setDoassignment(Date doassignment) {
        this.doassignment = doassignment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(number, employee.number) && Objects.equals(fullname, employee.fullname) && Objects.equals(callingname, employee.callingname) && Arrays.equals(photo, employee.photo) && Objects.equals(dobirth, employee.dobirth) && Objects.equals(nic, employee.nic) && Objects.equals(address, employee.address) && Objects.equals(mobile, employee.mobile) && Objects.equals(land, employee.land) && Objects.equals(doassignment, employee.doassignment) && Objects.equals(description, employee.description);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, number, fullname, callingname, dobirth, nic, address, mobile, land, doassignment, description);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Employeestatus getEmployeestatus() {
        return employeestatus;
    }

    public void setEmployeestatus(Employeestatus employeestatus) {
        this.employeestatus = employeestatus;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
