package com.springCore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private String empId;
    private List<String> mob;
    private Set<String> add;
    private Map<String,String> course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public List<String> getMob() {
        return mob;
    }

    public void setMob(List<String> mob) {
        this.mob = mob;
    }

    public Set<String> getAdd() {
        return add;
    }

    public void setAdd(Set<String> add) {
        this.add = add;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Emp(String name, String empId, List<String> mob, Set<String> add, Map<String, String> course) {
        this.name = name;
        this.empId = empId;
        this.mob = mob;
        this.add = add;
        this.course = course;
    }
    public  Emp(){
        super();
    }
}
